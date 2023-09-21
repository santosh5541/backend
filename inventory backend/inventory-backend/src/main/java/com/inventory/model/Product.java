package com.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    private String product_name;
    private double product_prize;
    private boolean stock;
    private int product_quantity;
    private boolean live;
    private String product_imageName;
    private String product_desc;
    @ManyToOne(fetch = FetchType.EAGER)
    private Supplier supplier;
}
