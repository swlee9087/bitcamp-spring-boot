package com.example.demo.common.controller;
//1

import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;


import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) { //main메서드 하나로만
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.print("\n[menu] 0.종료 1.계산기 2.수열 3.개 정보 4.자전거 정보 5.오늘날짜 6.은행거래");
            switch(scanner.next()){
                case"0": return;
                case"1":
                    new CalculatorController().calculate(); break;
                case"2":
                    new CalculatorController().sequence(); break;
                case"3":
                    DogDTO dog=new DogDTO();
                    System.out.println("name?");
                    dog.setName(scanner.next()); //Dog class에 저장. --> obj 본다/지향한다.
                    System.out.println("color");
                    dog.setColor(scanner.next());//
                    System.out.println("breed");
                    dog.setBreed(scanner.next());
                    DogController dogController=new DogController(new DogServiceImpl(dog));
                    System.out.println(dogController.barking("아르르르"));
                    break;
                case"4":
                    new BicycleController().main(); break;
                case"5":
                    new UtilController().getTodayAndCurrentTime();break;
                case"6":
                    new BankAccountController().main();break;


            }
        }
    }
}
