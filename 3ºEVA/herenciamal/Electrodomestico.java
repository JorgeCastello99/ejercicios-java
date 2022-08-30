public class Electrodomestico extends Aparato{
	

protected char consumoEnergetico;


//array del color
String[] color1={"blanco","negro","rojo","azul","gris"};
//array del consumo
char[] consumo={'A','B','C','D','E','F'};


//booleano para las comprobaciones
boolean comprobar=false;




//por defecto
public Electrodomestico(){
	precioBase=100f;
	color="azul";
	consumoEnergetico='F';
	peso=5f;
}

//con precio y peso
public Electrodomestico(float precioBase,float peso){

	this.precioBase=precioBase;
	this.peso=peso;

	color="azul";
	consumoEnergetico='F';
}

//Con todos los atributos
public Electrodomestico(float precioBase,String color,char consumoEnergetico,float peso){

		this.precioBase=precioBase;
		this.peso=peso;
		
	comprobar=comprobarColor(color);
		 if(comprobar==true){
		 		this.color=color;
			}
			else{
				this.color="azul";
			}

		comprobar=false;	
	comprobar=comprobarConsumoEnergetico(consumoEnergetico);
			if(comprobar==true){
				this.consumoEnergetico=consumoEnergetico;
			}
			else{
				this.consumoEnergetico='F';
			}
}



public char getConsumo(){
		return consumoEnergetico;
	}

protected boolean comprobarConsumoEnergetico(char letra){
	
	for(int i=0;i<consumo.length;i++){
		if(letra==consumo[i]){
			comprobar=true;
			
			
		}		
		
	}
	return comprobar;
}

protected boolean comprobarColor(String color){
	
		for(int i=0;i<color1.length;i++){
		if(color.equalsIgnoreCase(color1[i])){
			comprobar=true;
			
			
		}
	}
	return comprobar;
}

protected void precioFinal(){
	if(this.consumoEnergetico=='A'){
		this.precioBase+=100;
	}
	if(this.consumoEnergetico=='B'){
		this.precioBase+=80;
	}
	if(this.consumoEnergetico=='C'){
		this.precioBase+=60;
	}
	if(this.consumoEnergetico=='D'){
		this.precioBase+=50;
	}
	if(this.consumoEnergetico=='E'){
		this.precioBase+=30;
	}
	if(this.consumoEnergetico=='F'){
		this.precioBase+=10;
	}

	if(this.peso>0 && this.peso<=19){
		this.precioBase+=10;
	}
	if(this.peso>=20 && this.peso<=49){
		this.precioBase+=50;
	}
	if(this.peso>=50 && this.peso<=79){
		this.precioBase+=80;
	}
	if(this.peso>80){
		this.precioBase+=100;
	}

}

}