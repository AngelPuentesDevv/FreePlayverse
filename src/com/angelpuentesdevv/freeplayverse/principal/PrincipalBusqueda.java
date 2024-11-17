package com.angelpuentesdevv.freeplayverse.principal;

import com.angelpuentesdevv.freeplayverse.modelos.Videojuego;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalBusqueda {
    public static void main(String[] args) throws IOException {

        //Inicializacion de Scanner y ArrayList para lectura y almacenamiento de datos
        Scanner lectura = new Scanner(System.in);
        List<Videojuego> videojuegos = new ArrayList<>();

        //Uso de Gson para gestión de JSONs de respuesta
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        //Uso de ciclo while para ejecutar el programa hasta que se decida lo contrario
        while(true){

            //Solicitud de datos al usuario
            System.out.println("Nombre del videojuego: ");
            var busqueda = lectura.nextLine();

            //Condición de salida del ciclo
            if(busqueda.equalsIgnoreCase("salir")){
                break;
            }

            //URL de consulta a la API
            String direccion = "https://www.freetogame.com/api/games";

            try {
                //Estructura para realizar la solicitud HTTP
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                //Errores que podrían suceder
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e){
                throw new IOException(e);
            }
        }

    }
}
