package com.example.demo.common.controller;
//1
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) { //main메서드 하나로만
        Scanner scanner=new Scanner(System.in);
        CalculatorController calculatorDTO = new CalculatorController();
        DogController dogDTO = new DogController();
        BicycleController bicycle = new BicycleController();

        while(true){
            System.out.print("\n[menu] 0.종료 1.계산기 2.수열 3.개 정보 4.자전거 정보 ");
            switch(scanner.next()){
                case"0": return;
                case"1":
                    calculatorDTO.calculate(); break;
                case"2":
                    calculatorDTO.sequence(); break;
                case"3":
                    dogDTO.dog(); break;
                case"4":
                    bicycle.bicycle(); break;

            }
        }
    }
}
