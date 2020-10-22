package com.example.soniakukreja.daggerproj.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    void setListner(Car car) {
        Log.d(TAG, "Remote is called...");
    }
}