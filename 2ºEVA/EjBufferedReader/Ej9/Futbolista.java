import java.io.*;
public class Futbolista{

private String posicion,nombre;
private int nivel;

public Futbolista(String posicion,String nombre,int nivel){
	this.posicion=posicion;
	this.nombre=nombre;
	this.nivel=nivel;
	

}

public String toString(String mensaje){
	mensaje="la posicion es:"+posicion+", el nombre es: "+nombre+", el nivel es:"+nivel;
	return mensaje;
	}




	
	
}