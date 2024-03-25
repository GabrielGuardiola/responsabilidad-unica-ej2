package com.gabodev.responsabilidad_unica2.repository;

public class GuiaTuristicaRepository implements IArticuloRepository {

    private int stock;

    public GuiaTuristicaRepository(int stockInicial) {
        this.stock = stockInicial;
    }

    @Override
    public void venderArticulo(int cantidad) {
        stock -= cantidad;
        System.out.println("Se han vendido " + cantidad + " guías turísticas");
    }

    @Override
    public int verStockDisponible() {
        return stock;
    }
}
