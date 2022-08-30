import java.util.Scanner;
public class expresionesaritmeticas1{
public static void main(String []args) {

	Scanner sc = new Scanner(System.in);
	
	// 12º . Comprobar si una variable A de tipo carácter contiene una letra mayúscula
	
	System.out.println("dame una letra: ");
	char e = sc.next().charAt(0);
	String pala = e >= 'A' &&  e <= 'Z' ? ("tiene mayuscula"):("no tiene mayuscula");
	
	System.out.println("la letra "+e+" "+ pala);
	
	//13. Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula
	System.out.println("dame una letra: ");
	char f = sc.next().charAt(0);
	String pala1 = f >= 'A' &&  f <= 'Z' ? ("tiene mayuscula"):("no tiene mayuscula");
	String pala2 = f >= 'a' &&  f <= 'z' ? ("tiene minuscula"):("no tiene minuscula");
	System.out.println("la letra "+f+" "+ pala1+" y "+pala2);
	
	//14. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula
	System.out.println("dame una letra: ");
	char g = sc.next().charAt(0);
	String palab = g >= 'A' &&  g <= 'Z' ? ("tiene mayuscula"):("no tiene mayuscula");
	
	System.out.println("la letra "+g+" "+ palab);
	
	//15. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula
	System.out.println("dame una letra: ");
	char h = sc.next().charAt(0);
	String palas = h >= 'A' &&  h <= 'Z' ? ("no tienes minuscula"):("no tiene mayuscula");
	
	System.out.println("la letra "+h+" "+ palas );
	
	
	//16. Comprobar si el contenido de la variable N termina en 0 ó en 7
	System.out.println("dame un numero: ");
	int n= sc.nextInt();
	int m= n % 10;
	String	cont= m==0 ? ("termina en 0"):("no termina en 0");
	String	cont1= m==7 ? ("termina en 7"):("no termina en 7");
	System.out.println("el numero "+cont+" y "+cont1);
	
	//17. Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
	System.out.println("precio de algo : ");
	int precio = sc.nextInt();
	int valor = 10;
	int valor1= 50;
	String a = precio >=10 ? ("igual o mayor que 10$"):("menor que 10$");
	String b = precio < 50 ? ("menor que 50$"):("no es menor que 50$");
	System.out.println("el precio es: "+a+" y "+b);
	
	//18. Modificar el valor de la variable entera N incrementándolo en 77. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 87.
	System.out.println("dame numero: ");
	int variab = sc.nextInt();
	System.out.println( variab + 77);
	
	//19. Modificar el valor de la variable entera M disminuyéndolo en 3. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 7.
	System.out.println("dame numero: ");
	int variabl = sc.nextInt();
	System.out.println( variab - 3);
	
	// 20. Modificar el valor de la variable entera X duplicando su valor. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 20.
	System.out.println("dame numero: ");
	int variable = sc.nextInt();
	System.out.println( variabl * 2);
	
	//22. Una variable entera M contiene un número de mes. Comprobar si corresponde a un mes de 30 días.
		System.out.println("dame numero de mes: ");
	int as = sc.nextInt();
	String numero=  as==4 || as ==6 || as==9 || as==11 ? ("corresponde a un mes de 30 dias"):("no corresponde a un mes de 30 dias");
	System.out.println(numero);
	
	//23. Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el valor 12.
	
		System.out.println("numero de 2 o mas cifras: ");
		int ad = sc.nextInt();
	
		System.out.println(ad / 10);
	
	//24. Dada una cadena quedarnos con los 3 primeros caracteres comenzando por el segundo caracter. 
	System.out.println("dame una palabra: ");
		String al = sc.nextLine();
	    String am= al.substring(2,5);
		System.out.println(am);
		
	//25. Comprobar si una variable C de tipo char contiene un d�gito. (Car�cter entre 0 y 9)
	
	System.out.println("caracter entre 0 y 9: ");
	char C = sc.next().charAt(0);
	String tipo = C >= '0' && C <= '9' ? ("contiene 1 digito"):("contiene mas de 1 digito");
	System.out.println("el numero "+tipo);
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	}
}