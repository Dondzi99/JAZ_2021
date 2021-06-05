package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer>{

    @Modifying
    @Query("update Movie m set m.isAvailable = :isAvailable where m.id = :id")
    @Transactional
    void updateMovieAvailability(boolean isAvailable, Integer id);

    @Override
    List<Movie> findAllById(Iterable<Integer> iterable);

    @Override
    List<Movie> findAll();

    @Override
    <S extends Movie> S save(S s);

    @Override
    boolean existsById(Integer integer);

    @Override
    void deleteById(Integer integer);
}
