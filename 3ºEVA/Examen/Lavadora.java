
/**
 * Clase Lavadora
 *
 * Contiene informacion de lavador
 *
 * @author ADri
 * @version 1.0
 */
public class Lavadora extends Electrodomestico{
  
//Constantes
  
    private final static int CARGA_DEF=5;
  
//Atributos
    private int carga;
  
//Constructores
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso,consumoEnergetico,color);
        this.carga=carga;
    }

    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    /**
     * Contructor por defecto
     */
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

//Métodos publicos
  
    /**
     * Devuelve la carga de la lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public double precioFinal(){
        
        if(precioFinal==0){
            //Invocamos el método precioFinal del método padre
            double plus=super.precioFinal();
      
            //añadimos el código necesario
            if (carga>30){
                plus+=50;
            }
            precioFinal =plus;
            return precioFinal;
        }
        return precioFinal;
    }

    public String toString(){
        
        return super.toString()+", carga:"+carga;
    }
}