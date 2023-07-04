package com.example.Raghad.Entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    private int quantity;

    @Column(name = "update_at_date_time")
    private LocalDateTime updatedAtDateTime;

    public Stock() {

    }

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

    public Stock(Long id, Long productId, int quantity, LocalDateTime updatedAtDateTime) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.updatedAtDateTime = updatedAtDateTime;
    }

    public void setUpdatedAtDateTime(LocalDateTime updatedAtDateTime) {
        this.updatedAtDateTime = updatedAtDateTime;
    }
}
