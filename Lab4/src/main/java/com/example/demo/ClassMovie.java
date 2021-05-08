package com.example.demo;

public class ClassMovie {
    private int ID;
    private String Nazwa;
    private EnumMovieCategory Kategoria;
    private int RokProdukcji;

    public ClassMovie(int ID, String nazwa, EnumMovieCategory kategoria, int rokProdukcji) {
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

    public EnumMovieCategory getKategoria() {
        return Kategoria;
    }

    public void setKategoria(EnumMovieCategory kategoria) {
        Kategoria = kategoria;
    }

    public int getRokProdukcji() {
        return RokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        RokProdukcji = rokProdukcji;
    }
}
