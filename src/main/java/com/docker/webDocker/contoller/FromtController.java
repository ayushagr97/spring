package com.docker.webDocker.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class FromtController {

    @GetMapping
    public String getWeb(){
        return "docker hub publi mjn sh";
    }

}
