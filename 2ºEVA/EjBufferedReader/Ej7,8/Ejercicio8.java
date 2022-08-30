import java.io.*;
public class Ejercicio8{
	public static void main(String[] args){
	String nombre1="Jorge Castello",nombre2="Sofiane",nombre3="Alejandro";
	long telefono1=123123123,telefono2=234234234,telefono3=345345345;
	
	int tam_registro=136;
	int tam_nombre=68;
	i=0;
	
	try{

		
		RandomAccessFile rand=new RandomAccesFile("accesoAleatorio.bin","rw");
		StringBuffer usuario1= new StringBuffer(nombre1);
		StringBuffer usuario2= new StringBuffer(nombre2);
		StringBuffer usuario3= new StringBuffer(nombre3);
		
		usuario1.setLength((byte)64);
		usuario2.setLength((byte)64);
		usuario3.setLength((byte)64);
		
		String usuari1=usuario1.toString();
		String usuari2=usuario2.toString();
		String usuari3=usuario3.toString();
		
		i=rand.getFilePointer();
		rand.seek(i);
		usuari1.writeChars(nombre1);
		writeLong(telefono1);

	
	
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