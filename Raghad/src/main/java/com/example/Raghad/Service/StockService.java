package com.example.Raghad.Service;

import com.example.Raghad.Dto.StockDTO;
import com.example.Raghad.Entity.Stock;
import com.example.Raghad.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {
    private StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public StockDTO getStockById(Long id) {
        Stock stock = stockRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid stock ID: " + id));

        return convertToDTO(stock);
    }

    public StockDTO createStock(StockDTO stockDTO) {
        Stock stock = convertToEntity(stockDTO);
        Stock savedStock = stockRepository.save(stock);
        return convertToDTO(savedStock);
    }

    public StockDTO updateStock(Long id, StockDTO stockDTO) {
        Stock existingStock = stockRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid stock ID: " + id));

        // Update the existing stock with the new data
        existingStock.setProductId(stockDTO.getProductId());
        existingStock.setQuantity(stockDTO.getQuantity());
        existingStock.setUpdatedAtDateTime(stockDTO.getUpdatedAtDateTime());

        Stock updatedStock = stockRepository.save(existingStock);
        return convertToDTO(updatedStock);
    }

    public void deleteStock(Long id) {
        Stock existingStock = stockRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid stock ID: " + id));

        stockRepository.delete(existingStock);
    }


    private StockDTO convertToDTO(Stock stock) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(stock.getId());
        stockDTO.setProductId(stock.getProductId());
        stockDTO.setQuantity(stock.getQuantity());
        stockDTO.setUpdatedAtDateTime(stock.getUpdatedAtDateTime());
        return stockDTO;
    }

    private Stock convertToEntity(StockDTO stockDTO) {
        Stock stock = new Stock();
        stock.setProductId(stockDTO.getProductId());
        stock.setQuantity(stockDTO.getQuantity());
        stock.setUpdatedAtDateTime(stockDTO.getUpdatedAtDateTime());
        return stock;
    }
    public List<StockDTO> getAllStocks() {
        List<Stock> stocks = stockRepository.findAll();
        return stocks.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
