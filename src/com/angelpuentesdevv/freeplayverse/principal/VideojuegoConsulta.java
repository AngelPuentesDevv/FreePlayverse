package com.angelpuentesdevv.freeplayverse.principal;

import com.angelpuentesdevv.freeplayverse.modelos.FreeToGameAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class VideojuegoConsulta {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Inicializacion de Scanner para lectura y almacenamiento de datos
        Scanner lectura = new Scanner(System.in);
        FreeToGameAPI api = new FreeToGameAPI();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //Uso de ciclo while para ejecutar el programa hasta que se decida lo contrario
        boolean continuar = true;
        while(continuar) {
            //Mostrar el menú al usuario
            System.out.println("""
                    !Bienvenido a FreePlayverse! 
                    Menú:
                    1. Lista de Videojuegos.
                    2. Buscar Videojuego por ID.
                    3. Buscar Videojuego por Categoría.
                    4. Buscar Videojuego por Plataforma.
                    5. Ordenar Lista de Videojuegos.
                    9. Salir.
                    Por favor selecciona una opción: """);
            int opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(gson.toJson(api.obtenerTodosLosJuegos()));
                    break;
                case 2:
                    System.out.println("Ingrese el ID del videojuego: ");
                    int id = lectura.nextInt();
                    System.out.println(gson.toJson(api.obtenerJuegosPorId(id)));
                    break;
                case 3:
                    System.out.println("Ingrese la categoría: ");
                    String categoria = lectura.nextLine();
                    System.out.println(gson.toJson(api.obtenerJuegosPorCategoria(categoria)));
                    break;
                case 4:
                    System.out.println("Ingrese la plataforma: ");
                    String plataforma = lectura.nextLine();
                    System.out.println(gson.toJson(api.obtenerJuegosPorPlataforma(plataforma)));
                    break;
                case 5:
                    System.out.println("""
                            Ingrese el criterio de ordenación
                            (release-date, alphabetical, relevance):
                            """);
                    String ordenarPor = lectura.nextLine();
                    System.out.println(gson.toJson(api.obtenerJuegosOrdenados(ordenarPor)));
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción invalida. Intente nuevamente.");
                    break;
            }
        }

    }
}
