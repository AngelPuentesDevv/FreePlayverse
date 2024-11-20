package com.angelpuentesdevv.freeplayverse.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {

    public void guardarJson(String json) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("Videojuegos_consultados.json");
        escritura.write(gson.toJson(json));
        escritura.close();
    }
}
