package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s", today(), currentTime());
    }

    UtilDTO util=new UtilDTO(); //"UDTO~=new~": instcVar.

    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now()); //공간setToday에 값localDate.now로 getToday생성
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }
}
