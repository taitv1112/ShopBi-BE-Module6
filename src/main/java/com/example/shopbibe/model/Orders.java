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
    private double total_bill;
    private String status;
    @ManyToOne
    private User user;
}
