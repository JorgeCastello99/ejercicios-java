import java.util.Scanner;
public class Excepciones1{
public static int codigoSinExcepciones(int numero1,int numero2){
	Scanner sc=new Scanner();
	System.out.println("dame numero");
	numero1=sc.nextInt();
	System.out.println("dame numero");
	String num=sc.nextLine();
	numero2=parseInt(num);
	
	int total=numero1/numero2;
}


public static void main(String[]args){
	
	codigoSinExcepciones();

}
}