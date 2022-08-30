import java.util.Scanner;

public class PruebaEscritura{
public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	double tiempo=0;
	double tiempo1=0;
	double tiempo2 =0;	
	String acepta="";
	String pfrase;
	
	int bucle=1;
	int bucle2=0;
	int bucle3=0;
	int buclegeneral=0;
	Cronometro crono=new Cronometro();
	
	System.out.println("Hola, con este juego se medira en segundos tu velocidad de escritura.");
	System.out.println("");
	System.out.println("el juego consiste en mostrar una frase y ver lo que tarda el usuario en escribirla y darle a enter");
	
while(buclegeneral==0){
	System.out.println("============¿quieres jugar? s(SI)|n(NO)============");
	acepta=sc.nextLine();
	
	if(acepta.equals("s")){		
		
		
			
	while(bucle2==0){
		System.out.println("supercalifragilisticoespialidoso");
		crono.tiempo1=System.currentTimeMillis();
		pfrase=sc.nextLine();
		if(pfrase.equals("supercalifragilisticoespialidoso")){
			crono.tiempo2=System.currentTimeMillis();
			System.out.println("");
			System.out.println("El tiempo total es "+crono.tiempoTotal(crono.tiempo1,crono.tiempo2)+" segundos");
			System.out.println("");System.out.println("");
			crono.resetear();
			
			bucle2++;
			
		}
		else{
		System.out.println("Has fallado, vuelve a intentarlo");
		}
	}
			bucle2=0;			
		}
		else if(acepta.equals("n")){
		System.out.println("has salido de juego");
		buclegeneral--;
		}
	else{
	System.out.println("dame valor valido");
	}
	}
	
	
	System.out.println("============¿quieres jugar? s(SI)|n(NO)============");
	acepta=sc.nextLine();
	
	 if(acepta.equals("s")){		
		
		
			
	while(bucle2==0){
		System.out.println("tres tristes tigres tragan trigo en un trigal");
		crono.tiempo1=System.currentTimeMillis();
		pfrase=sc.nextLine();
		if(pfrase.equals("tres tristes tigres tragan trigo en un trigal")){
			crono.tiempo2=System.currentTimeMillis();
			System.out.println("");
			System.out.println("El tiempo total es "+crono.tiempoTotal(crono.tiempo1,crono.tiempo2)+" segundos");
			System.out.println("");System.out.println("");
			crono.resetear();		
			bucle2++;
		}
		
		else{
		System.out.println("Has fallado, vuelve a intentarlo");
		}
	}
			bucle2=0;	
	}
	
	else if(acepta.equals("n")){
		System.out.println("has salido de juego");
		buclegeneral--;
	}
	else{
	System.out.println("dame valor valido");
	}
	
	
	
}	
}	
