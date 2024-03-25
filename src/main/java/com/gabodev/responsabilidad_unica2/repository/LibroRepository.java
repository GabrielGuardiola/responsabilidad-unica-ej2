package com.gabodev.responsabilidad_unica2.repository;

public class LibroRepository implements IArticuloRepository {
    private int stock;

    public LibroRepository(int stockInicial) {
        this.stock = stockInicial;
    }

    @Override
    public void venderArticulo(int cantidad) {
        stock -= cantidad;
        System.out.println("Se han vendido " + cantidad + " libros");
    }

    @Override
    public int verStockDisponible() {
        return stock;
    }
}