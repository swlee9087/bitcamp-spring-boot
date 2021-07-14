package com.example.demo.bicycle.service;

//behavior (changing gear, changing pedal cadence, applying brakes)

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.List;

public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show();
    String changeGear(String gear);
    String changePedalCadence(String pedalCadence);
    String faster(String speed);

}
