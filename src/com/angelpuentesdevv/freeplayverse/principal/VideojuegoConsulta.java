package com.angelpuentesdevv.freeplayverse.principal;

import com.angelpuentesdevv.freeplayverse.modelos.FreeToGameAPI;
import com.angelpuentesdevv.freeplayverse.modelos.GeneradorDeArchivo;
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
        GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();

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
                    String todosLosJuegos = api.obtenerTodosLosJuegos();
                    System.out.println(gson.toJson(todosLosJuegos));
                    generadorDeArchivo.guardarJson(todosLosJuegos);
                    break;
                case 2:
                    System.out.println("Ingrese el ID del videojuego: ");
                    int id = lectura.nextInt();
                    String juegoPorId = api.obtenerJuegosPorId(id);
                    System.out.println(gson.toJson(juegoPorId));
                    generadorDeArchivo.guardarJson(juegoPorId);
                    break;
                case 3:
                    System.out.println("Las categorías disponibles son: " + api.getCategorias());
                    System.out.println("Ingrese la categoría: ");
                    String categoria = lectura.nextLine();
                    String juegosPorCategoria = api.obtenerJuegosPorCategoria(categoria);
                    System.out.println(gson.toJson(juegosPorCategoria));
                    generadorDeArchivo.guardarJson(juegosPorCategoria);
                    break;
                case 4:
                    System.out.println("Las plataformas disponibles son: " + api.getPlataforma());
                    System.out.println("Ingrese la plataforma: ");
                    String plataforma = lectura.nextLine();
                    String juegosPorPlataforma = api.obtenerJuegosPorPlataforma(plataforma);
                    System.out.println(gson.toJson(juegosPorPlataforma));
                    generadorDeArchivo.guardarJson(juegosPorPlataforma);
                    break;
                case 5:
                    System.out.println("Los criterios de or");
                    System.out.println("Ingrese el criterio de ordenacion: " + api.getCriterioDeOrdenacion());
                    String ordenarPor = lectura.nextLine();
                    String juegosOrdenados = api.obtenerJuegosOrdenados(ordenarPor);
                    System.out.println(gson.toJson(juegosOrdenados));
                    generadorDeArchivo.guardarJson(juegosOrdenados);
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
