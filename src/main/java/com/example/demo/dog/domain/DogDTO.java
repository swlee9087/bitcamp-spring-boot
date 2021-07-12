package com.example.demo.dog.domain;
//state (name, color, breed, hungry)[properties=getter setter]
// and behavior (barking, fetching, wagging tail)
//this is 속성처리객체

import lombok.Data;

@Data
public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;
    //primitive String
    @Override
    public String toString(){
        return String.format("dog name %s, color %s, breed %s, hunger %s.", name, color, breed, hungry);
    }


}