package com.example.sportyshoes.repository;

import com.example.sportyshoes.model.*;
import org.springframework.data.jpa.repository.*;


public interface UserRepo extends JpaRepository<User, Integer> {

   Boolean existsByUserId(String userId);

   User findByUserId(String userId);

   User findByUserName(String userName);
}
