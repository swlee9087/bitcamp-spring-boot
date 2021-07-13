package com.example.demo.dog.service;
//state (name, color, breed, hungry) - ctrlr
//behavior (barking, fetching, wagging tail) - intfc
//this is 기능처리객체
//this Service + DTO = Model.

import com.example.demo.dog.domain.DogDTO;

public interface DogService { //자바클래스 밖의 함수. intfc type.
    //v 기능만. 그래서 public.
    void add(DogDTO dog);
    String barking(String bark); //fn
    String fetching(String target); //fn
    String waggingTail(); //supplier
    //in out 없는. 기능지원. 속성값이 없는 함수. 추상메소드.


}
