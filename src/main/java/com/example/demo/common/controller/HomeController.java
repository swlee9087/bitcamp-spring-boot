package com.example.demo.common.controller;
//1
import com.example.demo.bank.controller.BankAccountController;

import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;

import com.example.demo.himart.controller.HimartController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {
    public static <T> void main(String[] args) { //main메서드 하나로만
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();//collection class should be outside "while".
        BicycleController bicycleController = new BicycleController();//이거 한줄로 시간 다 갔다(ㅡㅡ^
        BankAccountController bankAccountController = new BankAccountController();
        while (true) {                                                                       //marginal ln
            print.accept(
                    "\n[menu] 0.종료 | 1.유틸 | 2.계산기 | 3.개 | 4.자전거 | 5.비트은행 | 6.하이마트? \nEnter : ");
            switch (scanner.next()) {
                case "0": return;
                case "1": new UtilController().todayAndCurrentTime(); break;
                case "2": new CalculatorController().main(); break;
                case "3": new DogController().main(); break;
                case "4": new BicycleController().main(); break;
                case "5": new BankAccountController().main(); break;
                case "6": new HimartController().main(); break;
                    /*BankAccountDTO bankAccount = new BankAccountDTO();
                    System.out.println("Do you have an account with us?");
                    //if()
                    System.out.println("name?");
                    bankAccount.setName(scanner.next()); //create random num string for acctnum
                    while (true) {
                        System.out.print("\n[menu] 0.check balance 1.deposit 2.withdraw 3.close account ");//create options to depo or withdr or close
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("balance : ");
                                bankAccount.getBalance();
                                break;
                            case "1":
                                System.out.println("deposit amount : ");
                                bankAccount.setMoney(scanner.nextInt());
                                System.out.println("balance : " + bankAccount.getMoney());
                                break;
                            case "2":
                                System.out.println("withdraw amount : ");
                                bankAccount.setMoney(scanner.nextInt());
                                System.out.println("balance : " + bankAccount.getMoney());
                                break;
                            case "3":
                                System.out.println("close account?");
                                bankAccount.getName();
                                break;
                            case "4":
                                System.out.println("log out?");
                                break;
                            //;break;*/
                        }
                    }
    }
}
