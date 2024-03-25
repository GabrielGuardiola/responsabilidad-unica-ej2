package com.gabodev.responsabilidad_unica2.model;

public abstract class Articulo {
    protected String titulo;
    protected Integer numPaginas;
    protected String isbn;

    protected Articulo(String titulo, Integer numPaginas, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }

}
