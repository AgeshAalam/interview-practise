package com.example.sportyshoes.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

   @Id
   private String userId;
   private String userName;
   private String password;
}
