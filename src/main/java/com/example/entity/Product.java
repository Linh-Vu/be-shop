package com.example.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linhv on 5/5/2017.
 */
@Entity
public class Product extends AbsEntity {

    private String name;

    private String description;

    private long price;

    private String imageLink;

    @ManyToOne
    private User user;

    @ManyToOne
    private Vendor vendor;

    @ManyToMany(mappedBy = "products")
    private List<Orders> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
