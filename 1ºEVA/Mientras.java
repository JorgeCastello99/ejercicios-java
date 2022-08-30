import java.util.Scanner;
public class Mientras{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
	
		int i= +5;
		while(i>0)
		i--;
		
		i++;
		System.out.println(""+i);
		
		System.out.println("EJERCICIO 1");
		
	//1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca unnúmero negativo

	System.out.println("dame numero: ");
	double num= sc.nextDouble();

	while(num>=0){
		double num1= num*num;
		System.out.println("del cuadrado del numero es: "+num1);
	System.out.println("dame numero: ");
	 num= sc.nextDouble();

	}
	

	//2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que seintroduzca un 0.
System.out.println("EJERCICIO 2");
	
	System.out.println("dame numero: ");
	double num2= sc.nextDouble();
	
		while(num2!=0){
		if(num2<0){
		System.out.println("el numero "+num2+" es negativo");
		
		System.out.println("dame numero: ");
		num2= sc.nextDouble();
		}
		else{
		System.out.println("el numero "+num2+" es positivo");
		System.out.println("dame numero: ");
		
		num2= sc.nextDouble();
		}
	}
	
	//3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar
	System.out.println("EJERCICIO 3");
	
	
	System.out.println("dame numero: ");
	double num3= sc.nextDouble();
	
		while(num3!=0){
		if(num3 % 2==0) {
			
		System.out.println("el numero es par");
		
		System.out.println("dame numero: ");
		num3= sc.nextDouble();
		}
		else{
		System.out.println("el numero es impar");
		
		System.out.println("dame numero: ");
		num3= sc.nextDouble();
		}
	
		
}


//4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se hanintroducido.
System.out.println("EJERCICIO 4");


	System.out.println("dame numero: ");
	int num4=sc.nextInt();
	int cont=0;
	
	while(num4>=0){
		System.out.println("el numero es positivo");
		
		cont++;
		
		System.out.println("dame numero: ");
		num4= sc.nextInt();
		
	}
	cont++;
	System.out.println("el total de numero introducidos es "+cont);


	System.out.println("EJERCICIO 5");
	
	System.out.println("dame numero a adivinar: ");
	int num5=sc.nextInt();
	
	System.out.println("dame numero: ");
	int num6=sc.nextInt();
	
	while(num6!=num5){
		if(num6>num5){
		System.out.println("es incorrecto el numero a acertar es menor");
		System.out.println("dame numero: ");
		num6=sc.nextInt();
		}
		else{
			System.out.println("es incorrecto el numero a acertar es mayor");
		System.out.println("dame numero: ");
		num6=sc.nextInt();
		}
		
	}
	System.out.println("has acertado el numero");
	
	
	//6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
			System.out.println("EJERCICIO 6");
	
			System.out.println("dame numero: ");
	double num7= sc.nextDouble();
			double suma=0;
			
		while(num7!=0){
		
		suma = suma + num7;
		
		System.out.println("dame numero: ");
		num7= sc.nextDouble();
				
}
	System.out.println("la suma de todos los numeroses: "+suma);

	
	
//7. Pedir números hasta que se introduzca uno negativo, y calcular la media
		System.out.println("EJERCICIO 7");

System.out.println("dame numero: ");
	int num8=sc.nextInt();
	double suma1=0;
	int cons=0;
	
	while(num8>=0){
		System.out.println("el numero es positivo");
		
		suma1= suma1 +num8;
		
		System.out.println("dame numero: ");
		num8= sc.nextInt();
		cons++;
	}
	System.out.println("la media es:" +(suma1 / cons) );
	
	
	//8. Pedir 15 números y escribir la suma total.

	System.out.println("EJERCICIO 8");
	int suma2=0;
	int cons1=15;
	
	
	
	System.out.println("dame numero: ");
	int num9=sc.nextInt();
	while(cons1>0){
		
	suma2= suma2+num9;
	
	System.out.println("dame numero: ");
	num9=sc.nextInt();
	
	cons1--;
	}
	System.out.println("el total es: "+suma2);
	
	//9. Diseñar un programa que muestre el producto de los 10 primeros números impares
	
