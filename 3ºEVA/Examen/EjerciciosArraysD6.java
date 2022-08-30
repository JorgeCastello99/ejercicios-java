import java.util.Scanner;
public class EjerciciosArraysD6{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		
		
	try{
		
			
		
		
		int[][] array=new int [6][6];
		System.out.println("Dame numeros del array");
	for(int q=0;q<array.length;q++){
		for(int i=0;i<array[q].length;i++){
		
		int num=sc.nextInt();
		array[q][i]=num;
		
	}
	}
	
	//muuestra array
	
	for(int y=0;y<array.length;y++){
		System.out.println("");
		for(int m=0;m<array[y].length;m++){
		
		System.out.print("|"+array[y][m]+"|");
		}
	}
	
	
	System.out.println("");
System.out.println("================Array traspuesto en mismo array ==================");
	
	
		for(int y=0;y<array.length;y++){
		System.out.println("");
		for(int m=0;m<array[y].length;m++){
		
		System.out.print("|"+array[m][y]+"|");
		}
	}
		
		
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("");
	}
}
}