package com.example.lab3.controlador;

import com.example.lab3.entidad.Arbitro;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ArbitroController {
    @GetMapping(value = "/lista")
    public String listar() {
        return "arbitro/lista";
    }
    @PostMapping("/guardar")
    public String guardar(Model model,
                          @RequestParam("id") Integer id,
                          @RequestParam("nombre") String nombre) {
        System.out.println("nombre recibido: " + nombre);
        System.out.println("id recibido: " + id);
        model.addAttribute("id",id);
        model.addAttribute("nombre",nombre);
        Arbitro p = new Arbitro();
        p.setNombre(nombre);
        model.addAttribute("persona",p);
        return "arbitro/datos";
    }
    @GetMapping("/crearform")
    public String crear() {
        return "arbitro/crear";
    }
}
