package com.edison.carshop.repository;

import com.edison.carshop.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
