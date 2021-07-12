package com.example.demo.bank.domain;

import lombok.Data;

//1
@Data

public class BankAccountDTO {
    private String name; //"name"=invisible instcVar공간
    private String accNumber; //info factor
    private int money;
    private int balance;
    public static final String BANK_NAME = "BeatBank"; //assign val in classVar to init as constant(syntax)
    private String date; //
    private float interest;
    //var and constant defined

   /*public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    public String accNumber(){return this.accNumber;}
    public void setAccNumber(String accNumber){this.accNumber=accNumber;}
    public int getMoney(){return this.money;}
    public void setMoney(int money){this.money=money;}
    public String getBankName(){return this.bankName;}
    public void setBankName(String bankName){this.bankName=bankName;}
    public String getDate(){return this.date;}
    public void setDate(String date){this.date=date;}
    public float getInterest(){return this.interest;}
    public void setInterest(float interest){this.interest=interest;}*/

}
