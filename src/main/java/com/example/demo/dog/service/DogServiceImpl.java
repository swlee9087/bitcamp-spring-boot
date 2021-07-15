package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.ArrayList;
import java.util.List;

public class DogServiceImpl implements DogService{
    //ctrl+insert, ctrl+i, enter
    private final DogDTO dog; //class. 단수라 generic 필요없음.
    private final List<DogDTO> dogs;
    //^복수라 generic필요함. syntax(List)=interface type. <DogDTO>=generic. DogDTO=generic type. dogs=InstVar

    public DogServiceImpl(){
        dog=new DogDTO();
        dogs=new ArrayList<>();
    }
    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<?> show() { //보여주라고! 와일드카드!
        return dogs;
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
