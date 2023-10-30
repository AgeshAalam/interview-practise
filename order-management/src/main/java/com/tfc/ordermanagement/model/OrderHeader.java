package com.tfc.ordermanagement.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
private int order_id;
   @ManyToOne
   private Customer customerId;
private int quantity;
private String status;
private LocalDate create_date;
private LocalDate delivery_date;
private int total_price;
private int date_id;
@OneToMany(cascade = CascadeType.ALL)
private List<OrderLineItems> orderLineItems;
}
