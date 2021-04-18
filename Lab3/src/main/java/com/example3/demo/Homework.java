package com.example3.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class Homework {

    @GetMapping("/getEntity")
    ResponseEntity<String> getEntity(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }
    @GetMapping("/getEntity/{MojString}")
    ResponseEntity<String> getEntityWithPathV(@PathVariable String MojString) {
        return ResponseEntity.ok(MojString);
    }

    @PutMapping("/putEntity")
    ResponseEntity<String> putEntity(@RequestBody String MojString) {
        return ResponseEntity.ok(MojString);
    }

    @PutMapping("/putEntity/{MojString}")
    ResponseEntity<String> putEntityWithPathV(@PathVariable String MojString) {
        return ResponseEntity.ok(MojString);
    }

    @PostMapping("/postEntity")
    ResponseEntity<String> postEntity(@RequestBody String MojString) {
        return ResponseEntity.ok(MojString);
    }

    @DeleteMapping("/deleteEntity/{MojString}")
    ResponseEntity deleteEntity(@PathVariable String MojString){
        return ResponseEntity.ok().build();
    }
}
