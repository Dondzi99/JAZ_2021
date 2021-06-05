package com.example.demo;

public class Movie {
    private Integer id;
    private String Nazwa;
    private MovieCategoryEnum Kategoria;
    private int RokProdukcji;
    private Boolean isAvailable;

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Movie(Integer id, String nazwa, MovieCategoryEnum kategoria, int rokProdukcji, Boolean isAvailable) {
        this.id = id;
        Nazwa = nazwa;
        Kategoria = kategoria;
        RokProdukcji = rokProdukcji;
        this.isAvailable = isAvailable;
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
