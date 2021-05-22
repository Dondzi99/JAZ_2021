package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    public List<Movie> getMyMovies(){
        List<Movie> MojeFilmy = new ArrayList<>();
        MojeFilmy.add(new Movie(1,"Pierwszy Film", MovieCategoryEnum.DOCUMENTARY,1999));
        MojeFilmy.add(new Movie(2,"Bagginsowie", MovieCategoryEnum.FANTSY,2003));
        MojeFilmy.add(new Movie(3,"Bardzo stary Film", MovieCategoryEnum.HORROR,1901));
        return MojeFilmy;
    }

    public Movie getMovie(Integer ID){
        return new Movie(1,"Pierwszy Film", MovieCategoryEnum.DOCUMENTARY,1999);
    }

    public Movie addMovie(Movie movie){
        return movie;
    }

    public Movie editMovie(int ID, Movie movie){
        movie.setID(ID);
        return movie;
    }

    public String deleteMovie(int ID){
        return "Pomyslnie usunieto film";
    }
}
