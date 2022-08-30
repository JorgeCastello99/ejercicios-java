import java.util.Scanner;
public class Sentencias{
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("numero: ");
	int numero = sc.nextInt();
	
	if(numero % 2==0)
	{ System.out.println("El numero es par /n");
		}
	else
	{System.out.println("el numero es impar");}
	
	
	
	System.out.println("dame a: ");
	double a= sc.nextDouble();
	
	System.out.println("dame b: ");
	double b= sc.nextDouble();
	
	System.out.println("dame c: ");
	double c= sc.nextDouble();
	
	
	if(((b * b) -4 * a * c) < 0)
		{	
		System.out.println("no es real niguna solucion");
		}
		
	else{
		double x1 =(-b + Math.sqrt((b * b) -4 * a * c) / 2 * a);
		double x2 =(-b - Math.sqrt((b * b) -4 * a * c) / 2 * a);
	
		System.out.println("x1 = "+x1+" x2 = "+x2);
		}
	
	//2.	Solicitar por entrada estándar el radio de un círculo y calcular su área. A=PI*r^2 y mostrar el resultado por salida estándar.
	
	System.out.println(" dame el radio del circulo: ");
	double rad = sc.nextDouble();
	
	
	if( rad < 0)
		{
		System.out.println("el radio no puede ser negativo");
		}
	else{
			double area = Math.PI * (rad * rad);
			System.out.println("el area del circulo es = " +area);
		}
	
	//3.	Solicitar por entrada estándar dos números y decir si son iguales o no. 
	
	System.out.println("dame primer numero: ");
	double num1= sc.nextDouble();
	
	System.out.println("dame segundo numero : ");
	double num2= sc.nextDouble();
	
	if( num1 == num2)
	{
		System.out.println("son iguales");
	}
	else{
		System.out.println("no son iguales");
		}

	//4.	Solicitar por entrada estándar un número, indicar si es positivo o negativo. 
	
		System.out.println("dame un numero: ");
		double num3= sc.nextDouble();
		
		if(num3 >= 0){
				System.out.println("es positivo");
			}
		else{
				System.out.println("es negativo");
			}
	
	
	//5.	Solicitar por entrada estándar dos números y decir si uno es múltiplo del otro. 
	
		System.out.println("dame primer numero: ");
		double num4= sc.nextDouble();
		
		System.out.println("dame segundo numero: ");
		double num5= sc.nextDouble();
		
		if(num4 % num5==0){
				System.out.println("el primero es multiplo del segundo ");
			}
		if( num5 % num4==0){
				System.out.println("el segundo es multiplo del primero");
			}
		else{
				System.out.println("no es multiplo del otro");
			}
			
	//6.	Solicitar por entrada estándar dos números y decir cual es el mayor.
	
		System.out.println("dame primer numero: ");
		double num6= sc.nextDouble();
		
		System.out.println("dame segundo numero: ");
		double num7= sc.nextDouble();
	
		
		if(num6 > num7){
				System.out.println("el mayor es el primer numero");
			}
		else{
				System.out.println("el mayor es el segundo");
			}
	
	//7.	Solicitar por entrada estándar dos números y decir cual es el mayor o si son iguales.
	System.out.println("dame primer numero: ");
		double num8= sc.nextDouble();
		
		System.out.println("dame segundo numero: ");
		double num9= sc.nextDouble();
		
	if(num8 == num9){
				System.out.println("son iguales");
			}
		else{
				if(num6 > num7){
				System.out.println("el mayor es el primer numero");
			}
				else{
				System.out.println("el mayor es el segundo");
			}
			}
	
	//8º
	
		System.out.print("introduzca idioma a traducir(es o en): ");
	String idioma = sc.nextLine();
	
	
	
	if(idioma.equals("es")){
		System.out.println("mes que quieres traducir al español: ");
		String mes = sc.nextLine();
	
		 if(mes.equals("january")){
			System.out.println("la traduccion es enero");
		}
		else if(mes.equals("february")){
			System.out.println("la traduccion es febrero");
		}
		else if(mes.equals("march")){
			System.out.println("la traduccion es marzo");
		}
		else if(mes.equals("april")){
			System.out.println("la traduccion es abril");
		}
		else if(mes.equals("may")){
			System.out.println("la traduccion es mayo");
		}
		else if (mes.equals("june")){
			System.out.println("la traduccion es junio");
		}
		else if(mes.equals("july")){
			System.out.println("la traduccion es julio");
		}
		else if(mes.equals("august")){
			System.out.println("la traduccion es agosto");
		}
		else if(mes.equals("september")){
			System.out.println("la traduccion es septiembre");
		}
		else if(mes.equals("october")){
			System.out.println("la traduccion es octubre");
		}
		else if(mes.equals("november")){
			System.out.println("la traduccion es noviembre");
		}
		else if(mes.equals("december")){
			System.out.println("la traduccion es diciembre");
		}
		
		
	}
	else{
		System.out.println("no has dado un idioma a traducir correcto");
	}
		
	 if(idioma.equals ("en")){
		System.out.println("mes que quieres traducir al ingles: ");
		String mes1 = sc.nextLine();
	
		 if(mes1.equals("enero")){
			System.out.println("la traduccion es juanary");
		}
		else if(mes1.equals("febrero")){
			System.out.println("la traduccion es february");
		}
		else if(mes1.equals("marzo")){
			System.out.println("la traduccion es march");
		}
		else if(mes1.equals("abril")){
			System.out.println("la traduccion es april");
		}
		else if(mes1.equals("mayo")){
			System.out.println("la traduccion es may");
		}
		else if (mes1.equals("junio")){
			System.out.println("la traduccion es june");
		}
		else if(mes1.equals("julio")){
			System.out.println("la traduccion es july");
		}
		else if(mes1.equals("agosto")){
			System.out.println("la traduccion es august");
		}
		else if(mes1.equals("septiembre")){
			System.out.println("la traduccion es september");
		}
		else if(mes1.equals("octubre")){
			System.out.println("la traduccion es october");
		}
		else if(mes1.equals("noviembre")){
			System.out.println("la traduccion es november");
		}
		else if(mes1.equals("diciembre")){
			System.out.println("la traduccion es december");
		}
		
	
	}
	else{
		System.out.println("no has dado un idioma a traducir correcto");
	}
	
	}
}