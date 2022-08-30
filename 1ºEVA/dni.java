import java.util.Scanner;
public class dni {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.printf("dame numeros del DNI: ");
					String DNI= sc.nextLine();
						
						
}}						
	
		//validador DNI
static void Validardni(String DNI){
		Scanner sc = new Scanner(System.in);
	
	int bucledni=0;
	for(int p=0;bucledni<1;p++){
																		
						if(DNI.length()==9){
						String dnd=DNI.substring(0,8);	
						int dnin2=Integer.parseInt(dnd);
						int dninr=dnin2 % 23;
						
						String  letra=DNI.substring(9);
						
				

						String letras="";
		if (letra.equals() ){
			
			switch(dninr){
				case 0:				
					letras=("T");
					if (letras.equals(letra){
						 
					System.out.println("el DNi: "+DNI+" es valido");
					
												
						
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();						
						
					}
				break;
					
				case 1:
					letras=("R");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 2:
					 letras= ("W");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 3:
					 letras= ("A");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 4:
					 letras = ("G");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				
				break;
				
				case 5:
					letras = ("M");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 6:
					letras = ("Y");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				case 7:
					 letras = ("F");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}	

				break;
				
				case 8:
					 letras = ("P");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}

				break;
				
				case 9:
					 letras = ("D");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 10:
					letras = ("X");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();	
						
						}
				break;
				
				case 11:
					 letras = ("B");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();	
											
					}
				break;
				
				case 12:
					letras = ("N");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();	DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				case 13:
					 letras = ("J");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				case 14:
					 letras= ("Z");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 15:
					 letras= ("S");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 16:
					letras = ("Q");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 17:
					 letras = ("V");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
					break;
				
				case 18:
					letras = ("H");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 19:
					 letras= ("L");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 20:
					 letras = ("C");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				case 21:
					 letras = ("K");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;
				
				case 22:
					 letras = ("E");
					if (letras.equals(letra){						 
					System.out.println("el DNi: "+DNI+" es valido");																							
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNI+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();	DNI= sc.nextLine();												
					}
				break;

			}
			
			}
		else{
		System.out.println("la letra no es valida");
		
			System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					
		}		
	}	
	else{
		System.out.println("la longitud del DNI no es la correcta");
			System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					
	}

	}

}

	
	
	
	
	
