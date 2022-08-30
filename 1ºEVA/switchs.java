import java.util.Scanner;
public class switchs{
public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

//1. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
	System.out.println("dame nota entre 0 y 10: ");
	int nota= sc.nextInt();
	
	switch(nota) {
		case 0:
		System.out.println("cero");
		break;
		
		case 1:
		System.out.println("uno");
		break;
		
		case 2:
		System.out.println("dos");
		break;
		
		case 3:
		System.out.println("tres");
		break;
		
		case 4:
		System.out.println("cuatro");
		break;
		
		case 5:
		System.out.println("cinco");
		break;
		
		case 6:
		System.out.println("seis");
		break;
		
		case 7:
		System.out.println("siete");
		break;
		
		case 8:
		System.out.println("ocho");
		break;
		
		case 9:
		System.out.println("nueve");
		break;
		
		case 10:
		System.out.println("diez");
		break;
	
	}
	
	
//2. Pedir un número del 30 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.

	System.out.println("dame numero del 30 al 99");
		int num = sc.nextInt();
		int cifra = num / 10;
		int cifra2 = num % 10;
		
		switch(cifra){
			case 3:
			System.out.printf("treinta ");
			break;
			
			case 4:
			System.out.printf("cuarenta ");
			break;
			
			case 5:
			System.out.printf("cincuenta ");
			break;
			
			case 6:
			System.out.printf("sesenta ");
			break;
			
			case 7:
			System.out.printf("setenta ");
			break;
			
			case 8:
			System.out.printf("ochenta ");
			break;
			
			case 9:
			System.out.printf("noventa ");
			break;
			
			
		}			
		switch(cifra2){
			
			case 0:
		System.out.println("");
		break;
		
		case 1:
		System.out.println("y uno");
		break;
		
		case 2:
		System.out.println("y dos");
		break;
		
		case 3:
		System.out.println("y tres");
		break;
		
		case 4:
		System.out.println("y cuatro");
		break;
		
		case 5:
		System.out.println("cinco");
		break;
		
		case 6:
		System.out.println("y seis");
		break;
		
		case 7:
		System.out.println("y siete");
		break;
		
		case 8:
		System.out.println("y ocho");
		break;
		
		case 9:
		System.out.println("y nueve");
		break;
		
		}
		
//3. Pedir por entrada estándar un día de la semana en formato numérico (1-7). El programa muestra el nombre del día, basado en el valor del día.

	System.out.println("dame dia de las semana numericamente (0-7): ");
	int dia= sc.nextInt();
	
		switch(dia){
			case 1:
			System.out.println("lunes");
			break;
			
			case 2:
			System.out.println("martes");
			break;
			
			case 3:
			System.out.println("miercoles");
			break;
			
			case 4:
			System.out.println("jueves");
			break;
			
			case 5:
			System.out.println("viernes");
			break;
			
			case 6:
			System.out.println("sabado");
			break;
			
			case 7:
			System.out.println("domingo");
			break;
			
				}
	
//4. Actualizar el ejercicio anterior para que además el programa muestre si es un día 4. laborable o es un día de fin de semana.
System.out.println("dame dia de las semana numericamente (0-7): ");
	int dia1= sc.nextInt();
	
		switch(dia1){
			case 1:
			System.out.println("lunes");
			System.out.println("y es dia laborable");
			break;
			
			case 2:
			System.out.println("martes");
			System.out.println("y es dia laborable");
			break;
			
			case 3:
			System.out.println("miercoles");
			System.out.println("y es dia laborable");
			break;
			
			case 4:
			System.out.println("jueves");
			System.out.println("y es dia laborable");
			break;
			
			case 5:
			System.out.println("viernes");
			System.out.println("y es dia laborable");
			break;
			
			case 6:
			System.out.println("sabado");
			System.out.println("y es dia de fin de semana");
			break;
			
			case 7:
			System.out.println("domingo");
			System.out.println("y es dia de fin de semana");
			break;
			
				}

/*6. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien,
Notable y Sobresaliente Hacerlo primero con la estructura if y después con la
estructura switch.*/

	System.out.println("dame nota entre 0 y 10: ");
	int nota1= sc.nextInt();
	
