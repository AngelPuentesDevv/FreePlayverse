package com.angelpuentesdevv.freeplayverse.modelos;

public class Videojuego {

//Atributos que representan las caracterísiticas del videojuego

    private String titulo;
    private String descripcion;
    private String genero;
    private String plataforma;
    private String publicador;
    private String desarrollador;
    private int fechaLanzamiento;

//Creación del constructor de la clase Videojuego

    public Videojuego(String titulo, String descripcion, String genero, String plataforma, String publicador,
                      String desarrollador, int fechaLanzamiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.plataforma = plataforma;
        this.publicador = publicador;
        this.desarrollador = desarrollador;
        this.fechaLanzamiento = fechaLanzamiento;
    }

//Métodos get para cada uno de los atributos

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getPublicador() {
        return publicador;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "(titulo= " + titulo +
                ", descripcion= " + descripcion +
                ", genero= " + genero +
                ", plataforma= " + plataforma +
                ", publicador= " + publicador +
                ", desarrollador= " + desarrollador +
                ", fecha de lanzamiento= " + fechaLanzamiento +
                ")";
    }
}
