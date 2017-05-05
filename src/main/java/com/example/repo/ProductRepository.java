package com.example.repo;

import com.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by linhv on 5/5/2017.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
