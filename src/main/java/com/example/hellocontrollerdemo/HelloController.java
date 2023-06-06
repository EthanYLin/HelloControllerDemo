package com.example.hellocontrollerdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public String hello() {
        Date nowTime = new Date();
        return "Hello, world! " + nowTime;
    }
}
