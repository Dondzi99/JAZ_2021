package com.example.demo;


import javax.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nazwa;
    @Enumerated(EnumType.STRING)
    private MovieCategoryEnum Kategoria;
    @Column(name = "rokprodukcji")
    private int RokProdukcji;

    public Movie(Integer ID, String nazwa, MovieCategoryEnum kategoria, int rokProdukcji) {
        this.id = ID;
        Nazwa = nazwa;
        Kategoria = kategoria;
        RokProdukcji = rokProdukcji;
    }

    public Movie() {

    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public MovieCategoryEnum getKategoria() {
        return Kategoria;
    }

    public void setKategoria(MovieCategoryEnum kategoria) {
        Kategoria = kategoria;
    }

    public int getRokProdukcji() {
        return RokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        RokProdukcji = rokProdukcji;
    }
}
