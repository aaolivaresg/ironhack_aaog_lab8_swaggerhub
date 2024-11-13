package com.ironhack.ecomerce;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/test")
    public void test() {
        System.out.println("Hello World");
    }
}
