package com.example.practice.Repositories;

import com.example.practice.Models.Orders;
import com.example.practice.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
