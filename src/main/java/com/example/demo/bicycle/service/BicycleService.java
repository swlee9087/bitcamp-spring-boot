package com.example.demo.bicycle.service;

//behavior (changing gear, changing pedal cadence, applying brakes)

public interface BicycleService {
    String changeGear(String gear);
    String changePedalCadence(String pedalCadence);
    Boolean applyBrake();

}
