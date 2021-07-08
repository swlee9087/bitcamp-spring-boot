package com.example.demo.bank.domain;

public class BankAccountDTO {
    private String accNumber; //info factor
    private String name;


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
