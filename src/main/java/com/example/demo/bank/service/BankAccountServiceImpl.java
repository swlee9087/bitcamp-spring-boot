package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;
import java.util.ArrayList;
import java.util.List;

//3
public class BankAccountServiceImpl extends LambdaUtils implements BankAccountService{
    private final List<BankAccountDTO> bankAccounts;

    public BankAccountServiceImpl() {
        bankAccounts = new ArrayList<>();
    }

    @Override //call over utilService.randomNumbers fn with rules
    public void createAccount(BankAccountDTO bank) {
        UtilService utilService=new UtilServiceImpl();
        String bankAccountNumber = utilService.randomNumbers(4, false)+"-"+
                utilService.randomNumbers(4, true)+"-"+
                utilService.randomNumbers(4, true);
        bank.setAccountNumber(bankAccountNumber);
        bank.setBalance("0");
        bank.setDate(utilService.todayAndCurrentTime());
        bank.setInterest("0.01");
        bankAccounts.add(bank);

    }

    @Override //show how many accounts
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override //show list
    public List<? extends BankAccountDTO> findAll() {
        return bankAccounts;
    }

    @Override //show arraylist
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] bankAccountNumbers=new String[count];
        for(int i=0; i<count; i++){
            bankAccountNumbers[i]=bankAccounts.get(i).getAccountNumber();
        }
        return bankAccountNumbers;
    }

    @Override //whaa
    public BankAccountDTO findAccountByAccountNumber (String bankAccountNumber) {
        BankAccountDTO bankAccount=null;
        for(BankAccountDTO a:bankAccounts){
            if(a.getAccountNumber().equals(bankAccountNumber)){
                bankAccount=a; break;
            }
        }
        return bankAccount;
    }

    @Override //whaaa
    public String findBalanceByAccountNumber(String bankAccountNumber) {
        String balance="";
        for(BankAccountDTO a:bankAccounts){
            balance=a.getAccountNumber().equals(bankAccountNumber)?a.getBalance():"0"; break;
        }
        return balance;
    }

    @Override //whaaaa
    public void deposit(BankAccountDTO bank){
        for (BankAccountDTO a: bankAccounts){
            if(bank.getAccountNumber().equals(a.getAccountNumber())){
                int balance= strToInt.apply(a.getBalance());
                a.setBalance(string.apply(balance + strToInt.apply(bank.getMoney())));
                print.accept("Balance after Deposit : " + a); break;
            }else{
                print.accept("Account does not exist.");
            }
        }
    }

    /*public void deposit(BankAccountDTO bank) { //incld if(noacctexists)
        BankAccountDTO bankAccount=findAccountByAccountNumber(bank.getAccountNumber());
        int restMoney= strToInt.apply(bankAccount.getMoney());
        bankAccount.setMoney(restMoney+bank.getMoney());
        for(BankAccountDTO a:bankAccounts){
            if(a.getAccountNumber().equals(bankAccount.getAccountNumber())){
                a.setBalance(bankAccount.getMoney());
                bankAccount=a;
            }
        } return bankAccount;
    }*/ //study oyo

    @Override
    public void withdraw(BankAccountDTO bank) {
        for(BankAccountDTO a: bankAccounts){
            if(bank.getAccountNumber().equals(a.getAccountNumber())){
                int balance= strToInt.apply(a.getBalance());
                a.setBalance(string.apply(balance - strToInt.apply(bank.getMoney())));
                print.accept("Balance after Withdraw : " + a); break;
            }else{
                print.accept("Account does not exist.");
            }
        }
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {

    }


     /*private final BankAccountDTO bankAccount; //instc조합

     private final List<BankAccountDTO> bankAccounts;
     //final 용도: prevent deletion by GCollectn. finalized. X in DTO. only in interface class.

    @Override
    public String count() { //Array
        return string.apply(bankAccounts.size());
    }

    @Override
    public String findAll() {
        return String.valueOf(bankAccounts);
    }

    public BankAccountServiceImpl(){
         bankAccount=new BankAccountDTO(); //위로 안올리는 이유 이해! 초기화/레퍼런스/정형화
         bankAccounts=new ArrayList<>();
    }

    @Override
    public void createAccount(BankAccountDTO bank) { //이름 입력시 계좌 생성
        UtilService utilService=new UtilServiceImpl(); //위로 안올리는 이유 이해! 기능 찾기 생략하려고=PROCESS RUNTIME vv.
        String accountNumber= utilService.randomNumbers(4,false) +" - "+
                utilService.randomNumbers(4,true)+" - "+
                utilService.randomNumbers(4,true);
        //print.accept("================================== \nYour Account Number : "+accountNumber+"\n");
        bank.setAccountNumber(accountNumber);
        //bank.setBalance("0");
        //bank.setDate(utilService.todayAndCurrentTime()); //date를 string 타입으로 변환
        //bank.setInterest("0.01");
        bankAccounts.add(bank);
    }

    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] accountNumbers =new String[count]; //"count()" position defines how much data to show
        for(int i=0; i< count; i++){
            accountNumbers[i]=bankAccounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }

    @Override
    public BankAccountDTO findAccountByAccountNumber(String bankAccountNumber) {
        BankAccountDTO bankAccount=null; //give answer first
        for(BankAccountDTO account: bankAccounts){
            if(account.getAccountNumber().equals(bankAccountNumber)){
                bankAccount=account; break;
            }
        } return bankAccount;
    } 

    @Override
    public String findBalance(BankAccountDTO bank) { //이름 금액 계번 입력후 잔액 확인하면 잔액 보임
        return bankAccount.getMoney();
    }

    @Override
    public String deposit(BankAccountDTO bank) { //이름 금액 계번 입력후 입금후 잔액 확인
        BankAccountDTO bankAccount = findAccountByAccountNumber(bank.getAccountNumber());
        int restMoney= strToInt.apply(bankAccount.getMoney()); //apply fn
        bankAccount.setMoney(restMoney + bank.getMoney()); //

        for(BankAccountDTO account:bankAccounts){
            if(account.getAccountNumber().equals(bankAccount.getAccountNumber())){
                account.setBalance(bankAccount.getMoney());
                bankAccount=account;
            }
        }
        return bankAccount.getMoney();
    }

    @Override
    public String withdraw(BankAccountDTO bank) { //이름 금액 계번 입력후 출금후 잔액 확인
        //bankAccount.setMoney(bankAccount.getBalance() - bankAccount.getMoney());
        return bankAccount.getBalance();
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
