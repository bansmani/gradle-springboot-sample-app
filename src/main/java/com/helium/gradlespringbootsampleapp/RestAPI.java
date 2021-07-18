package com.helium.gradlespringbootsampleapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    @GetMapping("/")
    public String hello(){
        return "Hello Helium";
    }
}
