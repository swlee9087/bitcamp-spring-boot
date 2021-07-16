package com.example.demo.math.controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class CalculatorController extends LambdaUtils {

    public void main() {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO(); //자동조회하게
        CalculatorService calculatorService = new CalculatorServiceImpl(); //기능객체 instc 생성

        while (true) {
            print.accept("\n[menu] 0.종료 1.계산 2.수열 3.구구단\nEnter : ");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    print.accept("\nfirst int : ");
                    calculator.setNum1(scanner.nextInt());
                    print.accept("operator : ");
                    calculator.setOpcode(scanner.next());
                    print.accept("second int : ");
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

                    print.accept(String.format("%d %s %d = %d \n",
                            calculator.getNum1(),
                            calculator.getOpcode(),
                            calculator.getNum2(),
                            result)); //String.format to cover all
                    break;
                case "2":
                    print.accept("\nseq start : ");
                    calculator.setNum1(scanner.nextInt());
                    print.accept("seq end : ");
                    calculator.setNum2(scanner.nextInt());
                    int[] arr = calculatorService.sequence(calculator);
                    for (int i = 0; i < arr.length; i++) {
                        print.accept(arr[i] + "\n");
                    } break;
                case"3":
                    for(int i=1; i<=10; i++){
                        for(int j=1; j<=10; j++){
                            print.accept(String.format("%d x %d = %d\n", i, j, i*j));
                        }
                    }
                    break;
            }
        }
    }
}
