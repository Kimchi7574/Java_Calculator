package com.example.test.domain.Calculator.presentation;

import com.example.test.domain.Calculator.presentation.dto.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculator")
public class Controller {

    @PostMapping("/plus")
    public ResponseEntity<Integer> plus(@RequestBody Request request){
        return ResponseEntity.ok(request.getNum1() + request.getNum2());
    }

    @PostMapping("/minus")
    public ResponseEntity<Integer> minus(@RequestBody Request request){
         return ResponseEntity.ok(request.getNum1() - request.getNum2());
    }
    @PostMapping("/multiplication")
    public ResponseEntity<Integer> multiplication(@RequestBody Request request){
        return ResponseEntity.ok(request.getNum1() * request.getNum2());
    }
    @PostMapping("/division")
    public ResponseEntity<Integer> division(@RequestBody Request request){
        return ResponseEntity.ok(request.getNum1() / request.getNum2());
    }
}
