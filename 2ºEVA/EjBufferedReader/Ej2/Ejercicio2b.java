import java.io.*;
public class Ejercicio2b{
	public static void main(String[] args){
		
	try{
		FileReader archivo=new FileReader("../fichero.txt");
		int lectura=archivo.read();
		while(lectura != -1){
			System.out.print((char)lectura);
			lectura= archivo.read();
						
		}
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