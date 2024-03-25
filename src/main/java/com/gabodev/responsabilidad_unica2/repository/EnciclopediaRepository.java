package com.gabodev.responsabilidad_unica2.repository;

public class EnciclopediaRepository implements IArticuloRepository {
    private int stock;

    public EnciclopediaRepository(int stockInicial) {
        this.stock = stockInicial;
    }

    @Override
    public void venderArticulo(int cantidad) {
        stock -= cantidad;
        System.out.println("Se han vendido " + cantidad + " enciclopedias");
    }

    @Override
    public int verStockDisponible() {
        return stock;
    }
}
