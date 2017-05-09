package me.jojigarcia.model;

/**
 * Created by garci on 09/05/2017.
 */
public enum Nacionalidad {
    ESPAÑA("es"),
    FRANCIA("fr"),
    ITALIA("it"),
    GRECIA("gr");

    private final String nacionalidad;

    Nacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }
}
