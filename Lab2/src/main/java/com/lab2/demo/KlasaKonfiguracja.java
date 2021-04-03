package com.lab2.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KlasaKonfiguracja {

    @Value("${my.custom.property}")
    String mojString;

    @Value("${cos.czego.nie.ma:Domyslna wartosc}")
    private String domyslnyString;

    @Bean
    public POJOClass pOJOClass(){
        return new POJOClass("S",12,"K");
    }

    @Bean
    public List<String> defoultData(){
        System.out.println(mojString);
        System.out.println(domyslnyString);
        return List.of("1","2","3","4","5");
    }
}
