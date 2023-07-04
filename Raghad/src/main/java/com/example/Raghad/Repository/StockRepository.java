package com.example.Raghad.Repository;

import com.example.Raghad.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    // Additional custom queries can be defined here if needed
}
