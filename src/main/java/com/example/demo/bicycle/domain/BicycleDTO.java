package com.example.demo.bicycle.domain;

//state (current gear, current pedal cadence, current speed) and

public class BicycleDTO {
    private String gear;
    private String pedalCadence;
    private String speed;

    public void setGear(String gear){
        this.gear=gear;
    }
    public String getGear(){
        return this.gear;
    }
    public void setPedalCadence(String pedalCadence){
        this.pedalCadence=pedalCadence;
    }
    public String getPedalCadence(){
        return this.pedalCadence;
    }
    public void setSpeed(String speed){
        this.speed=speed;
    }
    public String getSpeed(){
        return this.speed;
    } //get or set, order is irrelevant

    @Override
    public String toString() {
        return String.format("이 자전거는 %s 기어로 %s 회전율에 %s km/h로 달리고 있습니다.", gear,pedalCadence,speed);
    }
}


