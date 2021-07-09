package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.Scanner;
//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)

public class BicycleController {
    Scanner scanner = new Scanner(System.in);
    BicycleDTO bicycleDTO = new BicycleDTO();
    public void bicycle(){
        System.out.println("current gear?");
        bicycleDTO.setGear(scanner.next());
        System.out.println("current pedal cadence");
        bicycleDTO.setPedalCadence(scanner.next());
        System.out.println("current speed");
        bicycleDTO.setSpeed(scanner.next()); //.set~

        System.out.printf(bicycleDTO.toString());
        //%s = .get~
    }
}

