package com.tfc.ordermanagement.dto;

import com.tfc.ordermanagement.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
   private Customer customerID;
   //private Product productId;
//private Date date_id;
   private Integer demand;
}
