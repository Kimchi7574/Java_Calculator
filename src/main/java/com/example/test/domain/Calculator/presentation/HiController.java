package com.example.test.domain.Calculator.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class   HiController {
@GetMapping("/hi")
    public ResponseEntity<String> hi(){
        return ResponseEntity.ok("안녕하세용?ㅎㅎ");
    }
}
