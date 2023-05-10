package com.example.practice.Repositories;

import com.example.practice.Models.Invoices;
import com.example.practice.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
