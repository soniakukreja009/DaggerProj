package com.example.soniakukreja.daggerproj.dagger;

import com.example.soniakukreja.daggerproj.EngineInterface;
import com.example.soniakukreja.daggerproj.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    EngineInterface provideEngine(PetrolEngine engine){
        return engine;
    }
}
