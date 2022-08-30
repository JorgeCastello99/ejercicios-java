
/**
 * Clase Television
 *
 * Contiene informacion de una television
 *
 * @version 1.0
 */
public class Television extends Electrodomestico{
  
//Constantes
    private final static int RESOLUCION_DEF=20;
  
//Atributos
    private int resolucion;
    private boolean sintonizadorTDT;
 
//Constructor
  
    /**
     * Constructor por defecto
     */
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Contructor con 6 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        //no es necesario indicarlo ya que se llama automáticamente a super
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }  
//Métodos publicos
  
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public double precioFinal(){
        
        if(precioFinal==0){

            //Invocamos el método precioFinal del método padre
            double plus=super.precioFinal();
      
            //Añadimos el codigo necesario
            if (resolucion>40){
                plus+=precioBase*0.3;
            }
            if (sintonizadorTDT){
                plus+=50;
            }
            precioFinal=plus;
            return plus;
        }
        return precioFinal;
    }
  
    public String toString(){
        
        return super.toString()+", resolucion:"+resolucion+", sintonizadorTDT:"+sintonizadorTDT;
    }
}