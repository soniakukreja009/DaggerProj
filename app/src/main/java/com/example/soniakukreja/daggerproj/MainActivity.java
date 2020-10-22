package com.example.soniakukreja.daggerproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.soniakukreja.daggerproj.car.Car;
import com.example.soniakukreja.daggerproj.dagger.CarComponent;
import com.example.soniakukreja.daggerproj.dagger.DaggerCarComponent;
import com.example.soniakukreja.daggerproj.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject // field Injection
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent component = DaggerCarComponent.create(); Create is available is non module takes arguments
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(100)
                .capacity(1400)
                .build();
        component.inject(this);
        car.drive();
    }
}
