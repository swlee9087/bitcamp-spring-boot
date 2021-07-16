package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;
//4
public class BankAccountController extends LambdaUtils {
    private BankAccountServiceImpl bankAccountService;
    public BankAccountController(){
        bankAccountService = new BankAccountServiceImpl();
    }
    public void main(){
        Scanner scanner=new Scanner(System.in);
        BankAccountDTO account=null;
        //if not null but new BankAccountDTO() then accnumlist repeats content ln=override
        //hence  here should be null and new BankAccountDTO() separated to each runnable case ln.
        while(true){
            print.accept("\n[menu] 0=exit | 1=createAcct | 2=AccNumList | 3=Deposit | 4=Withdraw | 5=Check Account Balance\nEnter : ");
            switch(scanner.next()){
                case"0": return;
                case"1": //create
                    account=new BankAccountDTO(); //account=null ln above is reused as new BankAccountDTO(). runtimeVV
                    print.accept("Name : ");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account); break;
                case"2": //accNumlist
                    print.accept("\nNumber of Accounts opened : " + string.apply(bankAccountService.count())+"\n");
                    for(String s: bankAccountService.findAllAccountNumbers()){
                        print.accept(s + "\n");
                    }break;
                case"3": //depo
                    account=new BankAccountDTO();
                    print.accept("\nAccount Number to Deposit : ");
                    account.setAccountNumber(scanner.next());
                    print.accept("Deposit Amount : ");
                    account.setMoney(scanner.next());
                    break;
                case"4": //withdrawing option
                    account=new BankAccountDTO();
                    print.accept("\nAccount Number to Withdraw : ");
                    account.setAccountNumber(scanner.next());
                    print.accept("Withdraw Amount : ");
                    account.setMoney(scanner.next());
                    break;
                case"5":  //chkacctbal option
                    print.accept("Account Number to Check Balance : " +bankAccountService.findBalanceByAccountNumber(scanner.next()));
                    break;

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
