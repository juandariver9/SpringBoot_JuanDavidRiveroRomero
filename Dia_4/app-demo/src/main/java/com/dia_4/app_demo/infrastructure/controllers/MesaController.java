package com.dia_4.app_demo.infrastructure.controllers;

import org.springframework.web.bind.annotation.*;
import com.dia_4.app_demo.application.services.MesaService;
import com.dia_4.app_demo.domain.entity.Mesa;

import java.util.List;

@RestController
@RequestMapping("/mesas")
public class MesaController {
    private final MesaService mesaService;

    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    // Listar todas las mesas
    @GetMapping
    public List<Mesa> listarMesas() {
        return mesaService.listarMesas();
    }

    // Agregar una nueva mesa
    @PostMapping
    public void agregarMesa(@RequestBody Mesa mesa) {
        mesaService.agregarMesa(mesa);
    }

    // Modificar el estado de una mesa
    @PutMapping("/{id}")
    public void modificarMesa(@PathVariable Long id, @RequestBody Mesa mesa) {
        mesa.setId(id); // Asegúrate de que el ID se establece correctamente
        mesaService.modificarMesa(mesa);
    }

    // Eliminar una mesa por ID
    @DeleteMapping("/{id}")
    public void eliminarMesa(@PathVariable int id) {
        mesaService.eliminarMesa(id);
    }
}
