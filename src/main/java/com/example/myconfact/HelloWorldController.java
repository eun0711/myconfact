package com.example.myconfact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/api/helloworld")
    public String helloWorld(){
        return "HelloWorld";
    }
}
