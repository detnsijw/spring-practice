package com.example.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculate(
            @RequestParam(required = false) Double number1,
            @RequestParam(required = false) Double number2,
            @RequestParam(defaultValue = "null") String operation,
            Model model
    ) {
        double resultDouble;
        String resultString;
        switch (operation) {
            case "+":
                resultDouble = number1 + number2;
                resultString = String.format("%.2f", resultDouble);
                break;
            case "-":
                resultDouble = number1 - number2;
                resultString = String.format("%.2f", resultDouble);
                break;
            case "*":
                resultDouble = number1 * number2;
                resultString = String.format("%.2f", resultDouble);
                break;
            case "/":
                if (number2 == 0) {
                    resultString = "Ошибка! На ноль делить нельзя!";
                } else {
                    resultDouble = number1 / number2;
                    resultString = String.format("%.2f", resultDouble);
                }
                break;
            default:
                return "calculator";
        }
        model.addAttribute("result", resultString);
        return "/calculator";
    }
}
