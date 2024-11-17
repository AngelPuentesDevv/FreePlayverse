package com.angelpuentesdevv.freeplayverse.controladores;

import com.angelpuentesdevv.freeplayverse.modelos.Videojuego;
import com.angelpuentesdevv.freeplayverse.servicios.VideojuegoServicio;

import java.util.List;

public class VideojuegoControlador {

    //Declaración de constante
    private final VideojuegoServicio servicio;

    public VideojuegoControlador(VideojuegoServicio servicio) {
        this.servicio = servicio;
    }

    public List<Videojuego> obtenerTodosLosVideojuegos() {
        return servicio.obtenerTodosLosVideojuegos();
    }

    /*
    public Videojuego obtenerVideojuegoPorId(int id) {
        return servicio.obtenerVideojuegoPorId(id);
    }

    public List<Videojuego> obtenerVideojuegosRelevantes() {
        return servicio.obtenerVideojuegosRelevantes();
    }
     */
}
