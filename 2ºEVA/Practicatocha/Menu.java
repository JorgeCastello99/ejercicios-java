import java.util.Scanner;
public class Menu{
	
private static int opcionActual;

public static void mostrarMenu(){
	System.out.println("Selecciona una de las siguientes opciones para continuar: ");
	System.out.println("1- Crear perfil. ");
	System.out.println("2- Modificar perfil");
	System.out.println("3- Ver perfiles. ");
	System.out.println("4- Borrar perfil");
	System.out.println("5- Calculo del IMC.");
	System.out.println("6- Salir del programa.");
}

public static void modificaOpcionActual(){
	Scanner sc= new Scanner(System.in);
	System.out.println("dame la opcion que quieres escoger: ");
	opcionActual=sc.nextInt();
}

public static int getOpcionActual(){
	return opcionActual;
}







}