package com.br.fatecrl.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dizeres")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayhello(){
        return "Hello World";
    }
}

