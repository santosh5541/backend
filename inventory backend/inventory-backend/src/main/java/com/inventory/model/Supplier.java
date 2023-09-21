package com.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int supplierId;
    private String supplierName;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "supplier",cascade = CascadeType.ALL)
    private Set<Product> product;
}
