import java.util.Scanner;
public class Fore{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		
		//Ejercicio 1
		
		System.out.println("EJERCICIO 1");
				
		for (int i=1; i<=100; i++){
			System.out.println(i);
			}
		
		
		//Ejercicio 2
		
		System.out.println("EJERCICIO 2");
		
		for (int a=100; a>=1;a--){
			System.out.println(a);
		}
		
		
		//Ejercicio 3
		
		System.out.println("EJERCICIO 3");
		
		for (int b=0; b<=100;b++){
			 if(b%2==0 && b%3==0){
			System.out.println(b);
			 }
		}
		
		//Ejercicio 4
		
		System.out.println("EJERCICIO 4");
		
		System.out.print("Dime el numero de ventas: ");
		int ventas = sc.nextInt();
		
		int precio=0;
		int total=0;
		for(int w=1;w<=ventas; w++){
			System.out.print("Dame el precio de la venta: ");
			precio = sc.nextInt();
			total=total+precio;
		}
		System.out.println(total);
		
		
		
		//5. Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir, después muestra ese número por consola.
		
		System.out.println("EJERCICIO 5");
		
		System.out.print("Dame un numero: ");
		int nume = sc.nextInt();
		int bucle=0;
		for (int q=0;bucle<=1;q++){
			if(nume>=0){
			System.out.println("es mayor o igual a 0");
				bucle = 2;
			}
			
	
			else{
				
				
				System.out.println("No es mayor o igual a cero, dame otro numero: ");
				nume = sc.nextInt();
			}
		}
		
		
		
		//6. 
		
		
		System.out.println("EJERCICIO 6");
				
			
			
			
			int bucle1=3;
			
			
			System.out.println("introduce contraseña: ");
				String contrasena1= sc.nextLine();
			
			for(int c=0;c<bucle1;c++){
	
				
				if(contrasena1.equals("jorge")){
					
					System.out.println("enhorabuena contraseña correcta");
					bucle1=0;
				}
				else{
					System.out.println("la contraseña es incorrecta");
					System.out.println("dame la contraseña: ");
						 contrasena1= sc.nextLine();
				}
				
			
			}
		
		
		//7. Escribir un programa en Java que imprima por pantalla los cuadrados de los 30 primeros números naturales.
		
		System.out.println("EJERCICIO 7");
		
		for(int d=1;d<31;d++){
			
		;
			int num1= d * d;
			System.out.println(num1);
			
			
			
		}
		
		
		/*8.Escribir un programa en Java que muestre la tabla de multiplicar del 9. La salida ha de ser:
	9 multiplicado con 1 es igual a 9
	9 multiplicado con 2 es igual a 18
	9 multiplicado con 3 es igual a 27
	… y así hasta …
	9 multiplicado con 10 es igual a 90*/
			System.out.println("EJERCICIO 8");
			
		for(int e=0;e<11;e++){
			int tabla=9;
			
			int solucion1=tabla*e;
			System.out.println("9 multiplicado con "+e+" es igual a "+solucion1);
				
				
				
				
				
				
			}
		
		
	//9. Modificar el ejercicio 8 para que cuando se multiplica 9 por un número divisible entre 5, se muestre la tabla de multiplicar de este también.	
		System.out.println("EJERCICIO 9");
		
		for(int e=1;e<11;e++){
			
			int tabla9=9;
			int solucion1=tabla9*e;
			
			System.out.println("9 multiplicado por "+e+" es igual a "+solucion1);
				
				if(e % 5==0){
					
					for(int f=1;f<11;f++){
					
						int tabla2=e;
						int solucion2=tabla2*f;
						
					System.out.println(e+" multiplicado por "+f+" es igual a "+solucion2);
				}
							
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}