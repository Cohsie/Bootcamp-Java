package Java.sheet04.ex01;

public class Libro {
    int ISBN;
    String titulo;
    int num_paginas;
    String autor;
    boolean prestado;    

    //Constructor vacío
    public Libro() {}

    //Constructor lleno
    public Libro(int ISBN, String titulo, int num_paginas, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.num_paginas = num_paginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    void prestado(){
        if (prestado == true){
            System.out.println("El libro ya está prestado");
        } else {
            prestado = true;
        }
    }

    void devolver() {
        if (prestado == true) {
            prestado = false;
            System.out.println("Libro devuelto a la biblioteca.");
        } else {
            System.out.println("El libro no está en prestado.");
        }
    }

    void imprimir(double precioPagina) {
        double coste_imprimir = num_paginas * precioPagina;
        System.out.println("Coste total de imprimir "+titulo+" : "+coste_imprimir); 
    }

    @Override
    public String toString() {
        if(prestado == true) {
            return "El libro "+ISBN+" con título "+titulo+" y autor "+autor+" tiene "+num_paginas+" páginas y está prestado."; 
        } else {
            return "El libro "+ISBN+" con título "+titulo+" y autor "+autor+" tiene "+num_paginas+" páginas y no está prestado."; 
        }
    }
}
