package com.example.demo.util.controller;

import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.time.LocalDate;


public class UtilController {
    private UtilService utilService = new UtilServiceImpl();

    public void todayAndCurrentTime(){
        System.out.println("Today's date : " + utilService.todayAndCurrentTime());
    }



    /*public UtilService getUtilService(){
        return this.utilService;}
    public void setUtilService(UtilService utilService){
        this.utilService=utilService;}

    public void getTodayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }*/
}
