package com.andrewprogramming.springsecuritydemo1.controller;

import com.andrewprogramming.springsecuritydemo1.model.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/home")
    public ResultMap adminHomePage() {
        return new ResultMap().message("Successfully Login The Admin page!");
    }
}
