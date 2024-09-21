package com.dia_4.app_demo.infrastructure.controllers;

import org.springframework.web.bind.annotation.*;

import com.dia_4.app_demo.application.services.PlatoService;
import com.dia_4.app_demo.domain.entity.Plato;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    private final PlatoService platoService;

    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public List<Plato> listarPlatos() {
        return platoService.listarPlatos();
    }

    @PostMapping
    public void agregarPlato(@RequestBody Plato plato) {
        platoService.agregarPlato(plato);
    }

    @PutMapping
    public void modificarPlato(@RequestBody Plato plato) {
        platoService.modificarPlato(plato);
    }

    @DeleteMapping("/{id}")
    public void eliminarPlato(@PathVariable int id) {
        platoService.eliminarPlato(id);
    }
}