		if(nota1>=0 && nota1<=10){
			
			if(nota1 <= 3){
				System.out.println("insuficiente");
			}
			else if(nota1 == 4){
				System.out.println("suficiente");
			}
			else if(nota1 == 5 && nota1 == 6){
				System.out.println("bien");
			}
			else if(nota1 == 7 && nota1 == 8 ){
				System.out.println("notable");
			}
			
			 else if(nota1==9 && nota1==10){
				System.out.println("sobresaliente");
			}
		
		}
				
		else{
		System.out.println("la nota no es valida");
		}
		
				
	System.out.println("dame nota entre 0 y 10: ");
	int nota2= sc.nextInt();
		
		
		switch(nota2){
		case 0 :
		System.out.println("insuficiente");
		break;
		
			
		case 4:
		System.out.println("suficiente");
		break;
		
		case 5:
		System.out.println("bien");
		break;
		
		case 6:
		System.out.println("bien");
		break;
		
		case 7:
		System.out.println("notable");
		break;
		
		case 8:
		System.out.println("notable");
		break;
		
		case 9:
		System.out.println("sobresaliente");
		break;
		
		case 10:
		System.out.println("sobresaliente");
		break;	
				
		}
				
 /*7. Crear una calculadora simple. Pedirá dos números por entrada estándar y
posteriormente mostrará un menú con diferentes opciones para sumar, restar,
dividir, multiplicar o calcular el resto. */
				System.out.printf("dame primer numero: ");
				double nume9= sc.nextDouble();
				System.out.printf("dame segundo numero: ");
				double nume10= sc.nextDouble();
				
		System.out.println("dime que deseas hacer: ");
		System.out.println("1-suma");
		System.out.println("2-resta");
		System.out.println("3-dividir");
		System.out.println("4-multiplicar");
		System.out.println("5-resto");
		int hacer = sc.nextInt();
		
		switch(hacer){
			case 1:
				System.out.println("la suma de los numeros es :"+ (nume9+nume10));
			break;
			
			case 2:			
				System.out.println("la resta de los numeros es :"+ (nume9-nume10));
			break;
			
			case 3:	
				System.out.println("la division de los numeros es :"+ (nume9/nume10));
			break;
			
			case 4:	
				System.out.println("la multiplicacion de los numeros es :"+ (nume9*nume10));	
				break;
			case 5:	
				
				System.out.println("el resto de los numeros es :"+(nume9 % nume10));
			break;
			
			default:
				System.out.println("has seleccionado opcion incorrecta");
			break;	
				
		}
		
		//Crear un menú donde el usuario pueda escoger entre la realización de diferentes programas. Al ejecutar el programa se mostrará por pantalla lo siguiente:
		
		
				
		System.out.println("dime que deseas hacer: ");
		System.out.println("1-Solicitar por entrada estandar dos números y decir si son iguales o no. ");
		System.out.println("2-Solicitar por entrada estandar un número, indicar si es positivo o negativo.");
		System.out.println("3-Solicitar por entrada estandar dos números y decir cual es el mayor.");
		System.out.println("4-Solicitar por entrada estandar dos números y decir cual es el mayor o si son iguales.");
		int hacer1 = sc.nextInt();
		
		switch(hacer1){
			case 1: 
				System.out.println("primer numero: ");
				int numer= sc.nextInt();
				
				System.out.println("segundo numero: ");
				int numer1=sc.nextInt();
				System.out.println(numer == numer1 ? ("son iguales"):("no son iguales"));
			break;
			
			case 2:		
				System.out.println("numero: ");
				int numer2 = sc.nextInt();
				System.out.println(numer2 >0 ? ("es positivo"):("es negativo"));
			break;
			
			case 3:	
				System.out.println("primer numero: ");
				int numer3= sc.nextInt();
				
				System.out.println("segundo numero: ");
				int numer4=sc.nextInt();
				
				if (numer3>numer4){
					System.out.println("el primer numero es el mayor: "+numer3);
				}
				else if(numer4>numer3){
					System.out.println("el segundo numero es el mayor: "+numer4);
				}
				
			break;
			
			case 4:	
			
			
				System.out.println("primer numero: ");
				int numer6= sc.nextInt();
				
				System.out.println("segundo numero: ");
				int numer7=sc.nextInt();
				
				if (numer6 == numer7){
					System.out.println("son iguales");	
				}
				
				else if (numer6>numer7){
					System.out.println("no son iguales y el primer numero es el mayor: "+numer6);
				}
				else{
					System.out.println("no son iguales y el segundo numero es el mayor: "+numer7); 
				}
				
				
				
				
				
		}
		
				
				
				
				
				
				









	}
}