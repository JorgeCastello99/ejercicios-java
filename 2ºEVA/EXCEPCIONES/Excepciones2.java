/** 
@author PabloLancha
@javaversion 3
*/
import java.util.Scanner;

public class Excepciones2 {


public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	int sino;
	
	System.out.println("Excepciones 2");
	System.out.println("Quieres empezar? (1) Si (2) No");
	sino = sc.nextInt();
	
	while (sino == 1){
		
		codigoConExcepciones2();
		
		System.out.println("Quieres seguir? (1) Si (2) No");
		sino = sc.nextInt();
		
	}
	if (sino != 1){
		
		System.out.println("Saliendo del programa");
		
	}
	
}


public static void codigoConExcepciones2() {
	
	Scanner sc = new Scanner(System.in);
	int numero1;
	String num2;
	
	int division =0;
	try {
		System.out.printf("Dame 1er numero: ");
		numero1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("Dame 2o numero: ");
		num2 = sc.nextLine();
		int numero2 = Integer.parseInt(num2);
		

		division = numero1 / numero2;
	
	}
	catch (java.util.InputMismatchException letra) {
		System.out.println("Error. No se admite el formato");
	}
	catch (NumberFormatException b) {
		System.out.println("Error: No se puede dejar el campo en blanco");
	}
	catch (ArithmeticException div) {
		System.out.println("Error. No se puede dividir entre 0");
	}
	//catch (Exception
	finally {
	System.out.println("Si dividimos ambos numeros, obtenemos: " +division);
	}
	
}

}