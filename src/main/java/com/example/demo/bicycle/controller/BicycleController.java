package com.example.demo.bicycle.controller;


import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)

public class BicycleController extends LambdaUtils {
    private BicycleService bicycleService;

    public BicycleController(){
        bicycleService=new BicycleServiceImpl();
    }
    public void add(BicycleDTO bicycle){
        bicycleService.add(bicycle);
    }

    public void main(){
        BicycleDTO bicycle = new BicycleDTO();
        Scanner scanner = new Scanner(System.in);
        //BicycleService bicycleService=new BicycleServiceImpl();
        print.accept("current gear?");
        bicycle.setGear(scanner.next());
        print.accept("current pedal cadence?");
        bicycle.setPedalCadence(scanner.next());
        print.accept("current speed?");
        bicycle.setSpeed(scanner.next());
        bicycleService.add(bicycle);
    }

    public void show(){
        print.accept("number of bicycles : " +bicycleService.count());
        print.accept(String.valueOf(bicycleService.show()));
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

