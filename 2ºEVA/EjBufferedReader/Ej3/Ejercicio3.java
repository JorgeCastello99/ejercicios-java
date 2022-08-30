import java.io.*;
public class Ejercicio3{
	public static void main(String[] args){
	int numero=0;
	int palabra=0;
	int linea=0;
 StreamTokenizer st;

try{
	BufferedReader br= new BufferedReader(new FileReader("../fichero.txt"));
	st=new StreamTokenizer(br);
	st.nextToken();
	
	do{
		if(st.ttype==st.TT_EOL){
			linea++;
		}
		if(st.ttype==st.TT_NUMBER){
			numero++;
		}
		if(st.ttype==st.TT_WORD){
			palabra++;
		}
		st.nextToken();
	}
	while(st.ttype != st.TT_EOF );
	System.out.println("El numero de lineas es: "+linea);
	System.out.println("");
	System.out.println("El numero de numeros es:" +numero);
	System.out.println("");
	System.out.println("El numero de palabras es: "+palabra);
	
	
}
		catch(IOException halo){
		System.out.println("excepcion IO");	
		}
		
		
		catch(Exception hola){
		System.out.println("excepcion allada");
		} 
}
}