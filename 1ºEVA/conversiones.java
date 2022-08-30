
import java.util.Scanner;
public class conversiones{
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	
	float nf=3.4f;
	
	int nf1 = (int) nf;
	
	System.out.println(nf1);
	System.out.println(Math.round(nf));
	System.out.println(Math.ceil(nf));
	System.out.println(Math.floor(nf));
	
	
	
		double nd=3.7;
		
	int nd1 = (int) nd;
		System.out.println(nd1);
		System.out.println(Math.round(nd));
		System.out.println(Math.ceil(nd));
		System.out.println(Math.floor(nd));
		
	float num=5f;
	int num1 = (int) num; 
		System.out.println(num1);
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		
	int num2=3;
		int num3 = (int) num2; 
		System.out.println(num3);
		System.out.println(Math.round(num2));
		System.out.println(Math.ceil(num2));
		System.out.println(Math.floor(num2));
		
	}
}