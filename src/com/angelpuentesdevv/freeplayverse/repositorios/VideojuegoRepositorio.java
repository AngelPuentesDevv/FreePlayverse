package com.angelpuentesdevv.freeplayverse.repositorios;

import com.angelpuentesdevv.freeplayverse.modelos.Videojuego;
import com.angelpuentesdevv.freeplayverse.rutas.VideojuegoRutas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideojuegoRepositorio {
    private final VideojuegoRutas rutas;

    public VideojuegoRepositorio(VideojuegoRutas rutas) {
        this.rutas = rutas;
    }

    //Métodos para realizar las operaciones CRUD
    public List<Videojuego> obtenerTodos() {
        //Implementación para obtener una lista de todos los videojuegos
        try {
            return rutas.obtenerTodosLosVideojuegos();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /*
    public Videojuego obtenerPorId(int id) {
        //Implementación para obtener un videojuego únicamente por id
    }

    public List<Videojuego> obtenerRelevantes() {
        //Implementación para obtener los videojuegos más relevantes
    }
    */
}
