public class Oficial extends Operario{

	//constructor con un parámetro
    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor de Oficial");
    }
   
   	
   	//modificación del método toString() para mostrar el mensaje adecuado
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}