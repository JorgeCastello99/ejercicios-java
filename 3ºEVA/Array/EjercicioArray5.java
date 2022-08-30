import java.util.Scanner;
public class EjercicioArray5{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

	 int[] array =new int [10];
	
	System.out.println("Escribir primer array");
	
		for (int s=0;s<10;s++){
	System.out.print("dame numero: ");
	array[s]=sc.nextInt();
	}

	
	int[] array2 =new int [10];
	System.out.println("Escribir segundo array");
	
		for (int p=0;p<10;p++){
	System.out.print("dame numero: ");
	array2[p]=sc.nextInt();
	}
	
	
	int[] array3 =new int [20];
	
			int j=0;
			for(int i=0;i<10;i++){
				array3[j]=array[i];
				j++;
				array3[j]=array2[i];
				j++;
			}
	
	for (j=0;j<20;j++){ // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
		System.out.print(array3[j]+" ");
		System.out.print("");		
	}
	
	
}
}