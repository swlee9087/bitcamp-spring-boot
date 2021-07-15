package com.example.demo.util.service;
import com.example.demo.util.service.LambdaUtils;


import java.util.Random;

public class UtilServiceImplTest extends LambdaUtils {
    public static void main(String[]args){

        String result="";
        for(int i=0; i<4; i++);{ //middle in #digits
            result += (int)(Math.random()*10);
        }
        print.accept(result); //accept=consumer



        /*Random random=new Random();
        for(int i=0; i<1; i++){
            int randomNumber = random.nextInt(10000);
            int randomNumber2=random.nextInt(10000);
            int randomNumber3=random.nextInt(10000);
            System.out.printf("Account Number : %d - %d - %d ", randomNumber, randomNumber2, randomNumber3);
        }*/

        /*Math.random(); //class meth
        Random random1=new Random();
        random.nextInt(1000); //inst meth
        //this takes up too much runpower
        */

        /*String str= new String();
        char c=' ';
        str="hello";
        c=str.charAt(3);
        System.out.println(c);

         */

    }
}
