package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/tareas")
public class Frases {

    private final list<String> frases = new ArrayList<>();

    @GetMapping
    public list<String> getAllFrases() {
        return frases;
    }

    @PostMapping
    public list<String>

}
