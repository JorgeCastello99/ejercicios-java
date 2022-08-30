import java.util.Scanner;
public class Excepciones1{
public static int codigoSinExcepciones(){
	Scanner sc=new Scanner(System.in);
	System.out.println("dame numero");
	int numero1=sc.nextInt();
	System.out.println("dame numero");
	int numero2=sc.nextInt();
	
	int total=numero1/numero2;
	return total;
}


public static void main(String[]args){
	

	int tot=codigoSinExcepciones();
	System.out.println(tot);


	
}
}