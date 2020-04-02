package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCiApplication.class, args);
    }

    @RestController
    static class HelloController {

        @GetMapping("/hello/{name}")
        public String hello(@PathVariable String name) {
            return "hello ".concat(name);
        }

    }

}
