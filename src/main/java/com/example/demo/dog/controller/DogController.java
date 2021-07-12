package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;

import java.util.Scanner;

public class DogController {
    Scanner scanner = new Scanner(System.in);
    DogDTO dogDTO = new DogDTO();


    private DogService dogService;
    private DogDTO dog;

    public DogController(){
        this.dogService = new DogServiceImpl();
        this.dog=new DogDTO();
        this.scanner=new Scanner(System.in);
    }
    public void main(){
        System.out.println("name?");
        dogDTO.setName(scanner.next()); //Dog class에 저장. --> obj 본다/지향한다.
        System.out.println("color");
        dogDTO.setColor(scanner.next());//
        System.out.println("breed");
        dogDTO.setBreed(scanner.next());
        System.out.println("hungry");
        dogDTO.setHungry(scanner.next());
        //String ~ = scanner.next(); --> DogMain에 저장. --> 본체귀속. 객체지향x.

        System.out.printf("name is %s, color is %s, breed is %s, hunger is %s.", dogDTO.getName(), dogDTO.getColor(), dogDTO.getBreed(), dogDTO.getHungry());
        //printf("~ %s", ,);

    }

}
