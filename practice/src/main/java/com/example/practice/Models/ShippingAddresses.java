package com.example.practice.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Data
@Entity
public class ShippingAddresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String phoneNumber;
}
