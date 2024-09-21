package com.dia_4.app_demo.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dia_4.app_demo.domain.entity.Mesa;
import com.dia_4.app_demo.infrastructure.repositories.MesaRepository;

@Service
public class MesaServiceImpl implements MesaService {
    private final MesaRepository mesaRepository;

    public MesaServiceImpl(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    @Override
    public void agregarMesa(Mesa mesa) {
        mesaRepository.save(mesa);
    }

    @Override
    public void modificarMesa(Mesa mesa) {
        mesaRepository.save(mesa);
    }

    @Override
    public List<Mesa> listarMesas() {
        return mesaRepository.findAll();
    }

    @Override
    public void eliminarMesa(int id) {
        mesaRepository.deleteById(id);
    }
}
