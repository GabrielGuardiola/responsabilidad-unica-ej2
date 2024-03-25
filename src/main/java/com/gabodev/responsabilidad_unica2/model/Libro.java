package com.gabodev.responsabilidad_unica2.model;

public class Libro extends Articulo {

    public Libro(String titulo, Integer numPaginas, String isbn) {
        super(titulo, numPaginas, isbn);
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
