package com.example.demo.service;

import com.example.demo.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class VehicleService {
    private List<Vehicle> vehicles = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong();

    public List<Vehicle> findAll() {
        return vehicles;
    }

    public Optional<Vehicle> findById(Long id) {
        return vehicles.stream().filter(vehicle -> vehicle.getId().equals(id)).findFirst();
    }

    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() == null) {
            vehicle.setId(idCounter.incrementAndGet());
        }
        vehicles.removeIf(v -> v.getId().equals(vehicle.getId()));
        vehicles.add(vehicle);
        return vehicle;
    }

    public void deleteById(Long id) {
        vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
    }
}
