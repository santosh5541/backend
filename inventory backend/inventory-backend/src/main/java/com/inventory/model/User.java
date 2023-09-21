package com.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String address;
    private String about;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false, length = 15)
    private String phone;
    @Column(name = "CreateAt")
    private Date date;
    private boolean active;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    Set<Roles> role = new HashSet<>();
}
