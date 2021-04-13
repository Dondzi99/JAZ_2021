package com.lab2.demo;

public class POJOClass {
    private String Nazwa;
    private int Ilosc;
    private String Opis;

    public POJOClass(String nazwa, int ilosc, String opis){
        this.Nazwa = nazwa;
        this.Ilosc = ilosc;
        this.Opis = opis;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public int getIlosc() {
        return Ilosc;
    }

    public String getOpis() {
        return Opis;
    }

    public void setNazwa(String nazwa) {
        this.Nazwa = nazwa;
    }

    public void setNazwa(int ilosc) {
        this.Ilosc = ilosc;
    }

    public void setOpis(String opis) {
        this.Opis = opis;
    }
}
