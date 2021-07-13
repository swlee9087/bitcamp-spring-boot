package com.example.demo.dog.service;

import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

public class DogServiceImpl implements DogService{
    //ctrl+insert, ctrl+i, enter
    private final DogDTO dog; //error시 @ReqArgsCons
    private ArrayList<DogDTO> dogs;

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public String barking(String bark) {
        return dog.toString()+bark+" 컹컹컹";
    }

    @Override
    public String fetching(String target) {
        return dog.toString()+target+"fetch";
    }

    @Override
    public String waggingTail() {
        return "wag tail";
    }
}
