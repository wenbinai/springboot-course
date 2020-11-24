package edu.nefu.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map getHello() {
        return Map.of("username", "hello");
    }
}
