package com.example.sportyshoes.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

   @Id
   private Integer productId;
   private String productName;
   private Double msrp;
   private Integer quantityInStock;
   private String productVendor;
}
