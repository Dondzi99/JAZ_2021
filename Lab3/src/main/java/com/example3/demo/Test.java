package com.example3.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/hello")
    ResponseEntity<String> hello(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @GetMapping("/model")
    ResponseEntity<Car> model() {
        return ResponseEntity.ok(new Car("GD00000",10000));
    }

    @PostMapping("/modelAuto")
    ResponseEntity<Car> model(@RequestBody Car auto) {
        return ResponseEntity.ok(auto);
    }

    @GetMapping("/hello/{someValue}")
    ResponseEntity<String> helloValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }
}
