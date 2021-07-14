package com.example.demo.common.controller;
//1
import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) { //main메서드 하나로만
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();//collection class should be outside "while".
        BicycleController bicycleController = new BicycleController();//이거 한줄로 시간 다 갔다(ㅡㅡ^
        BankAccountController bankAccountController = new BankAccountController();
        while (true) {                                                                       //marginal ln
            System.out.print(
                    "\n[menu] 0.종료 | 1.계산기 | 2.수열 | 3.개 등록 | 33.개 목록 | 4.자전거 정보 | 44.자전거 목록 | 5.오늘날짜 | 6.비트은행");
            System.out.println();
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    new CalculatorController().calculate();
                    break;
                case "2":
                    new CalculatorController().sequence();
                    break;
                case "3":
                    DogDTO dog = new DogDTO(); //Element class should be inside "while"
                    DogService dogService = new DogServiceImpl();
                    System.out.println("name?");
                    dog.setName(scanner.next()); //Dog class에 저장. --> obj 본다/지향한다.
                    System.out.println("color");
                    dog.setColor(scanner.next());//
                    System.out.println("breed");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    break;
                case "33":
                    dogController.show();
                    break;
                case "4":
                    BicycleDTO bicycle = new BicycleDTO();
                    //BicycleService bicycleService=new BicycleServiceImpl();
                    System.out.println("current gear?");
                    bicycle.setGear(scanner.next());
                    System.out.println("current pedal cadence?");
                    bicycle.setPedalCadence(scanner.next());
                    System.out.println("current speed?");
                    bicycle.setSpeed(scanner.next());
                    bicycleController.add(bicycle);
                    break;
                case "44":
                    bicycleController.show();
                    break;
                case "5":
                    new UtilController().todayAndCurrentTime();
                    break;
                case "6":
                    new BankAccountController().main();break;
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
