import java.util.Scanner;
public class EjerciciosArraysD4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[][] array=new int[3][3];
		int[][] array2=new int[3][3];
		//1array
		System.out.println("Dame numeros del array");
		for(int q=0;q<array.length;q++){
			for(int i=0;i<array[q].length;i++){
			
				int num=sc.nextInt();
				array[q][i]=num;
			}
		}
		
		//2 array
		System.out.println("");System.out.println("");
		System.out.println("Dame numeros del array");
		for(int f=0;f<array2.length;f++){
			for(int x=0;x<array2[f].length;x++){
			
				int num=sc.nextInt();
				array2[f][x]=num;
			}
		}
		
		System.out.println("");System.out.println("");
		
		//muestra primer array
	for(int y=0;y<array.length;y++){
		System.out.println("");
		for(int m=0;m<array[y].length;m++){
		
		System.out.print("|"+array[m][y]+"|");
		}
	}
	
	System.out.println("");
	System.out.println("  +  ");
	for(int y=0;y<array2.length;y++){
		System.out.println("");
		for(int m=0;m<array2[y].length;m++){
		
		System.out.print("|"+array2[y][m]+"|");
		}
	}
	
	
	int[][] array3=new int[3][3];
	System.out.println("");
	System.out.println("  =  ");
		
	for(int y=0;y<array2.length;y++){
	System.out.println("");
		for(int m=0;m<array2[y].length;m++){
		array3[y][m]=array2[y][m]+array[y][m];
		System.out.print("|"+array3[y][m]+"|");
		}	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}