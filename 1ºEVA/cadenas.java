import java.util.Scanner;
public class cadenas {
public static void main(String[]args) {
	
	//1º
	Scanner sc = new Scanner(System.in);
	String texto;
	System.out.print("Introduzca un texto: ");
	texto = sc.nextLine();
	System.out.println("1) "+texto.toLowerCase());
	
	
	
	//2º2.	Solicitar por entrada estándar el radio de un círculo y calcular su área. A=PI*r^2 y mostrar el resultado por salida estándar.
	String texto1;
	System.out.print("Introduzca un texto: ");
	texto1 = sc.nextLine();
	System.out.println("2) " +texto1.toUpperCase());
	
	//3º
	
	String texto2;
	System.out.print("Introduzca primer texto: ");
	texto2 = sc.nextLine();
	
	String texto3;
	System.out.print("Introduzca segundo texto: ");
	texto3 = sc.nextLine();
	
	String comparacion= texto2.equalsIgnoreCase(texto3)? "igual" : "diferente";
	System.out.println("3) "+comparacion);
	// 4º
	
	String texto4;
	System.out.print("Introduzca caracteres: ");
	texto4 = sc.nextLine();
	System.out.println("4) " +texto4.length());
	
	// 5º
	
	String texto5 = "El día soleado me hace muy feliz, sobre todo cuando no produce fuego en el bosque.";
	
	String text6= texto5.substring(0,3);
	String text7= texto5.substring(8,11);
	String text8= texto5.substring(55,83);
	
	System.out.printf("5) "+text6);
	System.out.printf(text7);
	System.out.printf(text8);
	

	}
}