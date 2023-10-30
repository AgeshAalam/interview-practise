package ecommerceapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class User {

   @Id
   private String userId;
   private String userName;
   private String password;
}
