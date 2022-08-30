import java.io.*;
public class Ejercicio5{
	public static void main(String[] args){
		
	try{
	FileInputStream lectura=new FileInputStream("entrada.class");
	BufferedInputStream lecturab=new BufferedInputStream(lectura);
	FileOutputStream escritura=new FileOutputStream("salida.class");
	BufferedOutputStream escriturab=new BufferedOutputStream(escritura);
	
	int lectura1=0;
		do{
			lectura1=lecturab.read();
			escriturab.write(lectura1);
		}
		while(lecturab.available()>0);
		
		lecturab.close();
		escriturab.close();
		lectura.close();
		escritura.close();
		
	}
	catch(FileNotFoundException e){
		System.out.println("excepcion File not found");
		}
		
		catch(IOException halo){
			System.out.println(halo.getMessage());
		System.out.println("error mientras se leia el fichero.");	
		}
		catch(Exception hola){
			System.out.println("excepcion allada");
		} 
	
}	
}