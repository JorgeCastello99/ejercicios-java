import java.util.Scanner;
public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//1 objeto
	System.out.println("1 objeto");
	Persona person= new Persona();
	
	System.out.println("dame nombre ");
	person.cambiaNombre(sc.nextLine());	
	System.out.println("dame edad");
	person.setEdad(sc.nextInt());
	System.out.println("dame altura");
	person.setaltura(sc.nextFloat());
	System.out.println(person.toString());
	System.out.println("");
	//2 objeto
	System.out.println("");
	System.out.println("2 objeto");
	Persona person2= new Persona();
	System.out.println(person2.toString());
	
	}
}