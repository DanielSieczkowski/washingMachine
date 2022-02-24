package com.example.washingmachine;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class WashingMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    protected double width;
    protected double height;
    protected double depth;
    protected String brand;
    protected String functions;
    protected WayOfLoading wayOfLoading;

}
