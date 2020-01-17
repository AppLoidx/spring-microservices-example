package com.apploidxxx.clientforeureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arthur Kupriyanov
 */
@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public String sayHello(){
        return "Hello, dude!";
    }

}
