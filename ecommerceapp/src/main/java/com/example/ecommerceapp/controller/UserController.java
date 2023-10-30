package com.example.sportyshoes.controller;


import com.example.sportyshoes.dto.*;
import com.example.sportyshoes.exception.*;
import com.example.sportyshoes.model.*;
import com.example.sportyshoes.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserService service;

   @Autowired
   private OrderService orderService;

   @PostMapping("/signup")
   @ResponseStatus(HttpStatus.CREATED)
   public String addUser(@RequestBody User user) throws InvalidUserDetailsException {
      return service.addUser(user);
   }

   @PostMapping("/signin")
   @ResponseStatus(HttpStatus.CREATED)
   public Boolean signIn(@RequestBody UserLoginDto userDto) throws InvalidUserDetailsException {
      return service.signInUser(userDto);
   }

   @GetMapping("/all")
   @ResponseStatus(HttpStatus.OK)
   public List<User> getAllUsers() throws InvalidUserDetailsException {
      return service.getUsers();
   }

   @GetMapping("/{userId}")
   @ResponseStatus(HttpStatus.OK)
   public User getUserByUserId(@PathVariable String userId) throws InvalidUserDetailsException {
      return service.getUser(userId);
   }

   @GetMapping("/search")
   @ResponseStatus(HttpStatus.OK)
   public User getUserByUserName(@RequestParam String userName) throws InvalidUserDetailsException {
      return service.getUserByUserName(userName);
   }


   @PatchMapping("/{userId}/update/username")
   @ResponseStatus(HttpStatus.CREATED)
   public String updateUserName(@PathVariable String userId,
                                @RequestParam String updatedUserName) throws InvalidUserDetailsException {
      return service.updateUserName(userId, updatedUserName);
   }

   @PatchMapping("/{userId}/update/password")
   @ResponseStatus(HttpStatus.CREATED)
   public String updateUserPassword(@PathVariable String userId,
                                    @RequestBody PasswordDto passwordDto)
           throws InvalidUserDetailsException {
      return service.updatePassword(userId, passwordDto);
   }

   @GetMapping("/user/{userId}/order/all")
   @ResponseStatus(HttpStatus.OK)
   public List<Order> getOrdersByUserId(@PathVariable String userId) {
      return orderService.getOrderbyUserId(userId);
   }
}
