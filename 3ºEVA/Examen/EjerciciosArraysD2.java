import java.util.Scanner;
public class EjerciciosArraysD2{
	public static void main(String[] args){
		
			int[][] array=new int[7][7];
			
		for(int q=0;q<array.length;q++){
			
			for(int i=0;i<array[q].length;i++){
		
			array[q][i]=0;
			if(q==i){
				array[q][i]=1;
			}
		}
	
}
for(int y=0;y<array.length;y++){
	System.out.println("");
	for(int m=0;m<array[y].length;m++){
		
		System.out.print("|"+array[y][m]+"|");
	}
	
}
	
	
}
}