package com.jeethink.common.practice;

public class OperationAdd extends Operation{

    @Override
    public double getResult(double value1, double value2) {
        double result;
        result = number1(value1) + number2(value2);
        return result;
    }
}
