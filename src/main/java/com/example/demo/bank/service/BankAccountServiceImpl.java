package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

import java.util.Random;

//3
public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;

    @Override
    public void createAccount(BankAccountDTO bank) { //이름 입력시 계좌 생성
        bankAccount=new BankAccountDTO();

        String randomNumber = "";
        Random random=new Random(12);
        int upperbound = 9999;
        int int_random= random.nextInt(upperbound);
        for(int i=0;i<=9;i++)
            System.out.println(random.nextInt()+random.nextInt()+random.nextInt());

        bankAccount.setAccNumber(randomNumber);
        bankAccount.setName(bank.getName());

    }

    @Override
    public int findBalance(BankAccountDTO bank) { //이름 금액 계번 입력후 잔액 확인하면 잔액 보임
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bank) { //이름 금액 계번 입력후 입금후 잔액 확인
        int restMoney=bankAccount.getMoney();
        bankAccount.setMoney(restMoney + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int withdraw(BankAccountDTO bank) { //이름 금액 계번 입력후 출금후 잔액 확인
        int drawMoney=bankAccount.getMoney();
        bankAccount.setMoney(bank.getMoney() - drawMoney);
        return bankAccount.getMoney();
    }

    @Override
    public void dropAccount(BankAccountDTO bank) { //이름 계번 입력후 계좌해지

    }



     /*int balance =0;


    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public String getAccNumber() {
        return this.accNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%d 고객님의 %d 계좌가 존재합니다.", name, accNumber);
    }

    /*


    public BankAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("acct num : " + accNumber);
        System.out.println("sosec num : " + ssNumber);
        System.out.println("balance : " + balance + '\n'); //printf = overloading
        return balance;
    }


     */
}
