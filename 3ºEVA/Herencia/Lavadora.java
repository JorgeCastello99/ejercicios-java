public class Lavadora extends Electrodomestico{
	
protected final static float  CARGA_DEFECTO=5f;


protected float carga;


//por defecto
public Lavadora(){
	
}

//con precio y peso
public Lavadora(float precioBase,float peso){

	
this(PRECIO_BASE_DEFECTO,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO,CARGA_DEFECTO);
	
	
}

public Lavadora(float precioBase,String color,char consumoEnergetico,float peso,float carga){

this(precioBase,color,consumoEnergetico,peso);

		this.carga=carga;
		
}

public float getCarga(){
		return carga;
	}


protected float precioFinal(){
	float preciof=this.precioBase;
	super.precioFinal();

	if(this.carga>30){
		preciof+=50;
	}
	return preciof;
}




}