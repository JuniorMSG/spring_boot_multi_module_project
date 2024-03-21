package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example")
public class BtoCApplication {
    public static void main(String[] args) {
        SpringApplication.run(BtoCApplication.class);
    }
}