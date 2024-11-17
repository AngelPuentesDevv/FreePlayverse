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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPublicador(String publicador) {
        this.publicador = publicador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //Sobreescritura del método toString para la clase Videojuego
    @Override
    public String toString() {
        return "(titulo=" + titulo +
                ", descripcion=" + descripcion +
                ", genero=" + genero +
                ", plataforma=" + plataforma +
                ", publicador=" + publicador +
                ", desarrollador=" + desarrollador +
                ", fecha de lanzamiento=" + fechaLanzamiento +
                ")";
    }
}
