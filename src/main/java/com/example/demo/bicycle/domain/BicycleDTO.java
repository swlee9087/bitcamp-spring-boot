package com.example.demo.bicycle.domain;

import lombok.Data;

//state (current gear, current pedal cadence, current speed) and
@Data
public class BicycleDTO {
    private String gear;
    private String pedalCadence;
    private String speed;

    @Override
    public String toString() {
        return String.format("이 자전거는 %s 기어로 %s 회전율에 %s km/h로 달리고 있습니다.", gear,pedalCadence,speed);
    }
}


