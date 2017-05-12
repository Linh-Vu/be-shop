package com.example.service;

import com.example.dto.CommentDto;
import com.example.entity.Comment;
import com.example.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Nguyen Ba Trinh on 5/10/2017.
 */
public interface CommentService {
    List<CommentDto> getComment();

    void createComment(CommentDto commentDto);
}
