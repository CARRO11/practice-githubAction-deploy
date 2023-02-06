package com.codestates.practicegithubActiondeploy.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
