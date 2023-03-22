package com.ehm.jwtsecurity.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {


    @PostMapping("/home")
    public String home(){

        return "Bem vindo a tela home";

    }


}
