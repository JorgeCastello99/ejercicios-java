import java.io.*;
public class InputPrueba{
public static void main (String[] args){
sumar();
cadenas();
}


public static void sumar(){
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String cadena="";
try{	
	System.out.printf("dame umero entero: ");
	cadena=br.readLine();
	int numeroe = Integer.parseInt (cadena);
	
	System.out.printf("dame numero float: ");
	cadena=br.readLine();
	float numerof=Float.parseFloat(cadena);
	
	System.out.printf("dame numero double: ");
	cadena=br.readLine();
	double numerod=Double.parseDouble(cadena);

	System.out.printf("numeros no redondeados: "+numeroe+" | "+numerof+" | "+numerod+"\n");
	float numerof2=(float) Math.round(numerof*100)/100;
	double numerod2=(double) Math.round(numerod*100)/100;
	
	System.out.printf("numeros redondeados:"+numeroe+" | "+numerof2+" | "+numerod2);
System.out.println("");

	double suma= numeroe+numerof+numerod;
	double total= (double) Math.round(suma*100)/100;
	System.out.printf("la suma de los numeros %d + %.2f + %.2f = %.2f \n",numeroe,numerof2,numerod2,total);


	System.out.println("=========================");
	}
	catch(Exception tipo1){
		System.out.printf("hay excepcion");
	}	
}

public static void cadenas(){
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	try{
	
	
	System.out.printf("dame nombre : ");
	String nombre=br.readLine();
	
	System.out.printf("dame otro nombre : ");
	String nombre1=br.readLine();
	
	System.out.printf("Los nombres introducidos son %s y %s ",nombre,nombre1);
	}
	catch(Exception tipo2){
		System.out.printf("hay excepcion");
	}
	
	
	
	








}



}