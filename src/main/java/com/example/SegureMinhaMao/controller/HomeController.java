package com.example.SegureMinhaMao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello/")
public class HomeController {


    @GetMapping("world/")
    public String home(Model model) {
        return "home";
    }
}
