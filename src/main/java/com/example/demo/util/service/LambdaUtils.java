package com.example.demo.util.service;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaUtils { //publicly used util should be here
    public static Consumer<String> print = System.out::print;     //para type String. print=classVar
    public static Function<Object,String> string = String::valueOf; //take anything and convert to String
    public static Function<String,Integer> strToInt = Integer::parseInt; //take Strings and convert to Integers

}
