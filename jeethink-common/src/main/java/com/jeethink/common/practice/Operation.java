package com.jeethink.common.practice;

public class Operation {

    private double number1 = 0;

    private double number2 = 0;


    public double number1(double value) {
        setNumber1(value);
        return getNumber1();
    }

    public double number2(double value) {
        setNumber2(value);
        return getNumber2();
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult(double value1, double value2) {
        return 0;
    }
}
