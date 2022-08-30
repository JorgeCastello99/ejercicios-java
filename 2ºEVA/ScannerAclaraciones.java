import java.util.Scanner;
public class ScannerAclaraciones{
Scanner sc = new Scanner(System.in);



public static void problema(){
	Scanner sc = new Scanner(System.in);
	int num1;

	String nombre;
	String apellido;
	
	System.out.println("dame numero");
	num1=sc.nextInt();
	System.out.println(num1);
	System.out.println("------------");
	System.out.print("dame tu nombre");
	nombre=sc.nextLine();
	System.out.println(nombre);
	
	System.out.print("dame tu apellido");
	apellido=sc.nextLine();
	System.out.println(apellido);

}
public static void solucion1(){
	Scanner sc = new Scanner(System.in);
	int num1;
	
	String nombre;
	String apellido;
	
	System.out.println("dame numero");
	num1=sc.nextInt();
	sc.nextLine();
	
	
	
	System.out.println(num1);
	System.out.println("------------");
	System.out.print("dame tu nombre");
	nombre=sc.nextLine();
	System.out.println(nombre);
	
	System.out.print("dame tu apellido ");
	apellido=sc.nextLine();
	System.out.println(apellido);

}
public static void solucion2(){
	Scanner sc = new Scanner(System.in);
	String num1;
	
	String nombre;
	String apellido;
	
	System.out.println("dame numero");
	num1=sc.nextLine();
	int num11=Integer.parseInt(num1);
	
	
	
	
	System.out.println(num1);
	System.out.println("------------");
	System.out.print("dame tu nombre");
	nombre=sc.nextLine();
	
	System.out.println(nombre);
	
	System.out.print("dame tu apellido  ");
	apellido=sc.nextLine();
	System.out.println(apellido);
}


public static void main(String[] args){
	problema();
	solucion1();
	solucion2();
	}
	
	
}