package Java.sheet04.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(
            001,
            "El Quijote", 
            600, 
            "Miguel de Cervantes", 
            true
        );

        Libro libro2 = new Libro(
            002, 
            "El nombre del viento", 
            800,
            "Patrick Rothfuss", 
            false
        );

        libro1.devolver();
        libro2.prestado();
        libro1.imprimir(.98);

    }
}
