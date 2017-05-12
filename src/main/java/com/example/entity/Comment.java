package com.example.entity;

import javax.persistence.Entity;

/**
 * Created by Nguyen Ba Trinh on 5/9/2017.
 */
@Entity
public class Comment extends AbsEntity {

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
