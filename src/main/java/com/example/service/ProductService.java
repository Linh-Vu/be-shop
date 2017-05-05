package com.example.service;

import com.example.dto.ProductDto;

import java.util.List;

/**
 * Created by linhv on 5/5/2017.
 */
public interface ProductService {
    void createProduct(ProductDto productDto);

    List<ProductDto> getAllProduct();

    void updateProduct(ProductDto productDto);

    void deleteProduct(long productId);
}
