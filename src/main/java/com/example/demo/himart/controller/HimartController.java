package com.example.demo.himart.controller;

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
        PhoneApp.MobilePhone mobilePhone=null;
        PhoneApp.IPhone iPhone=null;
        PhoneApp.GalaxyNote galaxyNote=null;        

        while(true){
            print.accept("\n[menu] 0=exit | 1=HomePhone | 2=CellPhone | 3=iPhone | 4=GalaxyNote\nEnter : ");
            switch(scanner.next()){
                case"0":return;
                case"1": //homeph
                    phone = app.new Phone();
                    phone.setCall("call rejected");
                    phone.setCompany("LG");
                    phone.setKind("home phone");
                    print.accept(phone.toString());
                    break;
                case"2": //cellph
                    mobilePhone=app.new MobilePhone();
                    mobilePhone.setKind("Razr");
                    mobilePhone.setCompany("Motorola");
                    mobilePhone.setCall("Will call you back in 2006");
                    mobilePhone.setMove("Outdated");
                    mobilePhone.isPortable();
                    print.accept(mobilePhone.toString());
                    break;
                case"3"://iph
                    iPhone=app.new IPhone();
                    iPhone.setKind(PhoneApp.IPhone.BRAND);
                    iPhone.setCompany("Apple");
                    iPhone.setCall("Calling from iPhone");
                    iPhone.setInternet("Logging into Google");
                    iPhone.setMove("On the move");
                    iPhone.isPortable();
                    print.accept(iPhone.toString());
                    break;
                case"4": //galno
                    galaxyNote=app.new GalaxyNote();
                    galaxyNote.setKind(PhoneApp.GalaxyNote.BRAND);
                    galaxyNote.setCompany("Samsung");
                    galaxyNote.setCall("Calling from GalaxyNote");
                    galaxyNote.setInternet("Logging into Naver");
                    galaxyNote.setMove("On the move");
                    galaxyNote.isPortable();
                    galaxyNote.setPencil("Using Note Pencil");
                    print.accept(galaxyNote.toString());
                    break;

            }
        }
    }
}