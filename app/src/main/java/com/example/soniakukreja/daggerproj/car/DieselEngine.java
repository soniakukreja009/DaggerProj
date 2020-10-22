package com.example.soniakukreja.daggerproj.car;

import android.util.Log;

import com.example.soniakukreja.daggerproj.EngineInterface;

import javax.inject.Inject;

public class DieselEngine implements EngineInterface {
    private static final String TAG = "Car";

    private int horsepower;

    @Inject
    public DieselEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void start() {
        Log.d(TAG, "diesel engine selected. Horsepoer : "+horsepower);
    }
}
