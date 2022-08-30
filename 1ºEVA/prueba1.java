import java.util.Scanner;
public class prueba1{
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
	
	System.out.println("introduce a: ");
	int a = sc.nextInt();
	System.out.println("introduce b: ");
	int b = sc.nextInt();
	System.out.println("introduce c: ");
	int c = sc.nextInt();
	
	System.out.println( -b + Math.sqrt(b * b -4 * a * c)/(2 * a));
	System.out.println( -b - Math.sqrt(b * b -4 * a * c)/(2 * a));
	
	}
}