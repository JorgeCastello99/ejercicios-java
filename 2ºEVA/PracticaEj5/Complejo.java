import java.util.Scanner;
public class Complejo{
double real;
double imag;
//Constructor
public Complejo(){

}

public Complejo(double real,double imag){
	this.real=real;
	this.imag=imag;
}


//Metodos
public double consultaReal(){
return real;
}

public double consultaImag(){
return imag;
}

public void cambiaReal(double real){
	this.real=real;
}

public void cambiaImag(double imag){
	this.imag=imag;
}

public String toString(){
	String mensaje=""+real+" + "+imag+"i";
	return mensaje;

}
public void sumar(Complejo b){
	real=real+b.real;
    imag=imag+b.imag;
}


public static void main (String[] arg){
	 Scanner teclado= new Scanner(System.in);
	Complejo a= new Complejo();
	System.out.println(a);
	Complejo b= new Complejo(7,12);

	System.out.println("Introduzca la parte real de un numero complejo A:");    
    double real = teclado.nextDouble();
    a.cambiaReal(real);
    System.out.println("Introduzca la parte imaginaria de un numero complejo A:");
    double imag = teclado.nextDouble();
    a.cambiaImag(imag);
	
    System.out.println("OPERACIONES CON NUMERO COMPLEJO");
    System.out.println("===================");
    System.out.println("El numero A es "+a.toString());
    System.out.println("El numero B es "+b.toString());
	a.sumar(b);
    System.out.println("La suma de los numeros reales es "+a.toString());

	


}
}










