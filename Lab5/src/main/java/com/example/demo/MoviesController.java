package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class MoviesController {

    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getMyMovies());
    }

    @GetMapping("/movies/{ID}")
    ResponseEntity<Movie> getMovie(@PathVariable Integer ID) {
        return ResponseEntity.ok(movieService.getMovie(ID));
    }

    @PostMapping("/movies")
    ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PutMapping("/movies/{ID}")
    ResponseEntity<Movie> editMovie(@PathVariable int ID, @RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.editMovie(ID,movie));
    }

    @DeleteMapping("/movies/{ID}")
    ResponseEntity<Void> deleteEntity(@PathVariable int ID){
        String Odpowiedz = movieService.deleteMovie(ID);
        return ResponseEntity.ok().build();
    }

}
