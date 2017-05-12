package com.example.repo;

import com.example.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nguyen Ba Trinh on 5/10/2017.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
