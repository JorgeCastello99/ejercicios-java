package Ejercicio1ut3;

public class Hucha{
String propietario;
double ahorradoeuros;

//Constructores
public Hucha(String propietario,double ahorradoeuros){
	this.propietario=propietario;
	this.ahorradoeuros=ahorradoeuros;
}

public Hucha(String propietarios){
	this.propietario=propietario;
}

//Metodos
public String getPropietario(){
return propietario;
}

 public void setPropietario(String propietario){
	this.propietario=propietario; 
}

public double getAhorradoeuros(){
return ahorradoeuros;
}

 public void setAhorradoeuros(double ahorradoeuros){
	this.ahorradoeuros=ahorradoeuros; 
}

public void aumentarAhorro(double cantidad){
	
	if(cantidad>=0){
		this.ahorradoeuros=ahorradoeuros + cantidad;
	}	
}

public void sacarDinero(double cantidad){
	this.ahorradoeuros=ahorradoeuros - cantidad;
	
	if(this.ahorradoeuros<0){
	this.ahorradoeuros=0;
	}
}


}