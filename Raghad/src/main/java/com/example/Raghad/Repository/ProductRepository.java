package com.example.Raghad.Repository;

import com.example.Raghad.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom queries can be defined here if needed
}
