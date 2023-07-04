package com.example.Raghad.Controller;

import com.example.Raghad.Dto.ProductOrderDTO;
import com.example.Raghad.Service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-orders")
public class ProductOrderController {
    private ProductOrderService productOrderService;

    @Autowired
    public ProductOrderController(ProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductOrderDTO> getProductOrderById(@PathVariable Long id) {
        ProductOrderDTO productOrderDTO = productOrderService.getProductOrderById(id);
        return ResponseEntity.ok(productOrderDTO);
    }

    @PostMapping
    public ResponseEntity<ProductOrderDTO> createProductOrder(@RequestBody ProductOrderDTO productOrderDTO) {
        ProductOrderDTO createdProductOrder = productOrderService.createProductOrder(productOrderDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProductOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductOrderDTO> updateProductOrder(@PathVariable Long id, @RequestBody ProductOrderDTO productOrderDTO) {
        ProductOrderDTO updatedProductOrder = productOrderService.updateProductOrder(id, productOrderDTO);
        return ResponseEntity.ok(updatedProductOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductOrder(@PathVariable Long id) {
        productOrderService.deleteProductOrder(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ProductOrderDTO>> getAllProductOrders() {
        List<ProductOrderDTO> productOrderList = productOrderService.getAllProductOrders();
        return ResponseEntity.ok(productOrderList);
    }
}
