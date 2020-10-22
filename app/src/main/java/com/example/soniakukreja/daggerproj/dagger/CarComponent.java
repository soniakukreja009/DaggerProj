package com.example.soniakukreja.daggerproj.dagger;

import com.example.soniakukreja.daggerproj.MainActivity;
import com.example.soniakukreja.daggerproj.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("power") int horsePower);

        @BindsInstance
        Builder capacity(@Named("capacity")int capacity);

        CarComponent build();
    }
}
