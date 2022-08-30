import java.util.Scanner;
public class prueba{
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);


System.out.println("numero de horas ");

int horas = sc.nextInt();
int dias = horas / 24;
int semanas = dias / 7;
int dias1 = 7 * semanas ;
int dia2 = dias - dias1;
int hora = dias * 24;
int hora1 = horas - hora;


System.out.println(semanas+" semanas "+dia2+ " dias "+hora1+ " horas ");



	}
}