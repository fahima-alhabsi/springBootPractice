package com.example.practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(path = "fahima")
    public String sayhi(){

        return "hi fahima alhabsi";
    }

}
