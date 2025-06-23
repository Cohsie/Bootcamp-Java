
public class Main {
    public static void main (String[]args){
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.edad = 25;
        System.out.println("Nombre: "+ persona.getNombre() +" Edad: "+ persona.getEdad());

        //Ejercicio 2
        persona.setNombre("Carlos");
        persona.setEdad(30);

        System.out.println("Nombre: "+ persona.getNombre() +"Edad: "+ persona.getEdad());
    
    }
}
