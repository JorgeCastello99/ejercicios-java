import java.util.Scanner;
public class EjercicioArray3{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
	
	int[] array =new int [5];
	
	System.out.println("Escribir array");
	
		for (int s=0;s<5;s++){
		System.out.print("dame numero: ");
		array[s]=sc.nextInt();
		}
		
	int ceros=0;
	int totalpos=0;
	int mediapos=0;
	int totalneg=0;
	int medianeg=0;
	int bucleneg=0;
	int buclepos=0;
	for (int i=0;i < array.length;i++ ) {
            System.out.println(array[i]);
			
			if(array[i]>0){
				
				int totp=array[i];
				totalpos=totalpos+totp;
				buclepos++;
				mediapos= totalpos/buclepos;
				
				
			}
			if(array[i]==0){
				
				ceros++;
			}
			if(array[i]<0){
				
				int totn=array[i];
				totalneg=totalneg+totn;
				bucleneg++;
				medianeg= totalneg/bucleneg;
				
			}
        }
		System.out.println("==================");
	System.out.println("La media de los numeros positivos es: "+mediapos);
	System.out.println("La media de los numeros negativos es: "+medianeg);
	System.out.println("El total de ceros es: "+ceros);
}
}