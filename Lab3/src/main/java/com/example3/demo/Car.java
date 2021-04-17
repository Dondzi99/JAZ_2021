package com.example3.demo;

public class Car {
    String Rejestracja;
    int Przebieg;

    public Car(String rejestracja, int przebieg) {
        Rejestracja = rejestracja;
        Przebieg = przebieg;
    }

    public String getRejestracja() {
        return Rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        Rejestracja = rejestracja;
    }

    public int getKilometry() {
        return Przebieg;
    }

    public void setKilometry(int przebieg) {
        Przebieg = przebieg;
    }
}
