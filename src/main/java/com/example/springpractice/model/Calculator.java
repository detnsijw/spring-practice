package com.example.springpractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Calculator {
    private double number1;
    private double number2;
    private String operation;
    private double result;

    public void calculate(double number1, double number2){
        if(operation=="*"){
            result = number1*number2;
            System.out.println(number1 + operation + number2 + "=" + result);
        } else if (operation=="+") {
            result = number1+number2;
            System.out.println(number1 + operation + number2 + "=" + result);
        } else if (operation=="-") {
            result = number1-number2;
            System.out.println(number1 + operation + number2 + "=" + result);
        } else {
            result = number1/number2;
            System.out.println(number1 + operation + number2 + "=" + result);
        }
    }
}
