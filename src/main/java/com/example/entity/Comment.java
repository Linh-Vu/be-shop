package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Nguyen Ba Trinh on 5/9/2017.
 */
@Entity
public class Comment extends AbsEntity {

    private String comment;

    @ManyToOne
    private User user;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
