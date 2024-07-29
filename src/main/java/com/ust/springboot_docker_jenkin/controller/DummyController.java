package com.ust.springboot_docker_jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hi")
public class DummyController {
    @GetMapping
    public String helloWorld() {
        return "Hello World from Spring Boot Dockerized Jenkins!";
    }
}
