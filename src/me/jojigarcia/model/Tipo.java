package me.jojigarcia.model;

/**
 * Created by garci on 09/05/2017.
 */
public enum Tipo {
    PRIMER("primer piloto"),
    SEGUNDO("segundo piloto"),
    PROBADOR("probador");

    private final String tipo;

    Tipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
