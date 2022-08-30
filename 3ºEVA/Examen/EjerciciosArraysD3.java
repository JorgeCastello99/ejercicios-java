import java.util.Scanner;
public class EjerciciosArraysD3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	try{
		
		int[][] array=new int [4][4];
		System.out.println("Dame numeros del array");
	for(int q=0;q<array.length;q++){
		for(int i=0;i<array[q].length;i++){
		
		int num=sc.nextInt();
		array[q][i]=num;
	}
	}
	
	
	
	
	
	
	for(int y=0;y<array.length;y++){
	System.out.println("");
		for(int m=0;m<array[y].length;m++){
		
		System.out.print("|"+array[y][m]+"|");
	}	
	}
	
	
	System.out.println("");System.out.println("");
	for(int y=0;y<array.length;y++){
	System.out.println("");
		for(int m=0;m<array[y].length;m++){
		
		System.out.print("|"+array[m][y]+"|");
	}	
	}
	
	
	
	for(int y=0;y<array.length;y++){
	System.out.println("");
		for(int m=0;m<array[y].length;m++){
			
		if(array[y][m]==array[m][y]){
		
		}
		else{
			System.out.println("No son simetricas");
			y=10;
			m=10;
		}
		
	}	
	}
	
	
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("");
	}
	
	
}
}