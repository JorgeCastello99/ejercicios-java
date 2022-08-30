public class Electrodomestico extends Aparato{
	

protected final static float  PRECIO_BASE_DEFECTO=100f;
protected final static String  COLOR_DEFECTO="blanco";
protected final static char  CONSUMO_ENERGETICO_DEFECTO='F';
protected final static float  PESO_DEFECTO=5f;





protected  char consumoEnergetico;

//array del color
String[] color1={"blanco","negro","rojo","azul","gris"};
//array del consumo
char[] consumo={'A','B','C','D','E','F'};


//booleano para las comprobaciones





//por defecto
public Electrodomestico(){
	
	this.precioBase=PRECIO_BASE_DEFECTO;
	this.color=COLOR_DEFECTO;
	this.consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
	this.peso=PESO_DEFECTO;
}


//con precio y peso
public Electrodomestico(float precioBase,float peso){

	this.precioBase=precioBase;
	this.peso=peso;

	color=COLOR_DEFECTO;
	consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
}

//Con todos los atributos
public Electrodomestico(float precioBase,String color,char consumoEnergetico,float peso){

		this.precioBase=precioBase;
		comprobarColor(color);		
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso=peso;
		
	
	

			
}



public char getConsumo(){
		return consumoEnergetico;
	}


private void comprobarConsumoEnergetico(char letra){
	
/*
if(consumoenergetico>=65 && consumoenergetico<=78{
	esto es para los char 
})


*/
		boolean comprobar=false;
	for(int i=0;i<consumo.length;i++){
		if(letra==consumo[i]){
			comprobar=true;
			
			
		}			
	}

		if(comprobar==true){
				this.consumoEnergetico=consumoEnergetico;
			}
			else{
				this.consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
			}

	
}

protected void comprobarColor(String color){
	boolean comprobar=false;

		for(int i=0;i<color1.length;i++){
		if(color.equalsIgnoreCase(color1[i])){
			comprobar=true;
					
		}
	}

		 if(comprobar==true){
		 		this.color=color;
			}
			else{
				this.color=COLOR_DEFECTO;
			}
}

protected float precioFinal(){
	float preciof=this.precioBase;
	if(this.consumoEnergetico=='A'){
		preciof+=100;
	}
	if(this.consumoEnergetico=='B'){
		preciof+=80;
	}
	if(this.consumoEnergetico=='C'){
		preciof+=60;
	}
	if(this.consumoEnergetico=='D'){
		preciof+=50;
	}
	if(this.consumoEnergetico=='E'){
		preciof+=30;
	}
	if(this.consumoEnergetico=='F'){
		preciof+=10;
	}

	if(this.peso>0 && this.peso<=19){
		preciof+=10;
	}
	if(this.peso>=20 && this.peso<=49){
		preciof+=50;
	}
	if(this.peso>=50 && this.peso<=79){
		preciof+=80;
	}
	if(this.peso>80){
		preciof+=100;
	}
	return preciof;
}

}