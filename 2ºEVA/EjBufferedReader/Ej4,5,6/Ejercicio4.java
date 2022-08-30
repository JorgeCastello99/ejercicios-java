import java.io.*;
public class Ejercicio4{
	public static void main(String[] args){
	
	
	
    try{
		
        char entrada;
		int numBytes=0;
		 entrada= (char)System.in.read();
		while( (char)entrada!= '\n'){
     
		
	
	
				
				if( entrada != '\r'){
					numBytes++;
				
				}
		 entrada= (char)System.in.read();
		}
		System.out.println("El numero de bytes es: "+numBytes);
	}
		catch(FileNotFoundException e){
		System.out.println("excepcion File not found");
		}
		catch(IOException halo){
		System.out.println("excepcion IO");	
		}
		
		
		catch(Exception hola){
		System.out.println("excepcion allada");
		} 
	}
}
