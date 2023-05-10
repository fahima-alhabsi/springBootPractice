package com.example.practice.Repositories;

import com.example.practice.Service.ShipingAdressService;
import com.example.practice.Service.ShipingCartService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipingCartRepository extends JpaRepository<ShipingCartService, Integer> {
}
