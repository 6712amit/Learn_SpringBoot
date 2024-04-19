package com.springboot_microserv_tut.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/help")
    public String hello() {
        return "Hello world!";
    }
}
