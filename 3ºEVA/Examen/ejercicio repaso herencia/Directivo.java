//Clase Directivo. Clase derivada de la clase Empleado
public class Directivo extends Empleado{

   	//constructor con un parámetro
    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Constructor de Directivo");
    }
   
   	
   	//modificación del método toString() para mostrar el mensaje adecuado
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}