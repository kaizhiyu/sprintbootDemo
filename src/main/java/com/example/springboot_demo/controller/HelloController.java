package com.example.springboot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("print hello....");
        return "Welcome to SpringBoot!!!";
    }

    @RequestMapping("/byte")
    public String bytebyte() {
        System.out.println("print byte....");
        return "byte to SpringBoot!!!";
    }

    @RequestMapping("/dida")
    public String dida() {
        System.out.println("print dida....");
        return "dida to SpringBoot!!!";
    }

}
