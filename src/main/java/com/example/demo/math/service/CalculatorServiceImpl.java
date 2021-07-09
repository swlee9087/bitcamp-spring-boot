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

    @Override
    public int[] sequence(CalculatorDTO calculator) {
        int count = calculator.getNum2() -calculator.getNum1() +1;
        int[] arr = new int[count]; //logic
        int i =0;
        for (int j= calculator.getNum1(); j<= calculator.getNum2(); j++){ //for(init; termin; increm)
            arr[i]=j;
            i++;
        }
        return arr; //답
    }

    /*@Override
    public int[] sequence2(CalculatorDTO calculator) {
        int[] arr = new int[20];
        for (int i=5; i<=25; i++){
            System.out.print(i +"\t");
        }
        return arr;
    }

     */

}
