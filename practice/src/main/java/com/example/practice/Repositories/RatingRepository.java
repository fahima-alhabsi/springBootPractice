package com.example.practice.Repositories;

import com.example.practice.Models.Products;
import com.example.practice.Models.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Ratings, Integer> {
}
