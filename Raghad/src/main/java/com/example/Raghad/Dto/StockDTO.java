package com.example.Raghad.Dto;

import java.time.LocalDateTime;

public class StockDTO {
    private Long id;
    private Long productId;
    private int quantity;

    public StockDTO(){

    }
    public StockDTO(Long id, Long productId, int quantity, LocalDateTime updatedAtDateTime) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.updatedAtDateTime = updatedAtDateTime;
    }

    private LocalDateTime updatedAtDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getUpdatedAtDateTime() {
        return updatedAtDateTime;
    }

    public void setUpdatedAtDateTime(LocalDateTime updatedAtDateTime) {
        this.updatedAtDateTime = updatedAtDateTime;
    }
}
