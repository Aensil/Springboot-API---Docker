package com.uptc.frw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    public String getPing(){
        return "<h1>Hi B</h1>";
    }
}
