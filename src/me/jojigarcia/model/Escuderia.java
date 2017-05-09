package me.jojigarcia.model;

/**
 * Created by garci on 09/05/2017.
 */
public enum Escuderia {
    MERCEDES("Mercedes",3),
    MCLAREN("McLaren",1),
    FERRARI("Ferrari",4),
    RENAUL("Renault",2);

    private final String escuderia;
    private final int posicion;

    Escuderia(String escuderia, int posicion){
        this.escuderia = escuderia;
        this.posicion = posicion;
    }

    public String getEscuderia(){
        return this.escuderia;
    }

    public int getPosicion(){
        return this.posicion;
    }
}
