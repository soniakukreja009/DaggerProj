package com.example.soniakukreja.daggerproj.car;

import android.util.Log;

import com.example.soniakukreja.daggerproj.EngineInterface;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements EngineInterface {
    private static final String TAG = "Car";

    int horsepower;
    int capacity;

    @Inject
    public PetrolEngine(@Named("power")int horsepower , @Named("capacity")int capacity){
        this.horsepower = horsepower;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine selected... HorsePower - "+horsepower);
    }
}
