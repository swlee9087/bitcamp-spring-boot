package com.example.demo.util.controller;

import com.example.demo.util.service.UtilService;


public class UtilController {
    public UtilService utilService;

    public UtilService getUtilService(){
        return this.utilService;}
    public void setUtilService(UtilService utilService){
        this.utilService=utilService;}

    public void getTodayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }
}
