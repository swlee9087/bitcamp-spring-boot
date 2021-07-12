package com.example.demo.common.controller;
//1
import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;


import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) { //main메서드 하나로만
        Scanner scanner=new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        UtilController utilController = new UtilController();

        while(true){
            System.out.print("\n[menu] 0.종료 1.계산기 2.수열 3.개 정보 4.자전거 정보 5.오늘날짜 6.은행거래");
            switch(scanner.next()){
                case"0": return;
                case"1":
                    calculatorController.calculate(); break;
                case"2":
                    calculatorController.sequence(); break;
                case"3":
                    dogController.main(); break;
                case"4":
                    bicycleController.main(); break;
                case"5":
                    utilController.getTodayAndCurrentTime();break;
                case"6":
                    BankAccountController.main();break;

            }
        }
    }
}
