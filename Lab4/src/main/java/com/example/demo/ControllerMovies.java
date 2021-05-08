package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class ControllerMovies {

    private final ServiceMovies serviceMovies;

    public ControllerMovies(ServiceMovies serviceMovies) {
        this.serviceMovies = serviceMovies;
    }

    @GetMapping("/movies")
    ResponseEntity<List<ClassMovie>> getAllMovies() {
        return ResponseEntity.ok(serviceMovies.getMyMovies());
    }

    @GetMapping("/movies/{ID}")
    ResponseEntity<ClassMovie> getMovie(@PathVariable int ID) {
        return ResponseEntity.ok(serviceMovies.getMovie());
    }

    @PostMapping("/movies")
    ResponseEntity<ClassMovie> addMovie(@RequestBody ClassMovie movie){
        return ResponseEntity.ok(serviceMovies.addMovie(movie));
    }

    @PutMapping("/movies/{ID}")
    ResponseEntity<ClassMovie> editMovie(@PathVariable int ID, @RequestBody ClassMovie movie) {
        return ResponseEntity.ok(serviceMovies.editMovie(ID,movie));
    }

    @DeleteMapping("/movies/{ID}")
    ResponseEntity<Void> deleteEntity(@PathVariable int ID){
        String Odpowiedz = serviceMovies.deleteMovie(ID);
        return ResponseEntity.ok().build();
    }

}
