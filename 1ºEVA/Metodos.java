import java.util.Scanner;
public class Metodos{
public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		
		//ej1
		
			
			int n, resultado1;
			System.out.println("dame n veces:");
			n =sc.nextInt();
				
				multip(n);
				
		
		//ej2
			int numero1,numero2,igual;
	
		System.out.println("dame primer numero:");
			numero1 =sc.nextInt();
	
		System.out.println("dame segundo numero:");
			numero2 =sc.nextInt();
			
			int mayor=max(numero1,numero2,igual);
			System.out.println("el mayor es" mayor);
			
			
			
			
			
		//ej3
		int numero3,numero4,numero5;
	
		System.out.println("dame primer numero:");
			numero3 =sc.nextInt();
	
		System.out.println("dame segundo numero:");
			numero4 =sc.nextInt();
			
			System.out.println("dame segundo numero:");
			numero5 =sc.nextInt();
			
			int mayor1=max1(numero3,numero4, numero5);
			System.out.println("el mayor es"+mayor1);
			
			
			
			
			
			
			
			
			
			
		}
	
			static void multip (int n){
				
				while(n >0){
					System.out.println("Modulo ejecutandose");
					n--;	
					
				}					
			}
	
		
	
	
		
	
		static int max (int a, int b, int c){
			if(a>b){
				return a;
			}
			else if(b>a){
				return b;
			}		
			else{
				return c;
			}
		}
		
		static int max1 (int a, int b, int c){
			if(a>b && a>c){
				return a;
			}
			else if(b>a && b>c){
				return b;
			}
			else{
				return c;
			}
		}
	
	
	
	
	
	
	
	
	
}
	
	
