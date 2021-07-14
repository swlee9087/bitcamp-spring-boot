package com.example.demo.util.service;

import ch.qos.logback.classic.pattern.Util;
import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class UtilServiceImpl implements UtilService{
    private UtilDTO util;
    public UtilServiceImpl(){
        this.util=new UtilDTO();
    }

    @Override
    public LocalDate getLocalDate() {
        util.setToday(LocalDate.now()); //공간setToday에 값localDate.now로 getToday생성
        return util.getToday();
    }

    @Override
    public LocalTime getLocalTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s", getLocalDate(), getLocalTime());
    }

    @Override
    public String randomNumbers (int digits, boolean allowZeroValue) {
        String first="", result="";
        /*if(allowZeroValue){ //condition "allowZeroValue"
            first +=((int)(Math.random()*10));
        }else{
            first +=((int)(Math.random()*9+1));
        }

         */
        first += allowZeroValue ? ((int)(Math.random()*10)) : ((int)(Math.random()*9+1));

        for(int i=0; i<digits; i++);{
            result += (int)(Math.random()*10);
        }
        return first + result;
    }


        /*Random random=new Random();
        for(int i=0; i<12; i++){
            int randomNumber = random.nextInt(10000);
            int randomNumber2=random.nextInt(10000);
            int randomNumber3=random.nextInt(10000);
            System.out.printf("Account Number : %d - %d - %d ", randomNumber, randomNumber2, randomNumber3);
        }*/

        /*Math.random(); //class meth
        Random random1=new Random();
        random.nextInt(1000); //inst meth
        //this takes up too much runpower
        */
}


/*
@Override
public LocalDate getLocalDate(UtilDTo utilDTO){
utilDTO.setToday(LocalDate.now());
return utilDTO.getToday();
}

@Override
public LocalTime getLocalTime(UtilDTO utilDTO){
utilDTO.setTimeNow(LocalTime.now());
return utilDTO.getTimeNow();
}
 */