	System.out.println("EJERCICIO 9");
	int contador2=10;
	int impares=-1;
	int multiplicacion=1;
	while(contador2>0){
		impares= impares+2;
		multiplicacion= multiplicacion * impares;
		
	
	
	contador2--;
	
	}
	System.out.println("la multiplicacion de las 10 primeros numeros impares es: "+multiplicacion);
	
	
	//10. Pedir un número y calcular su factorial. El factorial sería // 10*9*8*7*6*5*4*3*2*1
	System.out.println("EJERCICIO 10");
	
	System.out.println("dame un numero para calcular su factorial: ");
	int nu=sc.nextInt();
	
	int n=1;
	
	while(nu>0){
		
			n =n * nu;
			nu--;
	}
	System.out.println("su factorial es: "+n);
	
	
	
	//11. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
	
	System.out.println("EJERCICIO 11");
	
	int num10=10;
	int n1=0; int media=0;
	int n2=0; int media1=0;
	int ceros=0;

	while(num10>0){
		
	System.out.println("dame numero ");
	int numer1=sc.nextInt();
	
		if(numer1>0){
			media++;
			n1=n1+numer1;
			
		}
		else if(numer1<0){
			media1++;
			n2=n2+numer1;
		}
		else{
			ceros++;
		}
				
	num10--;
	}
	System.out.println("media de numeros positivos:"+(n1 / media));
	
	System.out.println("media de numeros positivos:"+(n2 / media1));
	
	System.out.println("cantidad de ceros introducidos:"+ceros);
	
	
	
	
	//Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
	
	System.out.println("EJERCICIO 12");
	
	int numer11=10;
	int n3=0;
	int mayores=0;
	while(numer11>0){
		
	System.out.println("dame sueldo: ");
	int numer12=sc.nextInt();
	
	
	n3= n3 + numer12;
		if(numer12>1000){
			mayores++;
		}
		
	
	numer11--;
	}
	System.out.println("la suma de todos los suledos es: "+n3);
	System.out.println("suledos mayores de 1000: "+mayores);
	
	
	
	//13º Pide un número (que debe estar entre 0 y 10 obligatoriamente para poder avanzar) y mostrar la tabla de multiplicar de dicho número.
	
	System.out.println("EJERCICIO 13");
	
	int multiplicando=1;
	int problema=1;
	System.out.println("dame numero entre 0 y 10");
			int numerit= sc.nextInt();
	
				if (numerit>10 || numerit<0){
					System.out.println("el numero es invalido");
				}
					else{																	
							do{
	
					 problema = numerit * multiplicando;
					System.out.println(numerit+"multiplicado por "+multiplicando+" = " +problema);
					
					multiplicando++;
					problema++;								
								}	
									while(multiplicando<=10);
	
					
					}
		
	
	//14. Pedir 5 números, indicar si alguno es múltiplo de 3 y al final mostrar el número de números múltiplos de 3 encontrados.
	
	System.out.println("EJERCICIO 14");
	
	int contador5=5;
	int multiplo1=0;
	int multip=0;
	do{
		System.out.println("dame numero: ");
		int numerit1= sc.nextInt();
		
		if (numerit1 % 3 ==0){
			multip++;
			System.out.println("es multiplo de 3");
			multiplo1=multiplo1+numerit1;
			
		}
		
		
		contador5--;
	}
	while(contador5>0);
	
	System.out.println("hay "+multip+" multiplos de 3");
	
	
	//15. Igual que el ejercicio anterior pero el programa seguirá pidiendo números mientras no se introduzca el 0.
	System.out.println("EJERCICIO 15");
	
	int multiplo2=0;
	int multip1=0;
	int numerit2=0;
	
	
		do{
		System.out.println("dame numero: ");
		numerit2= sc.nextInt();
		
		if(numerit2 !=0){
			
		
		 if (numerit2 % 3 ==0){
			multip1++;
			System.out.println("es multiplo de 3");
			multiplo2=multiplo2+numerit2;
			
		}
		}
		
		else if(numerit2==0){
			System.out.println("programa terminado");
		}
		
		}
		
	
	while(numerit2!=0);
	
	System.out.println("hay "+multip1+" multiplos de 3");
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
}
		
