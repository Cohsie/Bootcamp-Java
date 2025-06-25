

import java.util.LinkedList;

public class ListaRecorre {
    public static void main(String[] args) {
        
        //Creo la LinkedList
        LinkedList<String> texto = new LinkedList<>();
        
        //Añado elementos a la lista
        texto.add("Hola");
        texto.add("Mundo");
        texto.add("Java");

        for(int i = 0; i < texto.size(); i++){
            System.out.println(texto.get(i));
        }
    }
}
