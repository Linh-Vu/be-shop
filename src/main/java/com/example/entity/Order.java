package com.example.entity;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linhv on 5/8/2017.
 */

@Entity
public class Order extends AbsEntity {

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Product> product;

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
