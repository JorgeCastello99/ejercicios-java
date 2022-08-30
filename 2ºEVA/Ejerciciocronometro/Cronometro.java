
public class Cronometro{
public double tiempo;
public double tiempo1;
public double tiempo2;
public double  reset=0;

public Cronometro(){
	this.tiempo1=tiempo1;
	this.tiempo2=tiempo2;
	this.tiempo=tiempo;
}


public void resetear(){
	tiempo1=0;
	tiempo2=0;
	tiempo=0;
}

public static double tiempoTotal(double tiempo1,double tiempo2){
	double tiempo=(tiempo2-tiempo1)/1000;
	 return tiempo;
}
}