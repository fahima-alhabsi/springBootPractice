package com.example.practice.Repositories;

import com.example.practice.Models.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

public interface InvoiceRepository extends JpaRepository <Invoices, Integer> {


}
