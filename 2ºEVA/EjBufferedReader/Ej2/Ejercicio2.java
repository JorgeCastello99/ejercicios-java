import java.io.*;
public class Ejercicio2{
	public static void main(String[] args){
FileReader fr;
BufferedReader br;

try{
fr=new FileReader ("C:\\Users\\Jorge\\Desktop\\PROGRAMACIÓN\\ejerciciosjava\\2ºEVA\\EjBufferedReader\\fichero.txt");
br=new BufferedReader(fr);
String s;
while((s=br.readLine())!= null){
	System.out.println(s);
	
}


}
		
		catch(IOException halo){
		System.out.println("excepcion IO");	
		}
		
}
}