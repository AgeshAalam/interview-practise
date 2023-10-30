package com.example.sportyshoes.controller;

import com.example.sportyshoes.exception.*;
import com.example.sportyshoes.model.*;
import com.example.sportyshoes.service.*;
import com.sun.istack.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/order")
public class OrderController {

   @Autowired
   private OrderService service;

   @GetMapping("/all")
   public List<Order> getOrders(@NotNull @RequestParam Map<String, String> orderMap)
           throws OrderDetailsMisMatchException {
      return service.getOrdersByKeyAndSorting(orderMap);
   }
}
