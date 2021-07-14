package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;

import java.util.Scanner;
//4
public class BankAccountController {
    private BankAccountServiceImpl bankAccountService;
    public BankAccountController(){
        bankAccountService = new BankAccountServiceImpl();
    }
    public void main(){
        Scanner scanner=new Scanner(System.in);
        BankAccountDTO account=null;
        while(true){
            System.out.println("\n[menu] 0=exit | 1=createAcct | 2=AccList | 3=AccNumList");
            switch(scanner.next()){
                case"0": return;
                case"1":
                    account=new BankAccountDTO();
                    System.out.println("Name : ");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account);break;
                case"2":
                    System.out.println("Accounts created : "+bankAccountService.count());
                    System.out.println(bankAccountService.findAll()); break;
                case"3":
                    for(String s: bankAccountService.findAllAccountNumbers()){
                        System.out.println(s + "\n");
                    }break;
                    //System.out.println(bankAccountService.findAll()); break;
            }
        }

    }
}

/*    private BankAccountService bankAccountService;

    public BankAccountController(){
        this.bankAccountService=new BankAccountServiceImpl();

    }
    public void add(BankAccountDTO bankAccount){
        bankAccountService.add(bankAccount);
    }
    public void show(){
        System.out.println("Account Name : ");
    }
    public String createAccNumber(BankAccountDTO bankAccountDTO){

    }
}*/


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
