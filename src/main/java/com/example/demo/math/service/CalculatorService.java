package com.example.demo.math.service;

//add subtract multiple divide remainder

import com.example.demo.math.domain.CalculatorDTO;

public interface CalculatorService { //기능 only
    int add(CalculatorDTO calculator); // x[void-int & (int num1. int num2 ...)]
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remainder(CalculatorDTO calculator);

}
