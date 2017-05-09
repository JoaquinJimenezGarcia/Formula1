package me.jojigarcia.model;

/**
 * Created by garci on 09/05/2017.
 */
public enum Escuderia {
    MERCEDES("Mercedes"),
    MCLAREN("McLaren"),
    FERRARI("Ferrari"),
    RENAUL("Renault");

    private final String escuderia;

    Escuderia(String escuderia){
        this.escuderia = escuderia;
    }

    public String getEscuderia(){
        return this.escuderia;
    }
}
