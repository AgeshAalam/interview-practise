package com.example.sportyshoes.repository;

import com.example.sportyshoes.model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;


public interface ProductRepo extends JpaRepository<Product, Integer> {

   List<Product> findByProductNameContaining(String productName);
}
