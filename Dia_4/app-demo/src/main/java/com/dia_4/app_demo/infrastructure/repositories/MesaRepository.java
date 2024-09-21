package com.dia_4.app_demo.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dia_4.app_demo.domain.entity.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Integer> {

}
