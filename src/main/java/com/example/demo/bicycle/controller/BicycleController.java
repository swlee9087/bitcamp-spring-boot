package com.example.demo.bicycle.controller;


import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;

//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)

public class BicycleController{
    private BicycleService bicycleService;

    public BicycleController(){
        bicycleService=new BicycleServiceImpl();
    }
    public void add(BicycleDTO bicycle){
        bicycleService.add(bicycle);
    }

    public void show(){
        System.out.println("number of bicycles : " +bicycleService.count());
        System.out.println(bicycleService.show());
    }
    /*public String currentGear(String gear){
        return bicycleService.changeGear(gear);
    }
    public String changePedalCadence(String pedalCadence){
        return bicycleService.changePedalCadence(pedalCadence);
    }
    public String faster(String speed){
        return bicycleService.faster(speed);
    }*/
}

