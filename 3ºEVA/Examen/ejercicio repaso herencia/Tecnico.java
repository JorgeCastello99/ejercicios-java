//Clase Tecnico. Clase derivada de la clase Operario
public class Tecnico extends Operario{

	//constructor con un parámetro
    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Tecnico");
    }
   
   	//modificación del método toString() para mostrar el mensaje adecuado
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}