package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;
//@Controller
//@NoArgsConstructor//덕분에 생성자를 안써도 ref로 연결됨.
public class DogController{
    private  DogService dogService;

    public DogController(){
        dogService=new DogServiceImpl();
    }
    public void add(DogDTO dog){
        dogService.add(dog);
    }
    public int count(){return dogService.count();}

    public void show(){
        System.out.println("number of dogs : "+dogService.count());
        System.out.println(dogService.show());
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }


    public String fetching(String target) {
        return dogService.fetching(target);
    }


    public String waggingTail() {
        return dogService.waggingTail();
    }
}
