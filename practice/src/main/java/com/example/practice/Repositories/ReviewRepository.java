package com.example.practice.Repositories;

import com.example.practice.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Reviews, Integer> {
}
