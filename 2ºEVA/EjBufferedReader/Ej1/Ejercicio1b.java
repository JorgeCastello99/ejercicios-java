import java.io.*;
public class Ejercicio1b{
	public static void main(String[] args){
	char hola;
	String cadena="";
	String cadena2="";
	try{
		InputStreamReader isr= new InputStreamReader(System.in);
	
	System.out.println("introduce tu nombre: ");
		
		
		
	do{
		hola=(char)isr.read();
		cadena2=Character.toString(hola);
		cadena=cadena.concat(cadena2);
		
		
	}
	while(hola!='\n');
		System.out.println("su nombre es: "+cadena);

	}
		catch(Exception a){
			System.out.println("excepcion allada");
		} 
		
	
	
}
}
