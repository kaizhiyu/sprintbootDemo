package com.example.springboot_demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/dida/{str}")
    public String dida(@PathVariable String str) {

        System.out.println("print dida....");

        if ("1".equals(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        switch (str) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            case "7":
                System.out.println("7");
                break;
            default:
                System.out.println("O");
                break;
        }

        return "dida to SpringBoot!!!";
    }

}
