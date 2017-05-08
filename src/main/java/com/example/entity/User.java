package com.example.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linhv on 5/5/2017.
 */

@Entity
public class User extends AbsEntity {

    private String name;

    private String password;

    private String address;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
