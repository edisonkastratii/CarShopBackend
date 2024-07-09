package com.edison.carshop.controller;

import com.edison.carshop.entity.Vehicle;
import com.edison.carshop.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VehicleController {
    private VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/")
    public List<Vehicle> findAll(){
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Vehicle> findById(@PathVariable int id){
        return vehicleService.findById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
    }

    @PutMapping("/")
    public void update(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        vehicleService.deleteById(id);
    }
}
