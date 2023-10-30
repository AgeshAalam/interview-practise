package ecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

   @Autowired
   private A service;

   @PostMapping("{adminName}/updatepassword")
   public String updatePassword(@PathVariable String adminName,
                                @RequestBody PasswordDto passwordDto)
           throws InvalidAdminDetailsException {
      return service.updatePassword(adminName, passwordDto);
   }

}
