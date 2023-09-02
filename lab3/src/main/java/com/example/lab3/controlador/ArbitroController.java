package com.example.lab3.controlador;

import org.springframework.web.bind.annotation.GetMapping;

public class ArbitroController {
    @GetMapping(value = "/lista")
    public String listar() {
        return "lista";
    }
}
