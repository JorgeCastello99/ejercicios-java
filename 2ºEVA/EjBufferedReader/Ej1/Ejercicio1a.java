import java.io.*;
public class Ejercicio1a{
	public static void main(String[] args){
	try{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduce tu nombre");
		String nombre= br.readLine();
		System.out.println("el nombre es: "+nombre);
		
	}	
		catch(Exception hola){
			System.out.println("excepcion allada");
		} 
		catch(IOException halo){
		System.out.println("excepcion IO");	
		}
		catch(FileNotFoundException e){
		System.out.println("excepcion File not found");
		}
		
		
	}
}