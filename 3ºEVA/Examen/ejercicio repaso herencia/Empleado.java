//Clase Empleado. Clase Base de la jerarquía
public class Empleado {
    private String nombre;

    //constructor con un parámetro
    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }
   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado
    public String toString() {
        return "Empleado " + nombre;
    }
}















