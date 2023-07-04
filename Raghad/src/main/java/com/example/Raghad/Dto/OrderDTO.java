package com.example.Raghad.Dto;

import java.time.LocalDateTime;

public class OrderDTO {
    private Long id;
    private Long customerId;

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
