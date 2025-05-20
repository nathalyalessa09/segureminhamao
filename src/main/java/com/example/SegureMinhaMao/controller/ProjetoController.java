package com.example.SegureMinhaMao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    public String index(Model model){
        return "categorias/index";
    }
}
