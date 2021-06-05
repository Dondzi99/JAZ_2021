package com.example.demo;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie findByID(Integer id){
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Movie> getMyMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovie(Integer ID)
    {
        return movieRepository.findById(ID).orElseThrow(() -> new MovieNotFoundException());
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public Movie editMovie(Integer ID, Movie movie){
        if(movieRepository.existsById(ID))
            return movieRepository.save(movie);
        else
            throw new MovieNotFoundException();
    }

    public void deleteMovie(int ID){
        movieRepository.deleteById(ID);
    }

    public void setAvailableT(int ID) {
        movieRepository.updateMovieAvailability(true,ID);
    }

    public void setAvailableF(int ID) {
        movieRepository.updateMovieAvailability(false,ID);
    }
}
