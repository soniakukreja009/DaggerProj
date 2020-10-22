package com.example.soniakukreja.daggerproj.dagger;

import com.example.soniakukreja.daggerproj.car.Rims;
import com.example.soniakukreja.daggerproj.car.Tires;
import com.example.soniakukreja.daggerproj.car.Wheels;

import dagger.Module;
import dagger.Provides;

// if all methods are static make module abstract
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.checkTires();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims,tires);
    }
}
