package com.example.searchrestapi.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addresses")

public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String state;
    private String country;
    private String zipCode;
    @OneToOne(mappedBy = "billingAddress",fetch = FetchType.LAZY)
    private Order order;

}
