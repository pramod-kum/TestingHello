package com.gekkster.Testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {

    @GetMapping("/home1")
    public String home1(){
        return "Hi Pramod !!!!!";
    }
    @GetMapping("/home2")
    public String home2(){
        return "Hi How are You!!!!!";
    }
    @GetMapping("/home3")
    public String home3(){
        return "My Name is Pramod Kumar!!!";
    }
}
