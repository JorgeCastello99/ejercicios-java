/** 
@author PabloLancha
@javaversion 3
*/
import java.util.Scanner;

public class Excepciones1 {





public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	int sino;
	
	System.out.println("Excepciones 1");
	System.out.println("Quieres empezar? (1) Si (2) No");
	sino = sc.nextInt();
	
	while (sino == 1){
		
		codigoSinExcepciones();
		
		System.out.println("Quieres seguir? (1) Si (2) No");
		sino = sc.nextInt();
		
	}
	if (sino != 1){
		
		System.out.println("Saliendo del programa");
		
	}
	
}

public static void codigoSinExcepciones() {
	
	Scanner sc = new Scanner(System.in);
	int numero1;
	String num2;
	
	
	System.out.printf("Dame 1er numero: ");
	numero1 = sc.nextInt();
	System.out.printf("Dame 2o numero: ");
	num2 = sc.nextLine();
	num2 = sc.nextLine();
	
	int numero2 = Integer.parseInt(num2);
	
	int division = numero1 / numero2;
	
	System.out.println("Si dividimos ambos numeros, obtenemos: " +division);
	
}
}
