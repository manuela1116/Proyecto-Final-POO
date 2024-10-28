package com.simulador.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.simulador.demo", "com.simulador.controller"})
public class ParkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkApplication.class, args);
    }

}