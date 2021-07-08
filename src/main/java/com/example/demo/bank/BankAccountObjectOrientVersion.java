package com.example.demo.bank;

class BankAccount {
    int balance = 0;

    public int deposit(int amount){ //입금 메소드
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){ //출금 메소드
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){ //잔액 메소드
        System.out.println("잔액 = " + balance);
        return balance;
    }
}
class BankAccountOO{ //main method
    public static void main(String[] args){ //인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        yoon.deposit(5000); //인스별로 예금
        park.deposit(3000);

        yoon.withdraw(2000); //인스별로 출금
        park.withdraw(2000);

        yoon.checkMyBalance(); //인스별로 조회
        park.checkMyBalance();
    }
}