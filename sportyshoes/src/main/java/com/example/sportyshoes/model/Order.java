package ecommerceapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@Entity
public class Order {

   @Id
   private Integer orderId;
   private Integer productId;
   private String userId;
   private LocalDateTime OrderDate;
   private Integer productQuantity;

}
