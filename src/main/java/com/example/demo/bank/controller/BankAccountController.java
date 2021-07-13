package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;

import java.util.Scanner;
//4
public class BankAccountController {
    private Scanner scanner;
    private BankAccountService bankAccountService;
    private BankAccountDTO bankAccount;

    public BankAccountController(){
        this.bankAccountService=new BankAccountServiceImpl();
        this.bankAccount=new BankAccountDTO();
        this.scanner=new Scanner(System.in);
    }
    public void main() {
        System.out.println("name?");
        bankAccount.setName(scanner.next()); //create random num string for acctnum
        while (true) {
            System.out.print("\n[menu] 0.check balance 1.deposit 2.withdraw 3.close account ");//create options to depo or withdr or close
            switch (scanner.next()) {
                case "0":
                    System.out.println("check balance?");
                    bankAccount.getMoney();
                    break;
                case "1":
                    System.out.println("deposit?");
                    bankAccount.setMoney(scanner.nextInt());
                    System.out.println("balance : " + bankAccount.getMoney());
                    break;
                case "2":
                    System.out.println("withdraw?");
                    bankAccount.setMoney(scanner.nextInt());
                    System.out.println("balance : " + bankAccount.getMoney());
                    break;
                case "3":
                    System.out.println("close account?");
                    bankAccount.getName();
                    break;
                case"4":
                    System.out.println("log out?"); break;
            }
        }


        /*System.out.println("계좌번호 : ");
        bankAccountDTO.setAccNumber(scanner.next());
        System.out.println("주민번호 : ");
        bankAccountDTO.setName(scanner.next());
        System.out.println(bankAccountDTO.toString());

        /*BankAccount yoon = new BankAccount("12-34-56","990990-9090990",10000);
        BankAccount park = new BankAccount("33-55-09","770088-5959007",10000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();*/

    }
    }