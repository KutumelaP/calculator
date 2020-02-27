package com.example.calculator.service;

import com.example.calculator.entity.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculatorResponse(CalculatorDto calculatorDto) {
        StringBuffer response = new StringBuffer();
        if (calculatorDto.getOperation() != null) {

            final String operation = calculatorDto.getOperation();
            final int value1 = calculatorDto.getValue1();
            final int value2 = calculatorDto.getValue2();
            response.append("Output: ");

            switch (operation.toUpperCase()) {
                case "MULTIPLY":
                    response.append(value1 * value2).toString();
                    break;
                case "DIVIDE":
                    if (value2 == 0) {
                        response.append("Can not divide by zero").toString();
                    }

                    break;
                case "SUBTRACT":

                    response.append(value1 - value2).toString();
                    break;
                case "ADD":
                    response.append(value1 + value2).toString();
                    break;
                default:
                    response.append("Operation not recognized");
            }
        }
        return response.toString();
    }
}
