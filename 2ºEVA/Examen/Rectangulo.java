public class Rectangulo implements java.io.Serializable{

Punto puntoreferencia;
double ancho;
double alto;

public Rectangulo(Punto puntoreferencia,double ancho,double alto){
	this.puntoreferencia=puntoreferencia;
	this.ancho=ancho;
	this.alto=alto;
	
	
}



public void setPuntoReferencia(Punto puntoreferencia){
	this.puntoreferencia.setX(puntoreferencia.getX());
	this.puntoreferencia.setY(puntoreferencia.getY());
	
}


/*
public Punto setPuntoReferencia(double x,double y){
	puntoreferencia.setX(x);
	puntoreferencia.setY(y);
	return puntoreferencia
}
*/
public Punto getPuntoReferencia(){
	return puntoreferencia;
}

public void setAncho(double ancho){
	this.ancho=ancho;
	
}

public double getAncho(){
	return ancho;
}

public void setAlto(double alto){
	this.alto=alto;
	
}

public double getAlto(){
	return alto;
}

public String toString(){
	String mensaje="Las cordenadas del punto son:"+ puntoreferencia+"Alto= "+alto+", ancho= "+ancho;
	return mensaje;
}

public double calcularArea(){
	double total=ancho*alto;
	return total;
}

public void desplazar(double dx, double dy){
	
	puntoreferencia.setX(puntoreferencia.getX()+dx);
	puntoreferencia.setY(puntoreferencia.getY()+dy);
}


public boolean estaDentro(Punto p){
	boolean dentro;
	if((p.getX() >puntoreferencia.getX()&& p.getX()<puntoreferencia.getX()+ancho) && (p.getY() >puntoreferencia.getY() && p.getX()<puntoreferencia.getX()+alto)){
	
		dentro =true;
		return dentro;
	}
	else{
		
		dentro=false;
		return dentro;
	}
	
}




}