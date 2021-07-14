package com.example.demo.bicycle.service;

//behavior (changing gear, changing pedal cadence, applying brakes)

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService {

    private final BicycleDTO bicycle;
    private List<BicycleDTO> bicycles;

    public BicycleServiceImpl() { //constructor initialisation
        bicycle=new BicycleDTO();
        bicycles=new ArrayList<>();
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<BicycleDTO> show() {
        return bicycles;
    }

    @Override
    public String changeGear(String gear) {
        return bicycle.toString() + gear;
    }

    @Override
    public String changePedalCadence(String pedalCadence) {
        return bicycle.toString() + pedalCadence;
    }

    @Override
    public String faster(String speed) {
        return bicycle.toString() + speed;
    }

}
//String changeGear(String gear);
//    String changePedalCadence(String pedalCadence);
//    String faster(String speed);