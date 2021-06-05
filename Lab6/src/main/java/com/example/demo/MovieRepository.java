package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer>{

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
