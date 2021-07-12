package com.example.demo.dog.domain;
//state (name, color, breed, hungry)[properties=getter setter]
// and behavior (barking, fetching, wagging tail)
//this is 속성처리객체

import lombok.Data;

import java.util.Scanner;
@Data
public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;
    //primitive String


}