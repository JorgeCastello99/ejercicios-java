public class Lavadora extends Electrodomestico{
	
protected final float carga;


//por defecto
public Lavadora(){
	precioBase=100f;
	color="blanco";
	consumoEnergetico='F';
	peso=5f;
	carga=5;
	
}

//con precio y peso
public Lavadora(float precioBase,float peso){
super(precioBase,peso);
	
	color="blanco";
	consumoEnergetico='F';

	carga=5;
	
}

public Lavadora(float precioBase,String color,char consumoEnergetico,float peso,float valor){

super(precioBase,color,consumoEnergetico,peso);
		carga=valor;
		
}

public float getCarga(){
		return carga;
	}


protected void precioFinal(){
	super.precioFinal();

	if(this.carga>30){
		this.precioBase+=50;
	}
}




}