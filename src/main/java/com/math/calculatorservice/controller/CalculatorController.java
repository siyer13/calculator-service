package com.math.calculatorservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.POST
    )
    public int add2Numbers(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return num1 + num2;
    }
}
