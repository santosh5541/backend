package com.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Roles {
    @Id
    @Column(name = "ROLE_ID",nullable = false)
    private int roleId;
    @Column(name = "ROLE_NAME",nullable = false)
    private String roleName;
    @ManyToMany(mappedBy = "role")
    Set<User> user = new HashSet<>();
}
