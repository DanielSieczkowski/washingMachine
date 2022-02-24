package com.example.washingmachine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WashingMachineDto extends Dimensions {

    protected int id;
    protected String brand;
    protected String functions;
    protected WayOfLoading wayOfLoading;

    public WashingMachineDto(int id, String brand, String functions, WayOfLoading wayOfLoading, Dimensions dimensions){
        this.id = id;
        this.brand = brand;
        this.functions = functions;
        this.wayOfLoading = wayOfLoading;

    }
}
