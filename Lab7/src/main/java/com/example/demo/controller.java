package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class controller {

    @GetMapping("/currency/{currencyName}")
    ResponseEntity<String> getAllMovies(@PathVariable String currencyName,@RequestParam(required = false) Integer days)
    {
        if(days==null)
            days=1;
        return ResponseEntity.ok(currencyName+Integer.toString(days));
    }

}
