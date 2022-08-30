import java.util.Scanner;
import java.util.Arrays;
public class EjerciciosArraysD1{
	public static void main(String[] args){
	
int[][] array=new int[5][5];
for(int q=0;q<array.length;q++){
	for(int i=0;i<array[q].length;i++){
		
		array[q][i]=q+i;
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