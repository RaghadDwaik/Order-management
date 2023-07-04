package com.example.Raghad.Repository;

import com.example.Raghad.Entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    // Additional custom queries can be defined here if needed
}
