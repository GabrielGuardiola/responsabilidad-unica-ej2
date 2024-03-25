package com.gabodev.responsabilidad_unica2;

import com.gabodev.responsabilidad_unica2.model.Articulo;
import com.gabodev.responsabilidad_unica2.model.Enciclopedia;
import com.gabodev.responsabilidad_unica2.model.GuiaTuristica;
import com.gabodev.responsabilidad_unica2.model.Libro;

public class PrintManager {

    public void print(Libro libro) {
        System.out.println("Imprimiendo libro: " + libro.getTitulo() + " con isbn: " + libro.getIsbn() + " y paginas: " + libro.getNumPaginas());
    }

    public void print(Enciclopedia enciclopedia) {
        System.out.println("Imprimiendo enciclopedia: " + enciclopedia.getTitulo() + " con isbn: " + enciclopedia.getIsbn() + " y paginas: " + enciclopedia.getNumPaginas());
    }

    public void print(GuiaTuristica guiaTuristica) {
        System.out.println("Imprimiendo guia turistica: " + guiaTuristica.getTitulo() + " con isbn: " + guiaTuristica.getIsbn() + " y paginas: " + guiaTuristica.getNumPaginas());
    }


}
