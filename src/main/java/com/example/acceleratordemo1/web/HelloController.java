package com.example.acceleratordemo1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/say")
    public String hello(){
        return "Hello spring - tanzu";
    }
}