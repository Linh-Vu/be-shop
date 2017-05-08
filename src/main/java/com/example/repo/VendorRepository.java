package com.example.repo;

import com.example.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by linhv on 5/8/2017.
 */

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
