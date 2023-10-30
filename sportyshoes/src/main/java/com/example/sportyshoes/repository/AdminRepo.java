package com.example.sportyshoes.repository;

import com.example.sportyshoes.model.*;
import org.springframework.data.jpa.repository.*;

public interface AdminRepo extends JpaRepository<Admin, String> {

Admin findByName(String adminId);
}
