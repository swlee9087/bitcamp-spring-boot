package com.example.demo.math.domain;
//속성객체
public class CalculatorDTO { //x main method
    private int num1;
    private int num2;
    private String opcode;

    public void setNum1(int num1){
        this.num1=num1;
    }
    public int getNum1(){
        return this.num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum2() {
        return this.num2;
    }
    public void setOpcode(String opcode){
        this.opcode=opcode;
    }
    public String getOpcode() {
        return this.opcode;
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d", num1, num2, num1+num2);
    }
}
