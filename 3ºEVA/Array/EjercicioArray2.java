import java.util.Scanner;
public class EjercicioArray2{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
	 int[] array =new int [5];
	
	System.out.println("Escribir array");
for (int s=0;s<5;s++){
System.out.print("dame numero: ");
array[s]=sc.nextInt();
}
/*	
  int[] array = new int[5];
        array[0]=12;
        array[1]=14;
        array[2]=1;
        array[3]=-45;
        array[4]=65;

        for (int i=0;i < array.length;i++ ) {
            System.out.println(array[i]);
        }
	*/
	
	
	
	for (int i=0;i < array.length;i++ ) {
            System.out.println(array[i]);
        }
}
}