package com.example.repo;

import com.example.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by linhv on 5/8/2017.
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
