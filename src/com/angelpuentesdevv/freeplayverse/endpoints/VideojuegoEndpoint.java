package com.angelpuentesdevv.freeplayverse.endpoints;

import com.angelpuentesdevv.freeplayverse.modelos.Videojuego;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class VideojuegoEndpoint {

    //Declaración de variables importantes
    private static final String URL_BASE = "https://www.freetogame.com/api";
    private final HttpClient client;
    private final Gson gson;

    //Constructor de la clase
    public VideojuegoEndpoint(){
        this.client = HttpClient.newHttpClient();
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public List<Videojuego> obtenerTodosLosVideojuegos() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL_BASE))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return gson.fromJson(json, List.class);
    }


}
