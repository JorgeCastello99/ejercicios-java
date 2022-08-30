/** 
@author PabloLancha
@javaversion 3
*/
import java.util.Scanner;

public class Excepciones4 {


public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	int sino;
	
	System.out.println("Excepciones 3");
	System.out.println("Quieres empezar? (1) Si (2) No");
	sino = sc.nextInt();
	
	while (sino == 1){
		
		codigoConExcepciones4();
		
		System.out.println("Quieres seguir? (1) Si (2) No");
		sino = sc.nextInt();
		
	}
	if (sino != 1){
		
		System.out.println("Saliendo del programa");
		
	}
	
}


public static void codigoConExcepciones4() {
	
	Scanner sc = new Scanner(System.in);
	int numero1;
	String num2;
	int div = 0;
	
	try {
	System.out.printf("Dame 1er numero: ");
	numero1 = sc.nextInt();
	sc.nextLine();
	System.out.printf("Dame 2o numero: ");
	num2 = sc.nextLine();
	int numero2 = Integer.parseInt(num2);
	div = division(numero1, numero2);
	}
	catch (NumberFormatException b) {
		System.out.println("Error: No se puede dejar el campo en blanco");
	}
	catch (java.util.InputMismatchException letra) {
		System.out.println("Error. No se admite el formato");
	}
	
	System.out.println("El resultado es: "+div);
	
}

public static int division (int a, int b) throws ArithmeticException{
	
	int division =0;
	
	try {
		division = a / b;
	}
	catch (ArithmeticException div) {
		System.out.println("Se ha producido el siguiente error : "+div+ " -> No se puede dividir entre 0");
	}
	finally {
	System.out.println("Si dividimos ambos numeros, obtenemos: " +division);
	}
	return division;
}

}