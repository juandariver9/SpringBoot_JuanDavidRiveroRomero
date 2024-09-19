package com.example.ExplicacionJPA.controller;

import com.example.ExplicacionJPA.model.Person;
import com.example.ExplicacionJPA.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    // Obtener todas las personas
    // localhost:8800/api/person con verbo GET
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    // Obtener a una persona por ID
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id).orElseThrow();
    }


    // Crear una Persona
    // localhost:8080/api/person con verbo POST
    // {
    //  "name" : "Andrés",
    //  "age"  : "25"
    // }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person){
        return personService.updatePerson(id,person);
    }
}
