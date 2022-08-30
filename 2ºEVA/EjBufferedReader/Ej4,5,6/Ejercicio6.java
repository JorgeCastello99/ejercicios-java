import java.io.*;
public class Ejercicio6{
	public static void main(String[] args){
	try{
		
		FileWriter  escritura=new FileWriter("printerdemo.txt");
		PrintWriter pw=new PrintWriter(escritura);
		
		escritura.write(25);
		pw.print("hola q hase");
		pw.println("tamos bien");
		pw.printf("otro maas");
		escritura.close();
		
		
		
		
		
		
	}

		catch(FileNotFoundException e){
		System.out.println("excepcion File not found");
		}
		
		catch(IOException halo){
		System.out.println("error mientras se leia el fichero.");	
		}
		catch(Exception hola){
			System.out.println("excepcion allada");
		} 	
}
}