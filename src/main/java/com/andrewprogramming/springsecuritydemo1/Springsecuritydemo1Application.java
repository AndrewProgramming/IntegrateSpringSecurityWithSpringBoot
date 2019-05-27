package com.andrewprogramming.springsecuritydemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:spring-config.xml")
@MapperScan(value = {"com.andrewprogramming.springsecuritydemo1.dao"})
@SpringBootApplication
public class Springsecuritydemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springsecuritydemo1Application.class, args);
    }

}
