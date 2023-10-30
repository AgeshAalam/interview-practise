package com.example.sportyshoes.controller;

import com.example.sportyshoes.dto.*;
import com.example.sportyshoes.exception.*;
import com.example.sportyshoes.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

   @Autowired
   private AdminService service;

   /*@PostMapping("/signin")
   @ResponseStatus(HttpStatus.CREATED)
   public String signIn(@RequestBody AdminLoginDto adminLoginDto) throws InvalidUserDetailsException {
      return service.signIn(adminLoginDto);
   }*/

   @PostMapping("{adminName}/updatepassword")
   public String updatePassword(@PathVariable String adminName,
                                @RequestBody PasswordDto passwordDto)
           throws InvalidAdminDetailsException {
      return service.updatePassword(adminName, passwordDto);
   }

}
