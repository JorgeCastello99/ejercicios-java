public class Punto implements java.io.Serializable{

private double x;
private double y;





public Punto(double x,double y){
	this.x=x;
	this.y=y;
	
	
}

protected void setX(double x){
	
	this.x=x;
}
protected double getX(){
	
	return x;
}

protected void setY(double y){
	
	this.y=y;
}
protected double getY(){
	
	return y;
}
public String toString(){
	String mensaje="el eje x es: "+x+" el eje y es: "+y;
	return mensaje;
	
}
}

