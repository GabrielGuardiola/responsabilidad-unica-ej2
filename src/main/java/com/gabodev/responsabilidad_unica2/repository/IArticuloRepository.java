package com.gabodev.responsabilidad_unica2.repository;

import com.gabodev.responsabilidad_unica2.model.Articulo;

public interface IArticuloRepository {

    void venderArticulo(int cantidad);
    int verStockDisponible();
}
