package com.example.service;

import com.example.dto.ProductDto;
import com.example.entity.Product;
import com.example.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linhv on 5/5/2017.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(ProductDto productDto) {
        if (productDto != null) {
            Product product = new Product();
            product.setDescription(productDto.getDescription());
            product.setName(productDto.getName());
            product.setPrice(productDto.getPrice());

            productRepository.save(product);
        }
    }

    @Override
    public List<ProductDto> getAllProduct() {
        return null;
    }

    @Override
    public void updateProduct(ProductDto productDto) {

    }

    @Override
    public void deleteProduct(long productId) {

    }
}
