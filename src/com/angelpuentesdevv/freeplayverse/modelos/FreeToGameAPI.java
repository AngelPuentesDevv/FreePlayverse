package com.angelpuentesdevv.freeplayverse.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FreeToGameAPI {

    private static final String BASE_URL = "https://www.freetogame.com/api";
    private final HttpClient client;

    public FreeToGameAPI() {
        this.client = HttpClient.newHttpClient();
    }

    private String enviarPeticion(String endpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + endpoint))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return  response.body();
    }

    public String obtenerTodosLosJuegos() throws IOException, InterruptedException {
        return enviarPeticion("/games");
    }

    public String obtenerJuegosPorId(int juegoId) throws IOException, InterruptedException {
        return enviarPeticion("/game?id=" + juegoId);
    }

    public String obtenerJuegosPorCategoria(String categoria) throws IOException, InterruptedException {
        return enviarPeticion("/games?category="+ categoria);
    }

    public String obtenerJuegosPorPlataforma(String plataforma) throws IOException, InterruptedException {
        return enviarPeticion("/games?platform=" + plataforma);
    }

    public String obtenerJuegosOrdenados(String orden) throws  IOException, InterruptedException {
        return enviarPeticion("/games?sort-by=" + orden);
    }

}
