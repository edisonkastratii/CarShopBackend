package com.edison.carshop.service;

import com.edison.carshop.entity.Vehicle;
import com.edison.carshop.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
          this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> findById(int id){
        return vehicleRepository.findById(id);
    }

    public void save(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public void deleteById(int id){
        vehicleRepository.deleteById(id);
    }
}
