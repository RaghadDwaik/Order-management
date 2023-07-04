package com.example.Raghad.Entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    public Order(Long id, Long customerId, LocalDateTime orderAtDateTime) {
        this.id = id;
        this.customerId = customerId;
        this.orderAtDateTime = orderAtDateTime;
    }

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getOrderAtDateTime() {
        return orderAtDateTime;
    }

    public void setOrderAtDateTime(LocalDateTime orderAtDateTime) {
        this.orderAtDateTime = orderAtDateTime;
    }

    private LocalDateTime orderAtDateTime;


}
