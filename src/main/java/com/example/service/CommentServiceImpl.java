package com.example.service;

import com.example.dto.CommentDto;
import com.example.entity.Comment;
import com.example.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Nguyen Ba Trinh on 5/10/2017.
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<CommentDto> getComment() {
        List<Comment> comments = commentRepository.findAll();
        Comment commentX = commentRepository.findOne(1l);

        return comments.stream().map(comment -> {
            CommentDto commentDto = new CommentDto();
            commentDto.setComment(comment.getComment());
            commentDto.setId(comment.getId());

            return commentDto;
        }).collect(Collectors.toList());
    }

    @Override
    public void createComment(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setComment(commentDto.getComment());

        commentRepository.save(comment);
    }

    @Override
    public void updateComment(String comment, Long id) {
        Comment commentX = commentRepository.findOne(id);
        commentX.setComment(comment);

        commentRepository.save(commentX);
    }
}
