package ecommerceapp.service;

import ecommerceapp.dto.PasswordDto;
import ecommerceapp.exception.InvalidAdminDetailsException;
import ecommerceapp.model.Admin;
import ecommerceapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
   @Autowired
   private AdminRepository repository;

   public String updatePassword(String adminId, PasswordDto passwordDto) throws InvalidAdminDetailsException {
      if (!passwordDto.getNewPassword().equals(passwordDto.getConfirmPassword())) {
         throw new InvalidAdminDetailsException("Password and Confirm password should match!");
      }

      Admin admin = getAdmin(adminId);
      if (!admin.getPassword().equals(passwordDto.getOldPassword())) {
         throw new InvalidAdminDetailsException("Password incorrect, Please verify!!!");
      }
      admin.setPassword(passwordDto.getNewPassword());
      repository.save(admin);
      return "Password updated successfully";
   }

   private Admin getAdmin(String adminId) throws InvalidAdminDetailsException {
      return Optional.ofNullable(repository.findByName(adminId))
              .orElseThrow(() ->
                      new InvalidAdminDetailsException("No details Exists with Admin Id : " + adminId));
   }

}
