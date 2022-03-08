package com.example.shopbibe.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Orders orders;
    @ManyToOne
    private Product product;
    private double quantity;

}
