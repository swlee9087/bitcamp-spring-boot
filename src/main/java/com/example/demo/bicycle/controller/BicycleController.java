package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;

import java.util.Scanner;
//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)

public class BicycleController {
    private BicycleService bicycleService;
    private BicycleDTO bicycle;
    private Scanner scanner;

    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycle=new BicycleDTO();
        this.scanner=new Scanner(System.in);
    }


    public void main(){
        BicycleDTO bicycle=new BicycleDTO();
        System.out.println("current gear?");
        bicycle.setGear(scanner.next());
        System.out.println("current pedal cadence");
        bicycle.setPedalCadence(scanner.next());
        System.out.println("current speed");
        bicycle.setSpeed(scanner.next()); //.set~

        System.out.printf(bicycle.toString());
        //%s = .get~
    }
}

