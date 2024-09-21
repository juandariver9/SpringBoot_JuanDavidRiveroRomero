package com.dia_4.app_demo.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dia_4.app_demo.domain.entity.Plato;

@Service
public interface PlatoService {
    void agregarPlato(Plato plato);
    void modificarPlato(Plato plato);
    List<Plato> listarPlatos();
    void eliminarPlato(int id);
}

