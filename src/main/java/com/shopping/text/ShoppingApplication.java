package com.shopping.text;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.shopping.text")
@EntityScan(basePackages = "com.shopping.text")
public class ShoppingApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }
}
