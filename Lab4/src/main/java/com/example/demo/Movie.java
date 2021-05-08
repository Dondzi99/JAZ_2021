package com.example.demo;

public class Movie {
    private Integer ID;
    private String Nazwa;
    private MovieCategoryEnum Kategoria;
    private int RokProdukcji;

    public Movie(Integer ID, String nazwa, MovieCategoryEnum kategoria, int rokProdukcji) {
        this.ID = ID;
        Nazwa = nazwa;
        Kategoria = kategoria;
        RokProdukcji = rokProdukcji;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
