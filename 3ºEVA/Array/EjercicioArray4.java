import java.util.Scanner;
public class EjercicioArray4{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	

	 int[] array =new int [10];
	
	System.out.println("Escribir array");
	
		for (int s=0;s<10;s++){
	System.out.print("dame numero: ");
	array[s]=sc.nextInt();
	}




System.out.println(array[0]);
System.out.println(array[9]);
System.out.println(array[1]);
System.out.println(array[8]);
System.out.println(array[2]);
System.out.println(array[7]);
System.out.println(array[3]);
System.out.println(array[6]);
System.out.println(array[4]);
System.out.println(array[5]);

}
}