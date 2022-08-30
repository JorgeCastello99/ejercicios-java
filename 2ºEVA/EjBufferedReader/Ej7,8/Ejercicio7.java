import java.io.*;
public class Ejercicio7{
	public static void main(String[] args){
	try{
	FileOutputStream salida= new FileOutputStream("agenda.bin");
	DataOutputStream sal= new DataOutputStream(salida);
	
	sal.writeUTF("Jorge Castello Paniagua");
	sal.writeInt(345343455);
	sal.writeUTF("Perico el de los palotes");
	sal.writeInt(123321123);
	
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
		finally{
			sal.close();
		}
	
	try{
		FileInputStream  fichero= new FileInputStream ("agenda.bin");
	DataInputStream primero= new DataInputStream(fichero);
	
	System.out.println("nombre: "+ primero.readUTF());
	System.out.println("Telefono: "+ primero.readInt());
	System.out.println("nombre: "+ primero.readUTF());
	System.out.println("Telefono: "+ primero.readInt());
	
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