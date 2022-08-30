public class Television extends Electrodomestico{
	protected int resolucion;
	protected boolean tdt;

public Television(){
	precioBase=100f;
	color="blanco";
	consumoEnergetico='F';
	peso=5f;
	
	resolucion=20;
	 tdt=false;
}

public Television(float precioBase,float peso){
super(precioBase,peso);
	
	color="blanco";
	consumoEnergetico='F';

	resolucion=20;
	tdt=false;
	
}

public Television(float precioBase,String color,char consumoEnergetico,float peso,int resolucion,boolean tdt){

super(precioBase,color,consumoEnergetico,peso);
		
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
protected void precioFinal(){
	super.precioFinal();

	if(resolucion>40){
		float porcentaje=(this.precioBase*30)/100;
		this.precioBase+=porcentaje;
	}
	if(tdt==true){
		this.precioBase+=50;
	}


}


}