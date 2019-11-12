package com.sample.profileapi.profileapi1;

import net.cake.apiwatch.spring.controllers.AutoLoggable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    @AutoLoggable(isLogArgs = false, isLogExecutionTime = true)
    public String getHome(){
        return "sadil";
    }
}
