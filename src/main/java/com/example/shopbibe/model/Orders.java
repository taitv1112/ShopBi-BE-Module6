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
}
