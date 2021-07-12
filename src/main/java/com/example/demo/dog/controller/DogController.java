package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;

import java.util.Scanner;

public class DogController {
    private Scanner scanner;
    private DogService dogService;
    private DogDTO dog;

    public DogController(){
        this.dogService = new DogServiceImpl();
        this.dog=new DogDTO();
        this.scanner=new Scanner(System.in);
    }
    public void main(){
        System.out.println("name?");
        dog.setName(scanner.next()); //Dog class에 저장. --> obj 본다/지향한다.
        System.out.println("color");
        dog.setColor(scanner.next());//
        System.out.println("breed");
        dog.setBreed(scanner.next());
        System.out.println("hungry");
        dog.setHungry(scanner.next());
        //String ~ = scanner.next(); --> DogMain에 저장. --> 본체귀속. 객체지향x.


    }

}
