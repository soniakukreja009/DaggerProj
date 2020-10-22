package com.example.soniakukreja.daggerproj.car;

import android.util.Log;

import com.example.soniakukreja.daggerproj.EngineInterface;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private EngineInterface engine;
    private Wheels wheels;

    @Inject
    public Car(EngineInterface engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListner(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving....");
    }
}
