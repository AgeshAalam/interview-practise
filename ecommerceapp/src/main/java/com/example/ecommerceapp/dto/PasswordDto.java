package com.example.sportyshoes.dto;

import lombok.*;

@Data
public class PasswordDto {
   private String oldPassword;
   private String newPassword;
   private String confirmPassword;
}
