package com.heiden.spring.consulserviceserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class HelloController {


    @GetMapping(path = "/say")
    public String sayHello(){
        return "Hello world";
    }
}
