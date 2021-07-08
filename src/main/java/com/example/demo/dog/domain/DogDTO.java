package com.example.demo.dog.domain;
//state (name, color, breed, hungry)[properties=getter setter]
// and behavior (barking, fetching, wagging tail)
//this is 속성처리객체

import java.util.Scanner;

public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;
    //primitive String


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return this.hungry;
    }

}