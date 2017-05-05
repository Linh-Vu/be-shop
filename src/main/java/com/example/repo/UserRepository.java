package com.example.repo;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by linhv on 5/5/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
