package com.dia_4.app_demo.application.services;

import java.util.List;
import com.dia_4.app_demo.domain.entity.Mesa;

public interface MesaService {
    void agregarMesa(Mesa mesa);
    void modificarMesa(Mesa mesa);
    List<Mesa> listarMesas();
    void eliminarMesa(int id);
}
