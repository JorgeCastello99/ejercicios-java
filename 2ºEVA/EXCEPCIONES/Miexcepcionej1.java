import java.util.Scanner;
public class Miexcepcionej1 {
public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
	int sino;
	String nombre;

try{
	System.out.println("dime tu nombre");
	nombre=sc.nextLine();
	
	if(nombre.equalsIgnoreCase("satan")){
		throw new satanas("por aqui no te quiero ver cebolleto");
	}	
}	


catch(satanas 	exc){
	System.out.println(exc.getMessage());
}

}



 static class satanas extends Exception{
	
	public satanas(String mensaje){
		super(mensaje);
	}
}



	