package com.example.dto;

/**
 * Created by Nguyen Ba Trinh on 5/10/2017.
 */
public class CommentDto {
    private String comment;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
