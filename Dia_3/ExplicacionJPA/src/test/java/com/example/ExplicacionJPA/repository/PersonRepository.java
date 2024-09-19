package com.example.ExplicacionJPA.repository;

import com.example.ExplicacionJPA.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {




}
