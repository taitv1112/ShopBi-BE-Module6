package com.example.shopbibe.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address_ship;
    private double totalBill;
    private String status;
    @ManyToOne
    private User userBuyer;

    @ManyToOne
    private User userPm;

    public Orders() {
    }

    public Orders(String address_ship, double totalBill, String status, User userBuyer, User userPm) {
        this.address_ship = address_ship;
        this.totalBill = totalBill;
        this.status = status;
        this.userBuyer = userBuyer;
        this.userPm = userPm;
    }

    public Orders() {
    }
}
