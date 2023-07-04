package com.example.Raghad.Service;

import com.example.Raghad.Dto.ProductOrderDTO;
import com.example.Raghad.Entity.ProductOrder;
import com.example.Raghad.Repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductOrderService {
    private ProductOrderRepository productOrderRepository;

    @Autowired
    public ProductOrderService(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }
    public List<ProductOrderDTO> getAllProductOrders() {
        List<ProductOrder> productOrders = productOrderRepository.findAll();
        return productOrders.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public ProductOrderDTO getProductOrderById(Long id) {
        ProductOrder productOrder = productOrderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product order ID: " + id));

        return convertToDTO(productOrder);
    }

    public ProductOrderDTO createProductOrder(ProductOrderDTO productOrderDTO) {
        ProductOrder productOrder = convertToEntity(productOrderDTO);
        ProductOrder savedProductOrder = productOrderRepository.save(productOrder);
        return convertToDTO(savedProductOrder);
    }

    public ProductOrderDTO updateProductOrder(Long id, ProductOrderDTO productOrderDTO) {
        ProductOrder existingProductOrder = productOrderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product order ID: " + id));

        // Update the existing product order with the new data
        existingProductOrder.setQuantity(productOrderDTO.getQuantity());
        existingProductOrder.setPrice(productOrderDTO.getPrice());
        existingProductOrder.setVat(productOrderDTO.getVat());

        ProductOrder updatedProductOrder = productOrderRepository.save(existingProductOrder);
        return convertToDTO(updatedProductOrder);
    }

    public void deleteProductOrder(Long id) {
        ProductOrder existingProductOrder = productOrderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product order ID: " + id));

        productOrderRepository.delete(existingProductOrder);
    }


    private ProductOrderDTO convertToDTO(ProductOrder productOrder) {
        ProductOrderDTO productOrderDTO = new ProductOrderDTO();
        productOrderDTO.setId(productOrder.getId());
        productOrderDTO.setProductId(productOrder.getProduct().getId());
        productOrderDTO.setOrderId(productOrder.getOrder().getId());
        productOrderDTO.setQuantity(productOrder.getQuantity());
        productOrderDTO.setPrice(productOrder.getPrice());
        productOrderDTO.setVat(productOrder.getVat());
        return productOrderDTO;
    }

    private ProductOrder convertToEntity(ProductOrderDTO productOrderDTO) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setQuantity(productOrderDTO.getQuantity());
        productOrder.setPrice(productOrderDTO.getPrice());
        productOrder.setVat(productOrderDTO.getVat());
        // Set product and order by retrieving them from the database based on the IDs
        // ...
        return productOrder;
    }
}
