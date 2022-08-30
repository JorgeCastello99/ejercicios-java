import java.util.Scanner;
public class EjerciciosArrays7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

		int[] array=new int[3];
	System.out.println("=========Primer array==========");
	for(int q=0;q<array.length;q++){
		System.out.println("Dame numero: ");
		int num= sc.nextInt();
		array[q]=num;
		
	}
	
	
		int[] array2=new int[3];
	System.out.println("==========Segundo array=========");
	for(int m=0;m<array.length;m++){
		System.out.println("Dame numero: ");
		int num= sc.nextInt();
		array2[m]=num;
	}
	System.out.println("===================");
	
	int[] array3=new int[6];
	
	int r=0;	
int k=0;

	for(int i=0;i<array3.length;i++){
		
		if(i<3){		
			array3[i]=array[k];
			k++;
		}	
		if(i>2){
			
		array3[i]=array2[r];
		r++;
		}	
	}
	
		
	for(int p=0;p<array3.length;p++){
	
		System.out.println(array3[p]);
	}
		
	
	
	
	
	
	
	
	
}

}

