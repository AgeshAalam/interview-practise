package com.example.sportyshoes.repository;

import com.example.sportyshoes.model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;


public interface OrderRepo extends JpaRepository<Order, Integer> {

   List<Order> findByUserId(String userId);

   List<Order> findByProductId(Integer productId);
}
