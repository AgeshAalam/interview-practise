package ecommerceapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Admin {

   @Id
   private String name;
   private String password;
}
