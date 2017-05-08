package com.example.repo;

import com.example.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by linhv on 5/8/2017.
 */

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
