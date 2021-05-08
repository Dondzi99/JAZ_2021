package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceMovies {
    public List<ClassMovie> getMyMovies(){
        List<ClassMovie> MojeFilmy = new ArrayList<>();
        MojeFilmy.add(new ClassMovie(1,"Pierwszy Film", EnumMovieCategory.Documentary,1999));
        MojeFilmy.add(new ClassMovie(2,"Bagginsowie", EnumMovieCategory.Fantasy,2003));
        MojeFilmy.add(new ClassMovie(3,"Bardzo stary Film", EnumMovieCategory.Horror,1901));
        return MojeFilmy;
    }

    public ClassMovie getMovie(){
        return new ClassMovie(1,"Pierwszy Film", EnumMovieCategory.Documentary,1999);
    }

    public ClassMovie addMovie(ClassMovie movie){
        return movie;
    }

    public ClassMovie editMovie(int ID, ClassMovie movie){
        movie.setID(ID);
        return movie;
    }

    public String deleteMovie(int ID){
        return "Pomyslnie usunieto film";
    }
}
