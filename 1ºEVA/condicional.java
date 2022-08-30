import java.util.Scanner;
public class condicional{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
	
		//1. Programa	Java	que	lea	un	número	entero	y	calcule	si	es	par	o	impar.
		int num;
		System.out.println("dame un numero entero: ");
		num = sc.nextInt();
		
		if( num % 2 ==0 ){
			System.out.println("es par");
		}
		else{
			System.out.println("es impar");
		}
		
		
	//2. Programa	que	lea	un	número	entero	y	muestre	si	el	número	es	múltiplo	de	10.

		int num1;
			System.out.println("dame un numero entero: ");
			num1 = sc.nextInt();
		
		if( num1 % 10 ==0 ){
			System.out.println("es multiplo de 10");
		}
		else{
			System.out.println("no es multiplo de 10");
		}
		
		
		
	//3. Programa	que	lea	un	carácter	por	teclado	y	compruebe	si	es	una	letra mayúscula

	char letra;
	System.out.println("dame una letra en mayusculas o minusculas: ");
	letra= sc.next().charAt(0);
	
		
		if(Character.isUpperCase(letra)){
			System.out.println("la letra es mayuscula");
		}
		
		else{
			System.out.println("la letra no es mayuscula");
		}
	
	
	//4. Programa	que	lea	dos	caracteres	por	teclado	y	compruebe	si	son	iguales.
	System.out.println("dame un caracter");
	char letra1= sc.next().charAt(0);
	
	System.out.println("dame el otro caracter:");
	char letra2= sc.next().charAt(0);
	
	if(letra1 == letra2){
		System.out.println("son iguales");
	}
	else{
		System.out.println("no son iguales");
	
	}	
	
	
	//5. Programa	que	lea	dos	caracteres	y	compruebe	si	son	dos	letras	minúsculas
	
	System.out.println("dame letra");
	char letra3= sc.next().charAt(0);
	
	System.out.println("dame segunda letra:");
	char letra4= sc.next().charAt(0);
	
	if(Character.isLowerCase(letra3)){
		System.out.println("");
	
		if(Character.isUpperCase(letra4)){
		System.out.println("la primera es minuscula la segunda no"); 
		}
		else if(Character.isLowerCase(letra4)){
		System.out.println(" las dos letras son minusculas");
		}		
	}
	else {
		
	
		if(Character.isLowerCase(letra4)){
			System.out.println("la primera es mayuscula la segunda es minuscula");
		}
	
		else {
	
			System.out.println("las dos son mayusculas");
		}
	}
	
	//6. Programa	que	lea	un	caracter	y	compruebe	si	es	un	número	(Caracter entre '0' y	'9').	
	
	System.out.println("dame letra o numero");
	char letra5= sc.next().charAt(0);
	
	if (letra5 >= 0 && letra5<=9){
		System.out.println("es un numero entre 0 y	9)");
	}
	
	else{
		System.out.println("no es un numero ");
	}
	
	
	
	//7. Programa	que	lea	dos	números	por	teclado	y	muestre	el	resultado	de	la	división	del	primero	por	el	segundo.	Se	debe	comprobar	que	el	divisor	no	puede	ser	cero.	
	
	
	
	System.out.println("dame dividendo");
	double num2= sc.nextInt();
	
	System.out.println("dame divisor:");
	double num3= sc.nextInt();
	if ( num3!=0){
		double division= num2 / num3;
	System.out.println("la division es: "+division);
	}		
	else{
		System.out.println("el divisor no puede ser 0");
	
	}
	
	
	
	
	//8. Calcular	el	mayor	de	tres	números	enteros	en	Java.

	
	System.out.println("dame numero de tres digitos");
	int num4= sc.nextInt();
	
	int num5= num4% 10;
	int num6= num4 / 10;
	int num7= num6% 10;
	int num8 = num6 / 10;
	
	
	if(num8>=num7 && num8>=num5){
		System.out.println("el numero mas alto es el: "+num8);
	}	
	 if (num7>=num8 && num7>=num5){
		System.out.println("el numero mas alto es: "+num7);
	 }
	 if (num5>=num8 && num5>=num7){
		System.out.println("el numero mas alto es: "+num5);
	 }
	
		
	//9. Programa que lea tres números	enteros	H,	M, S que contienen	hora,	minutos	y	segundos respectivamente, y	comprueba	si	la	hora que indican es	una	hora válida.
	
	
	
	System.out.println("dame horas: ");
	int H= sc.nextInt();
	
	
	
	
	
	
	if(H>=0&& H<24){
		System.out.println("");
		System.out.println("dame minutos: ");
		int M= sc.nextInt();
	
	
		 if (M<60 && M>=0){
			System.out.println("");
				System.out.println("dame segundos:");
				int S= sc.nextInt();
	

		if (S<60 && S>=0){
		System.out.println("la hora valida es "+H+":"+M+":"+S);
		}
		else {
		System.out.println("los segundos son incorrectos");
		}
		}
		else{
		System.out.println("los minutos no son validos");
		}
	}
	
	
	else {
		System.out.println("hora incorrecta");
	}
	
	//10. Programa	que	lea	una	variable	entera	mes	y	compruebe	si	el	valor	corresponde	a	un	mes	de	30,	31	o	28	días.	Se	mostrará	además	el	nombre	del	mes.	Se	debe	comprobar	que	el	valor	introducido	esté	comprendido	entre	1	y	12.
	
	System.out.println("dame nuero de mes");
	int mes=sc.nextInt();
	
	if(mes>0 && mes<13){
		System.out.println("mes valido");
		
	
		
			if (mes==1){
				System.out.println("corresponde a un mes de 31 dias y es enero");
			}
			else if (mes==2){
				System.out.println("corresponde a un mes de 31 diasy es marzo");
			}
			else if (mes==5){
				System.out.println("corresponde a un mes de 31 dias y es mayo");
			}
			else if (mes==7){
				System.out.println("corresponde a un mes de 31 dias y es julio");
			}
			else if (mes==8){
				System.out.println("corresponde a un mes de 31 dias y es agosto");
			}
			else if (mes==10){
				System.out.println("corresponde a un mes de 31 dias y es octubre");
			}
			else if (mes==12){
				System.out.println("corresponde a un mes de 31 dias y es diciembre");
			}
			else if(mes==4){
					System.out.println("corresponde a un mes de 30 dias y es abril");
				}
			else if(mes==6){
					System.out.println("corresponde a un mes de 30 dias y es junio");
				}
			else if(mes==9){
					System.out.println("corresponde a un mes de 30 dias y es septiembre");
				}
			else if(mes==11){
					System.out.println("corresponde a un mes de 30 dias y es noviembre");
				}	
			
			else if(mes==2){
				System.out.println("corresponde a un mes de 28 dias y es febrero");
			}	
		
	}
	else{
		System.out.println("no es numero valido");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}