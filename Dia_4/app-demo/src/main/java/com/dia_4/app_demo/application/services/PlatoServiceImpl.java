package com.dia_4.app_demo.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dia_4.app_demo.domain.entity.Plato;
import com.dia_4.app_demo.infrastructure.repositories.PlatoRepository;



@Service
public class PlatoServiceImpl implements PlatoService {
    private final PlatoRepository platoRepository;

    public PlatoServiceImpl(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    @Override
    public void agregarPlato(Plato plato) {
        platoRepository.save(plato);
    }

    @Override
    public void modificarPlato(Plato plato) {
        platoRepository.save(plato); // save sirve para insertar y actualizar
    }    

    @Override
    public List<Plato> listarPlatos() {
        return platoRepository.findAll();
    }

    @Override
    public void eliminarPlato(int id) {
        platoRepository.deleteById(id);
    }
    
}

