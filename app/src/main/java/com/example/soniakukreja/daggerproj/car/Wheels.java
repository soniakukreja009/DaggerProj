package com.example.soniakukreja.daggerproj.car;

// Suppose this class is third party and cant be changed so module class is created for this
public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

}
