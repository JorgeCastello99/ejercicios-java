public class Television extends Electrodomestico{

	protected final static int  RESOLUCION_DEFECTO=20;
	protected final static boolean  TDT_DEFECTO=false;

	protected int resolucion;
	protected boolean tdt;

public Television(){
	this(PRECIO_BASE_DEFECTO,PESO_DEFECTO,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO);
	
	this.resolucion=RESOLUCION_DEFECTO;
	 this.tdt=TDT_DEFECTO;
}

public Television(float precioBase,float peso){
this(precioBase,peso,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO,RESOLUCION_DEFECTO,TDT_DEFECTO);

}

public Television(float precioBase,String color,char consumoEnergetico,float peso,int resolucion,boolean tdt){

this(precioBase,peso,color,consumoEnergetico,peso);
		
		this.resolucion=resolucion;
		this.tdt=tdt;
}


public int getResolucion(){
	return resolucion;
}
public boolean getTdt(){
	return tdt;
}

@Override
protected float precioFinal(){
	float preciof=this.precioBase;

	super.precioFinal();

	if(resolucion>40){
		float porcentaje=(preciof*30)/100;
		preciof+=porcentaje;
	}
	if(tdt==true){
		preciof+=50;
	}

	return preciof;
}


}