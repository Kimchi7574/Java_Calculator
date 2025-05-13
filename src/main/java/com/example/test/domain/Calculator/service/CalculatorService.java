package com.example.test.domain.Calculator.service;

import com.example.test.domain.Calculator.presentation.dto.Request;
import org.springframework.stereotype.Service;

@Service

public class CalculatorService {
    public int plus(Request request){
        return request.getNum1() + request.getNum2();
    }
    public int minus(Request request){
        return request.getNum1() - request.getNum2();
    }
    public int multiplication(Request request){
        return request.getNum1() * request.getNum2();
    }
    public int division(Request request){
        return request.getNum1() / request.getNum2();
    }

}

