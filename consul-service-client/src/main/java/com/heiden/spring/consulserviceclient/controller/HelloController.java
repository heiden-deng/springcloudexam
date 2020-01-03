package com.heiden.spring.consulserviceclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/sayHello")
    public String sayHello(){
        return restTemplate.getForObject("http://consul-service-server/test/say",String.class);
    }
}
