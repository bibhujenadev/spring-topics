package com.tehcrux.spring.spock.test.spocktestingframework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpockTestController {
    @PostMapping("/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam("a") int a, @RequestParam("b") int b){
        int c=a*b;
        return ResponseEntity.ok(c);
    }
}
