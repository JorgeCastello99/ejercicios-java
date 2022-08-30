import java.util.Scanner;
public class trye {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
int num	=0;
int divisor=5;
int total=0;

int vuelta=1;
boolean seguir= true;

	do{
		
	try{	
	
		System.out.println("dame numero entero");
		num = sc.nextInt();
		
		total= divisor /num;
		System.out.println("el resultado es: "+total);
		seguir=false;
		
	}
			
	
	catch(java.util.InputMismatchException dato){
		System.out.println("dato introducido no válido");
		seguir=true;
	}
	catch(ArithmeticException dividir){
		System.out.println("no se puede dividir entre 0");
		seguir=true;
	}
	catch(Exception pollas){
		System.out.println("pollas");
		seguir=true;
	}
	}
	while(seguir==true);
	
	    
}
}