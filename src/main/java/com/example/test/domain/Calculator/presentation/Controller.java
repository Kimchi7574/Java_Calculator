package com.example.test.domain.Calculator.presentation;

import com.example.test.domain.Calculator.presentation.dto.Request;
import com.example.test.domain.Calculator.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/plus")
    public ResponseEntity<Integer> plus(@RequestBody Request request){
        return ResponseEntity.ok(calculatorService.plus(request));
    }

    @PostMapping("/minus")
    public ResponseEntity<Integer> minus(@RequestBody Request request){
         return ResponseEntity.ok(calculatorService.minus(request));
    }
    @PostMapping("/multiplication")
    public ResponseEntity<Integer> multiplication(@RequestBody Request request){
        return ResponseEntity.ok(calculatorService.multiplication(request));
    }
    @PostMapping("/division")
    public ResponseEntity<Integer> division(@RequestBody Request request){
        return ResponseEntity.ok(calculatorService.division(request));
    }
}
