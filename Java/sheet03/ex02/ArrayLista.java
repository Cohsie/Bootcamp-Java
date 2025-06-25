
import java.util.ArrayList;

public class ArrayLista {
    public static void main (String[]args){
        //Creación del ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
    
        //Añadir los elementos al ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int num1 = numeros.get(0);
        int num2 = numeros.get(1);
        int num3 = numeros.get(2);

        int suma = num1 + num2 + num3;

        System.out.println("Suma total = "+ suma);
    }


}
