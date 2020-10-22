package com.example.soniakukreja.daggerproj.dagger;

import com.example.soniakukreja.daggerproj.EngineInterface;
import com.example.soniakukreja.daggerproj.car.DieselEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

//    @Binds
//    abstract EngineInterface provideDiesel(DieselEngine engine);

    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    public int providesHorsePower() {
        return horsepower;     // dagger care about only return type. Can create some problems
    }

//    @Provides
//    EngineInterface provideDiesel(){
//        return new DieselEngine(horsepower);
//    }

    @Provides
    EngineInterface provideDiesel(DieselEngine engine){
        return engine;
    }
}
