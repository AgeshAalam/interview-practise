package com.example.sportyshoes.controller;


import com.example.sportyshoes.exception.*;
import com.example.sportyshoes.model.*;
import com.example.sportyshoes.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductController {
   @Autowired
   private ProductService service;

   @Autowired
   private OrderService orderService;

   @GetMapping("/all")
   @ResponseStatus(HttpStatus.OK)
   public List<Product> getAllProducts() {
      return service.getAllProduts();
   }

   @GetMapping("/search")
   @ResponseStatus(HttpStatus.OK)
   public List<Product> searchByProductName(@RequestParam String productName)
           throws ProductDetailsNotFoundException {
      return service.getByProductName(productName);
   }

   @GetMapping("/search/{id}")
   @ResponseStatus(HttpStatus.OK)
   public Product searchByProductId(@PathVariable Integer id) throws ProductDetailsNotFoundException {
      return service.getByProductId(id);
   }

   @PostMapping("/add")
   @ResponseStatus(HttpStatus.CREATED)
   public String addProduct(@RequestBody Product product) {
      return service.createProduct(product);
   }

   @PatchMapping("/{productId}/update/name")
   @ResponseStatus(HttpStatus.CREATED)
   public String updateProductName(@PathVariable Integer productId, @RequestParam String productName) throws ProductDetailsNotFoundException {
      return service.updatProductName(productId, productName);
   }

   @PatchMapping("/{productId}/update/msrp")
   @ResponseStatus(HttpStatus.CREATED)
   public String updateProductPrice(@PathVariable Integer productId, @RequestParam Double msrp) throws ProductDetailsNotFoundException {
      return service.updatProductMsrp(productId, msrp);
   }

   @PatchMapping("/{productId}/update/quantity")
   @ResponseStatus(HttpStatus.CREATED)
   public String updateProductQuantity(@PathVariable Integer productId, @RequestParam Integer quantity) throws ProductDetailsNotFoundException {
      return service.updateProductQuantity(productId, quantity);
   }

   @PatchMapping("/{productId}/update/vendor")
   @ResponseStatus(HttpStatus.CREATED)
   public String updateProductVendor(@PathVariable Integer productId, @RequestParam String vendor) throws ProductDetailsNotFoundException {
      return service.updateProductVendor(productId, vendor);
   }

   @DeleteMapping("/{id}/delete")
   @ResponseStatus(HttpStatus.OK)
   public String deleteProduct(@PathVariable Integer id) {
      return service.deleteProductById(id);
   }

   @GetMapping("/{productId}/order/all")
   @ResponseStatus(HttpStatus.OK)
   public List<Order> getOrdersByProductId(@PathVariable Integer productId) {
      return orderService.getOrderbyProductId(productId);
   }

}
