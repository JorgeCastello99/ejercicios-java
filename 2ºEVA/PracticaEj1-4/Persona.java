import java.util.Scanner;
public class Persona{
String nombre;
int edad;
float altura;

public Persona(String nombre,int edad,float altura){
	this.nombre=nombre;
	this.edad=edad;
	this.altura=altura;
}
public Persona(){
nombre="Luisa Perez";
edad=20;
altura=1.70f;
}
//metodos

	public String consultaNombre(){
	return nombre;
	}
	public void cambiaNombre(String nom){
		nombre=nom;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public float getAltura(){
		return altura;
	}
	public void setaltura(float altura){
		this.altura=altura;
	}
	public String toString(){
		String mensaje= "el nombre es: "+nombre+", su edad es de "+edad+" anos y tiene una altura de "+altura+" metros";
		return mensaje;
	}
}