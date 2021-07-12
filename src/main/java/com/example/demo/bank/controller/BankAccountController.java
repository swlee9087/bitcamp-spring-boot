package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;

import java.util.Scanner;
//4
public class BankAccountController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccountDTO = new BankAccountDTO();

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