package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ApiRespon

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/controller")
public class RentialController {

    private final RentialService rentialService;

    public RentialController(RentialService rentialService) {
        this.rentialService = rentialService;
    }

    @GetMapping("/movie/{ID}")
    ResponseEntity<Movie> getMovie(@PathVariable Integer ID) {
        return ResponseEntity.ok(rentialService.getMovie(ID));
    }

    @PutMapping ("/movieReturn/{ID}")
    ResponseEntity<Void> returnMovie(@PathVariable Integer ID) {
        rentialService.returnMovie(ID);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/movieGet/{ID}")
    ResponseEntity<Void> returnGet(@PathVariable Integer ID) {
        rentialService.movieGet(ID);
        return ResponseEntity.ok().build();
    }
}
