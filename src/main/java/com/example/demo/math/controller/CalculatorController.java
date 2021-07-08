package com.example.demo.math.controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //top ln
        CalculatorDTO calculator = new CalculatorDTO(); //자동조회하게
        CalculatorService calculatorService = new CalculatorServiceImpl(); //기능객체 instc 생성
        System.out.println("first int");
        calculator.setNum1(scanner.nextInt());
        System.out.println("second int");
        calculator.setNum2(scanner.nextInt());
        System.out.println("연산자");
        String opcode = scanner.next(); //입력값 다 위로
        int result = 0;
        switch (opcode){
            case "+": result= calculatorService.add(calculator);
                break;
            case "-": result= calculatorService.subtract(calculator);
                break;
            case "*": result= calculatorService.multiple(calculator);
                break;
            case "/": result= calculatorService.divide(calculator);
                break;
            case "%": result= calculatorService.remainder(calculator);
            break;
        }
        System.out.printf("%d %s %d = %d", calculator.getNum1(), calculator.getOpcode(), calculator.getNum2(), result);
    }
}

