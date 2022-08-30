import java.util.Scanner;
public class expresionesaritmeticas {
public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	//1ºejercicio

	System.out.printf("que numero deseas doblar: ");
	int numero;
	numero = sc.nextInt();
	System.out.println("1) " + 2*numero); 
	
	//2º ejercicio
	
	System.out.printf("que numero deseas triplicar: ");
	int numero1;
	numero1 = sc.nextInt();
	System.out.println("2) " + 3*numero); 
	
	//3º ejercicio 6 veces diferencia de 2 numeros enteros
	System.out.printf("primer numero: ");
	int numero2;
	numero2 = sc.nextInt();
	
	System.out.printf("segundo numero: ");
	int numero3;
	numero3 = sc.nextInt();
	
	System.out.println("3) " + (numero2 - numero3) * 6);
	
	//4º ejercicio La diferencia entre el producto de A por B y la suma de C más D.
	System.out.printf("numero A: ");
	int numeroA;
	numeroA = sc.nextInt();
	
	System.out.printf("numero B: ");
	int numeroB;
	numeroB = sc.nextInt();
	
	System.out.printf("numero C: ");
	int numeroC;
	numeroC = sc.nextInt();
	
	System.out.printf("numero D: ");
	int numeroD;
	numeroD = sc.nextInt();
	System.out.println("4) " + ((numeroA * numeroB) - (numeroC + numeroD)));
	
	//5º ejercicio. La mitad de la última cifra de un número entero.
	System.out.printf("cifra: ");
	double cifra;
	cifra = sc.nextInt();
	double cifrau = cifra % 10;
	System.out.println("5) " + cifrau / 2);
	
	//6º  ejercicio. La suma de los dígitos de un número entero de 3 cifras
	
	System.out.printf("cifra con 3 digitos: ");
	int cifras;
	cifras = sc.nextInt();
	
	int suma1 = cifras % 10;
	int resto1 = cifras / 10;
	int suma2 = resto1 % 10;
	int resto2 = resto1 / 10;
	
	System.out.println(suma1 + suma2 + resto2);
	
	// 7º   La suma de la última cifra de los números enteros
	
	System.out.printf(" numero entero1: ");
	int entero;
	entero = sc.nextInt();
	
	System.out.printf(" numero entero2: ");
	int entero1;
	entero1 = sc.nextInt();
	
	int entero2 = entero % 10;
	int entero3 = entero1 % 10;
	System.out.println(entero2 + entero3);
	
	// 8º Comprobar si un número entero es múltiplo de 2 y de 3
	
	System.out.printf(" numero para comprobar si es multiplo de 2 y 3: ");
	int mult = sc.nextInt();
	
	int multi = mult % 2;
	int multi1 = mult % 3;
	
	String multiplo= multi==0 && multi1==0 ? (" es mmultiplo de 2 y 3"):(" no es multiplo de 2 y 3");  
	System.out.println("el numero "+mult+multiplo);
	
	// 9º   Comprobar si la última cifra de un número entero es par
	
	System.out.printf(" numero entero: ");
	int enter = sc.nextInt();

	int enter1 = enter % 10;
	int enter2 = enter1 %2;
	String multiplo1 = enter2==0 ? (" la ultima cifra del numero es multiplo de 2"):(" la ultima cifra del numero no es multiplo de 2");
	
	System.out.println(multiplo1);
	
	// 10º. Comprobar si la primera cifra de un número entero de 3 cifras es impar
	
	System.out.printf(" numero de 3 cifras: ");
	
	int cifr = sc.nextInt();
	
	int suma3 = cifr % 10;
	int resto3 = cifr / 10;
	int suma4 = resto3 % 10;
	int resto4 = resto3 / 10;
	int porc = resto4 % 2;
	String impar = porc==0 ? ("no impar "):(" impar");
	
	System.out.println("el numero "+cifr+" cuyo primer numero es "+resto4+", es "+impar );
	
	// 11º . Comprobar si la primera cifra de un número entero de 4 cifras es par
	System.out.printf(" numero de 4 cifras: ");
	
	int cif = sc.nextInt();
	
	int suma5 = cif % 10;
	int resto5 = cif / 10;
	int suma6 = resto5 % 10;
	int resto6 = resto5 / 10;
	int suma7 = resto6 % 10;
	int resto7 = resto6  / 10;
	
	int por = resto7 % 2;
	String impa = por==0 ? ("par "):(" no par ");
	
	System.out.println("el numero "+cif+" cuyo primer numero es "+resto7+", es "+impa );
	
	
	
	
	
	}
}