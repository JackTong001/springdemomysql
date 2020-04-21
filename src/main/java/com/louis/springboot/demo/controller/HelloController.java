package com.louis.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
    @GetMapping("/helloDev")
    public String helloDev(){
       System.out.println("123devchange");

        return "Hello DEV";
    }
}
