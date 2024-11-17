package com.angelpuentesdevv.freeplayverse.principal;

import com.angelpuentesdevv.freeplayverse.modelos.Videojuego;

public class Principal {
    public static void main(String[] args) {

        //Crear objeto de tipo Videojuego usando el constructor
        Videojuego genshinImpact = new Videojuego("Genshin Impact", "Viaje por Teyvat",
                "RPG", "PC", "miHoYo", "miHoYo", 2020);

        //Uso del método toString de la clase Videojuego
        System.out.println(genshinImpact.toString());
    }
}
