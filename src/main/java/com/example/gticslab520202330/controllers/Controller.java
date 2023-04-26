package com.example.gticslab520202330.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.processing.Generated;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String vistaInicial(){
        return "recursoshumanos";
    }
}
