package com.example.demo.himart.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.himart.service.HimartService;
import com.example.demo.himart.service.HimartServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;
//4
public class HimartController extends LambdaUtils {
    private HimartService himartService;
    public HimartController(){
        himartService = new HimartServiceImpl();
    }
    public void main(){
        Scanner scanner=new Scanner(System.in);

        while(true){
            print.accept("\n[menu] 0=exit | 1=Smartphone | 2=AccNumList \nEnter : ");
            switch(scanner.next()){
                case"0": return;
                case"1":
                    phoneMain(scanner);
                    break;
                case"2":
                    break;
                case"3":
                    break;
                case"4":
                    break;
            }
        }

    }
    public void phoneMain(Scanner scanner){
        PhoneApp app=new PhoneApp();
        PhoneApp.Phone phone = null;
        PhoneApp.CellPhone cellPhone=null;
        PhoneApp.IPhone iPhone=null;
        PhoneApp.GalaxyNote galaxyNote=null;        

        while(true){
            print.accept("\n[menu] 0=exit | 1=HomePhone | 2=CellPhone | 3=iPhone | 4=GalaxyNote\nEnter : ");
            switch(scanner.next()){
                case"0":return;
                case"1": //homeph
                    phone = app.new Phone();
                    phone.setCall("scram");
                    phone.setCompany("LG");
                    phone.setKind("home phone");
                    break;
                case"2": //cellph
                    cellPhone = app.new CellPhone();
                    cellPhone.setKind();
                    cellPhone.setCompany();
                    cellPhone.setCall();
                    cellPhone.setMove();

                    break;
                case"3"://iph
                    iPhone=app.new IPhone();
                    iPhone.setKind(PhoneApp.IPhone.BRAND);
                    iPhone.setCompany();
                    iPhone.setCall();
                    iPhone.setInternet();
                    iPhone.isPortable();
                    break;
                case"4": //galno
                    galaxyNote=app.new GalaxyNote();
                    galaxyNote.setKind();
                    galaxyNote.setCompany();
                    galaxyNote.setCall();
                    galaxyNote.setInternet();
                    galaxyNote.isPortable();
                    galaxyNote.setPencil();
                    break;

            }
        }
    }

    public HimartService getHimartService() {
        return himartService;
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
