package me.jojigarcia;

import me.jojigarcia.model.Escuderia;
import me.jojigarcia.model.Nacionalidad;
import me.jojigarcia.model.Piloto;
import me.jojigarcia.model.Tipo;

public class Main {

    public static void main(String[] args) {

        Piloto alonso = new Piloto(4,"Fernando", Nacionalidad.ESPAÑA, Escuderia.MCLAREN, Tipo.PRIMER);

        System.out.println(alonso);
    }
}
