package com.dia_4.app_demo.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dia_4.app_demo.domain.entity.Plato;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Integer> {


}
