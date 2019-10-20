package com.flavia_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FlaviaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlaviaApiApplication.class, args);
    }

    @RestController
    class Teste {

        @GetMapping
        public String hello () {
            return "Fale com a Flavinha";
        }
    }

}