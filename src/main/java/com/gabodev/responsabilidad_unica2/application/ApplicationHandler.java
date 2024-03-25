package com.gabodev.responsabilidad_unica2.application;


import com.gabodev.responsabilidad_unica2.PrintManager;
import com.gabodev.responsabilidad_unica2.model.Articulo;
import com.gabodev.responsabilidad_unica2.model.Enciclopedia;
import com.gabodev.responsabilidad_unica2.model.GuiaTuristica;
import com.gabodev.responsabilidad_unica2.model.Libro;
import com.gabodev.responsabilidad_unica2.repository.EnciclopediaRepository;
import com.gabodev.responsabilidad_unica2.repository.GuiaTuristicaRepository;
import com.gabodev.responsabilidad_unica2.repository.IArticuloRepository;
import com.gabodev.responsabilidad_unica2.repository.LibroRepository;

import java.security.Guard;
import java.util.Objects;
import java.util.Scanner;

public class ApplicationHandler {
    Scanner scanner = new Scanner(System.in);
    public void run(){
        IArticuloRepository libroRepository = new LibroRepository(100);
        IArticuloRepository enciclopediaRepository = new EnciclopediaRepository(50);
        IArticuloRepository guiaTuristicaRepository = new GuiaTuristicaRepository(20);
        PrintManager printManager = new PrintManager();

        boolean isRunning = true;
        while(isRunning){
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Vender");
            System.out.println("2. Ver stock disponible");
            System.out.println("3. Ver información de un artículo");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("¿Qué artículo deseas vender?");
                    System.out.println("1. Libro");
                    System.out.println("2. Enciclopedia");
                    System.out.println("3. Guía turística");
                    int opcionArticulo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("¿Cuántos deseas vender?");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    if(opcionArticulo == 1){
                        libroRepository.venderArticulo(cantidad);
                    } else if(opcionArticulo == 2){
                        enciclopediaRepository.venderArticulo(cantidad);
                    } else if(opcionArticulo == 3){
                        guiaTuristicaRepository.venderArticulo(cantidad);
                    }
                    break;
                case 2:
                    System.out.println("Stock disponible de libros: " + libroRepository.verStockDisponible());
                    System.out.println("Stock disponible de enciclopedias: " + enciclopediaRepository.verStockDisponible());
                    System.out.println("Stock disponible de guías turísticas: " + guiaTuristicaRepository.verStockDisponible());
                    break;
                case 3:
                    System.out.println("¿De qué artículo deseas ver la información?");
                    System.out.println("1. Libro");
                    System.out.println("2. Enciclopedia");
                    System.out.println("3. Guía turística");
                    int opcionInfo = scanner.nextInt();
                    scanner.nextLine();
                    if(opcionInfo == 1){
                        Libro libro = new Libro("Clean Code", 100000, "e123123-12312adsdsaf34-123");
                        printManager.print(libro);
                    } else if(opcionInfo == 2){
                        Enciclopedia enciclopedia = new Enciclopedia("El hombre y la tierra", 344234123, "e-21312312-3123");
                        printManager.print(enciclopedia);
                    } else if(opcionInfo == 3){
                        GuiaTuristica guiaTuristica = new GuiaTuristica("Mallorca", 30, "e23333-123213-123123");
                        printManager.print(guiaTuristica);
                    }
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }
}
