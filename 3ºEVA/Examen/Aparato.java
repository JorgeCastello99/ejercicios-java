/**
 * Clase Aparato
 *
 * Contiene informacion abstracta de un aparato
 * @version 1.0
 */
abstract class Aparato{


    //Atributos
    protected double precioBase;
    protected String color;
    protected double peso;
    
    
	// Métodos abstractos
    abstract protected  double getPrecioBase();
    abstract protected  String getColor();
   	abstract protected  double getPeso();

}