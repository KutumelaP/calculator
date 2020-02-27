package com.example.calculator.controller;

import com.example.calculator.entity.CalculatorDto;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    @Autowired
    CalculatorService service;

    @PostMapping("/calculate")
    public String calculate(@RequestBody CalculatorDto dto) {
        return service.calculatorResponse(dto);
    }
}
