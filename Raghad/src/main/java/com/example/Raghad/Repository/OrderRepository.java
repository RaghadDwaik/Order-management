package com.example.Raghad.Repository;

import com.example.Raghad.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional custom queries can be defined here if needed
}
