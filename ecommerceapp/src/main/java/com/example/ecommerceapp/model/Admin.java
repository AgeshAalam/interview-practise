package com.example.sportyshoes.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

   @Id
   private String name;
   private String password;
}
