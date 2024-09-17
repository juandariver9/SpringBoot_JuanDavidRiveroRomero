package com.example.demo;

import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private VehicleService vehicleService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        vehicleService.save(new Vehicle(null, "Totoya", "Corolla", 2021));
        vehicleService.save(new Vehicle(null, "Honda", "Civic", 2020));
        vehicleService.save(new Vehicle(null, "Ford", "Mustang", 2022));
        vehicleService.save(new Vehicle(null, "Chevrolet", "Malibu", 2019));
    }
}
