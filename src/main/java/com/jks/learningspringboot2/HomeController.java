package com.jks.learningspringboot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMappingg
    p
    public String greeting(@RequestParam(required = false, defaultValue = "") String name){
        return name.equals("") ? "Hey!" : "Hey, " + name + "!";
    }
}
