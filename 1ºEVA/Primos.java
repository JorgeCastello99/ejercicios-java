import java.util.Scanner;
public class Primos{
public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("dame primer numero");
		int numero=sc.nextInt();
		
		System.out.println("dame segundo numero");
		int numero1=sc.nextInt();
		
		if(numero1>=numero){
			
			for(int q=2;numero<=numero1;q++){			
				
				if (numero ==2 || numero ==3 && numero ==-2 || numero ==-3){
					System.out.println(numero);
				}
				if(numero%2!=0 && numero%3!=0){
					System.out.println(numero);
				}			
				numero++;
			}			
		}
		else{
			System.out.println("numeros erroneos");
		}
		
		
		*/
		System.out.println("dame primer numero");
		int numero=sc.nextInt();
		
		System.out.println("dame segundo numero");
		int numero1=sc.nextInt();
		
		if(numero1>=numero){
		
		for(int q=2;numero<=numero1;q++){
			int bucle=2;
			for(int i=2;bucle<numero;i++){
				
				if(numero%bucle!=0){
					System.out.println(bucle);
				}
				bucle++;				
			}
				numero++;
			}
			
		}
		else{
			System.out.println("numeros erroneos");
		}





		
}
}