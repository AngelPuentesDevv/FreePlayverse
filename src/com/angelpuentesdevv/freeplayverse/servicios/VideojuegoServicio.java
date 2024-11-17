package com.angelpuentesdevv.freeplayverse.servicios;

import com.angelpuentesdevv.freeplayverse.modelos.Videojuego;
import com.angelpuentesdevv.freeplayverse.repositorios.VideojuegoRepositorio;

import java.util.List;

public class VideojuegoServicio {

    //Declaración de constante
    private final VideojuegoRepositorio repositorio;

    //Creación de constructor
    public VideojuegoServicio(VideojuegoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Videojuego> obtenerTodosLosVideojuegos() {
        return repositorio.obtenerTodos();
    }

    /*
    public Videojuego obtenerVideojuegoPorId(int id) {
        return repositorio.obtenerPorId(id);
    }

    public List<Videojuego> obtenerVideojuegosRelevantes() {
        return repositorio.obtenerRelevantes();
    }
     */
}
