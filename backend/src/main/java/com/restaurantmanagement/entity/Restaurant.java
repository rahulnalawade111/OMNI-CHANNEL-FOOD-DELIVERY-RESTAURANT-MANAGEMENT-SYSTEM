package com.restaurantmanagement.entity;
import jakarta.persistence.*; import java.time.*;
@Entity @Table(name="restaurants") public class Restaurant { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @Column(nullable=false) public String name; @Column(nullable=false, unique=true) public String email; public String phone, city, cuisineType; @Column(nullable=false) public boolean active=true; public LocalDateTime createdAt=LocalDateTime.now(); }
