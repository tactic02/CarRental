package com.example.myfirstwebproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @PostMapping("/calc")
    @ResponseBody
    String calc(@RequestParam double a, @RequestParam double b, String operator){
        try {
            double result = CalculateService.calculate(a, b, operator);
            return String.format(" %.2f %s %.2f = %.2f", a, operator, b, result);
        } catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}
