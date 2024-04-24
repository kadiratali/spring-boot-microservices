package com.katali.orderservice;

import org.springframework.boot.SpringApplication;

public class TestOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(OrderServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
