package com.example.demo.math.service;

//add subtract multiple divide remainder

import com.example.demo.math.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(CalculatorDTO calculator) { //calc = atom값
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remainder(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }
}
