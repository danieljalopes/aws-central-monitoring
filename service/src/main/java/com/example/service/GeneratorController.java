package com.example.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/generator")
public class GeneratorController {

    @GetMapping("/start")
    public String startNewGenerator(){

    }
}
