/**
 * Clase Electrodomestico
 *
 * Contiene informacion de los electrodomesticos
 * @version 1.0
 */
public class Electrodomestico extends Aparato {
   
//Constantes 
    /**
     * Por defecto. Se usarán en los constructores para simplificar la asignación por defecto
     en las diferentes zonas del código que es necesario.
     */
    protected final static double PESO_DEF=5;
    protected final static String COLOR_DEF="blanco";
    protected final static double PRECIO_BASE_DEF=100;
    protected final static char CONSUMO_ENERGETICO_DEF='F';
   

//Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    protected double precioFinal=0;

//Constructores
   
    /**
     * Constructor con 4 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    /**
     * Contructor con 2 parametros
     * @param precioBase del electrodomestico
     * @param peso del electrodomestico
     */
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }

    /**
     * Contructor por defecto
     */
    public Electrodomestico(){

        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }


//Métodos privados

    /**
     * Comprueba el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     * @param consumoEnergetico
     */
    private void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=71){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
          
    }


    private void comprobarColor(String color){
   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equalsIgnoreCase(color)){
                encontrado=true;
                this.color=color;
            }
        }
          
        if(!encontrado){
            this.color=COLOR_DEF;
        }    
    }
      
   
    //Métodos publicos
    /**
     * Devuelve el precio base del electrodomestico
     * @return precio base del electrodomestico
     */
    public double getPrecioBase() {
        return precioBase;
    }
    /**
     * Devuelve el color del electrodomestico
     * @return color del elesctrodomestico
     */
    public String getColor() {
        return color;
    }
   
     /**
     * Devuelve el consumo energetico del electrodomestico
     * @return consumo energetico del electrodomestico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    /**
     * Devuelve el peso del electrodomestico
     * @return peso del electrodomestico
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Precio final del electrodomestico
     * @return precio final del electrodomestico
     */
    public double precioFinal(){

        if(precioFinal==0){ 
            double plus=0;

            //calculo el plus por el consumo energético
            switch(consumoEnergetico){
                case 'A':
                    plus+=100;
                    break;
                case 'B':
                    plus+=80;
                    break;
                case 'C':
                    plus+=60;
                    break;
                case 'D':
                    plus+=50;
                    break;
                case 'E':
                    plus+=30;
                    break;
                case 'F':
                    plus+=10;
                    break;
                 case 'G':
                    break;
            }
       
            //calculo el plus por el peso
            if(peso>=0 && peso<=19){
                plus+=10;
            }else if(peso>=20 && peso<=49){
                plus+=50;
            }else if(peso>=50 && peso<=79){
                plus+=80;
            }else if(peso>=80){
                plus+=100;
            }
            precioFinal=precioBase+plus;
            return precioBase+plus;
        }
        else return precioFinal;
    }
   
    public String toString(){
        return "Color: "+color+", consumo:"+consumoEnergetico+", peso:"+peso+", precioBase:"+precioBase+", precioFinal:"+precioFinal;
    }
   
}