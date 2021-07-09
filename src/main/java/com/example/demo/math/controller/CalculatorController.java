package com.example.demo.math.controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    Scanner scanner = new Scanner(System.in);
    CalculatorDTO calculator = new CalculatorDTO(); //자동조회하게
    CalculatorService calculatorService = new CalculatorServiceImpl(); //기능객체 instc 생성

    public void calculate() {
        System.out.println("first int");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("second int");
        calculator.setNum2(scanner.nextInt());
        //입력값 다 위로
        int result = 0;
        switch (calculator.getOpcode()) {
            case "+":
                result = calculatorService.add(calculator);
                break;
            case "-":
                result = calculatorService.subtract(calculator);
                break;
            case "*":
                result = calculatorService.multiple(calculator);
                break;
            case "/":
                result = calculatorService.divide(calculator);
                break;
            case "%":
                result = calculatorService.remainder(calculator);
                break;
        }
        System.out.printf("%d %s %d = %d",
                calculator.getNum1(),
                calculator.getOpcode(),
                calculator.getNum2(), result);
    }
    public void sequence(){
        System.out.println("seq start:");
        calculator.setNum1(scanner.nextInt());
        System.out.println("seq end:");
        calculator.setNum2(scanner.nextInt());
        int[] arr= calculatorService.sequence(calculator);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }

    }


}

