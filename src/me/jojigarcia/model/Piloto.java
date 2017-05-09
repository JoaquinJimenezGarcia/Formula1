package me.jojigarcia.model;

/**
 * Created by garci on 09/05/2017.
 */
public class Piloto {
    private int dorsal;
    private String nombre;
    private Nacionalidad nacionalidad;
    private Escuderia escudería;
    private Tipo tipo;

    public Piloto(int dorsal, String nombre, Nacionalidad nacionalidad, Escuderia escudería, Tipo tipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.escudería = escudería;
        this.tipo = tipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Escuderia getEscudería() {
        return escudería;
    }

    public void setEscudería(Escuderia escudería) {
        this.escudería = escudería;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad=" + nacionalidad.getNacionalidad() +
                ", escudería=" + escudería.getEscuderia() +
                ", posicion=" + escudería.getPosicion() +
                ", tipo=" + tipo.getTipo() +
                '}';
    }
}
