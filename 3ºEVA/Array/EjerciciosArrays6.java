import java.util.Scanner;
public class EjerciciosArrays6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	int[] array=new int[10];
	
	for(int q=0;q<9;q++){
		System.out.println("Dame numero: ");
		int num= sc.nextInt();
		array[q]=num;
	}
	System.out.println("===================");
	for(int w=0;w<array.length;w++){
		
		System.out.println(array[w]);
	}
	System.out.println("===================");
	System.out.println("Dame un numero: ");
	int numero=sc.nextInt();
	System.out.println("Dame posicion entre 0 y 8: ");
	int posicion=sc.nextInt();
	System.out.println("===================");
	int sr=9;
	for(int s=8;sr>=posicion;s--){
		 
		array[sr]=array[s];
		sr--;
	}
	array[posicion]=numero;
	
	for(int p=0;p<array.length;p++){
	
		System.out.println(array[p]);
	}
}
}