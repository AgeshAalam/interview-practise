package com.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);

    }
    /*@GetMapping("/welcome")
    public String thisMethod(){
        System.out.println("welcome to spring security");
        return "welcome to spring security";
    }*/
    }