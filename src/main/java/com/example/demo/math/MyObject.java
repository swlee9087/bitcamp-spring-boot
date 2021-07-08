package com.example.demo;

import java.util.Scanner;

public class MyObject {
    public static void main(String[] args){
        System.out.println("number 1 ?");
        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt(); //.next==>error
        System.out.println("number 2 ?");
        int num2 =scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3); //%d=십진법변수로 인식





    }
}
