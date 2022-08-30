import java.util.Scanner;
public class EjerciciosArraysD5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		
		try{
		
		int[][] array=new int [5][9];
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
System.out.println("================Array traspuesta en array ==================");
	
	int[][] array2=new int [9][5];
	
	
	for(int y=0;y<array2.length;y++){
	System.out.println("");
		for(int m=0;m<array2[y].length;m++){
		array2[y][m]=array[m][y];
		System.out.print("|"+array2[y][m]+"|");
	}	
	}
	
System.out.println("");System.out.println("");
	
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("");
	}
}
}