package com.example.demo.bank.domain;

import lombok.Data;

import java.util.Random;

//1
@Data

public class BankAccountDTO {
    private String name; //"name"=invisible instcVar공간
    private String accountNumber; //info factor
    private String money;
    private String balance;
    private String date; //
    private String interest;
    public static final String BANK_NAME = "BeatBank"; //assign val in classVar to init as constant(syntax)

    //var and constant defined
    //assignment 여부. "="classVar "x="instanceVar

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
