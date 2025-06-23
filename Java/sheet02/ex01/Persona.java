
class Persona {
    String nombre;
    int edad;

    void mostrarDetalles(){
        System.out.println("Nombre: "+ nombre +" edad: "+ edad);
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

