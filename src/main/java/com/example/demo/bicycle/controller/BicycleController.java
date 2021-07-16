package com.example.demo.bicycle.controller;


import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

//state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)

public class BicycleController extends LambdaUtils {
    private BicycleService bicycleService;

    public BicycleController() {
        bicycleService = new BicycleServiceImpl();
    }

    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        //BicycleService bicycleService=new BicycleServiceImpl();
        while (true) {
            print.accept("\n[menu] 0=end | 1=add details | 2=list \n Enter : ");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    BicycleDTO bicycle = new BicycleDTO();
                    print.accept("\ncurrent gear : ");
                    bicycle.setGear(scanner.next());
                    print.accept("current pedal cadence : ");
                    bicycle.setPedalCadence(scanner.next());
                    print.accept("current speed : ");
                    bicycle.setSpeed(scanner.next());
                    bicycleService.add(bicycle);
                    break;
                case "2":
                    print.accept(String.format( "Number of bicycles : %d\n", bicycleService.count()));
                    List<BicycleDTO> list=(List<BicycleDTO>)bicycleService.show();
                    for(BicycleDTO d:list){
                        print.accept(d.toString()+"\n");
                    }
                    /*list대신 원래 lnTEST하면 \n해도 줄이 안바뀜.
                    print.accept(String.valueOf(bicycleService.show())+"\n");
                     */
                    break;
            }

        }

    }
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