package com.example.demo;

interface Printable{
    public void print(String doc); //추상메소드
}
class Printer implements Printable{ //Printable 구현하는 Printer 클래스
    @Override
    public void print(String doc) { //오라 관계성립. 실수확률v
        System.out.println(doc);
    }
}

class PrintableInterface{
    public static void main(String[] args){
        Printable prn = new Printer(); //Printer형 참조변수 선언
        prn.print("Hello java");
    }
}
