package com.example.controller;

import com.example.dto.CommentDto;
import com.example.dto.UserDto;
import com.example.service.CommentService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Nguyen Ba Trinh on 5/10/2017.
 */
@RestController
@RequestMapping(value = "/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(method = RequestMethod.GET)
    List<CommentDto> getAllComment (){
        return commentService.getComment();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createComment(@RequestBody CommentDto commentDto){
        commentService.createComment(commentDto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updatateComment(@RequestParam (value = "comment", required = true)String comment,
                                @PathVariable("id")Long id){
        commentService.updateComment(comment, id);
    }



}
