package com.example.shopbibe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private double price;
    private double quantity;
    private double quantity_sale; // so luong sp da ban

    private String imgMain;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;
    @ManyToOne
    private Promotion promotion;
}
