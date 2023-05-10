package com.example.practice.Repositories;

import com.example.practice.Models.Reviews;
import com.example.practice.Models.ShippingAddresses;
import com.example.practice.Service.ShipingAdressService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipingAdressRepository extends JpaRepository<ShippingAddresses, Integer> {
}
