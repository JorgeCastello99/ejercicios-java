public class Ejercicio1s{
public static void main(String[] args){
	System.out.println("=======Ej1=======");

//Ej1
	String a="Aprendiendo JAVA en Bargas";
	
	int b=a.length();
	char i=0;
	while(i < b){
		char c =(char) a.charAt(i);
		System.out.print(c);
		i++;		
	}
	System.out.println();
	System.out.println("=======Ej2=======");
//Ej2
	String a2=a.substring(11);
	System.out.print(a2);
	System.out.println();
	System.out.println("=======Ej3=======");
//Ej3	
	String cadena="2019";
	String cadena2="201.89";
	
	double n,d;
	try {
	n=Double.valueOf(cadena).doubleValue();
	d=Double.valueOf(cadena2).doubleValue();
	
	
	if(n> 524){
			System.out.println(n+" Es mayor que 524");

	}
	else{
		System.out.println(n+" Es menor que 524");
	}
	if(d> 524){
			System.out.println(d+" Es mayor que 524");

	}
	else{
		System.out.println(d+" Es menor que 524");
	}
	} 
	catch (NumberFormatException e)
	{ /* Código a ejecutar si no se puede convertir */
		System.out.println("No se puede convertir");
	}
	
	System.out.println();
	System.out.println("=======Ej4=======");
//Ej4
		String cadena3=" Desayuno chorizo con panceta. ";
		String cadena4=" Meriendo huevos fritos con lomo. ";

		if(cadena3.equals(cadena4)){
			System.out.println("Las cadenas son iguales");
		}
		else{
			System.out.println("Las cadenas son diferentes");
		}

		String cadena31=cadena3.trim();
		String cadena41=cadena4.trim();

		System.out.println(cadena31.replace('a','o'));
		System.out.println(cadena41.replace('a','o'));

			System.out.println("=======Ej5=======");

//Ej5
	String cadena5="Hola buenos días";
	String cadena6="Hola";
	
	boolean  cadena51=cadena5.startsWith(cadena6);
	boolean cadena61=cadena6.contains(cadena5);
	if(cadena51==true){
		System.out.println("Las dos empiezan igual");
	}
	else{
		System.out.println("No empiezan igual");
	}
	if(cadena61==true){
		System.out.println("la cadena6 esta contenida dentro de cadena5");
	}
	else{
		System.out.println("No estan contenidas");
	}
	
}
}
















