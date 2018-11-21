package com.example.ylw_03.myapplicationprueba;

import java.util.ArrayList;

public class Jugador implements Comparable<Jugador>{

    private String name;
    private int trys;

    //static ArrayList<Jugador> players = new ArrayList<Jugador>();

    public Jugador (String name, int trys) {
        this.name = name;
        this.trys = trys;
    }

    public Jugador (){

    }

    //Setters y getters de los atributos de Jugador

    public int getTrys() {
        return trys;

    }
    public String getName() {

        return name;
    }

    public void setTrys(int trys) {

        this.trys = trys;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public int compareTo(Jugador jug){
        return this.trys - jug.trys;

    }

}
