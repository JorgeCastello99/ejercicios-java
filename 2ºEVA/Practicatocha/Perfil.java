import java.util.Scanner;
public class Perfil{
	
double altura;
double peso;
String nombre;
String dni;
double imc;

public Perfil(String dni,String nombre,double altura, double peso){
	this.dni=dni;
	this.nombre=nombre;
	this.altura=altura;
	this.peso=peso;
	
}





	
	
public static boolean comprobarDNICorrecto(String dni){
	
	boolean validar;
			String letras="TRWAGMYFPDXBNJZSQVHLCKE";
			String dni2=dni.substring(0,8);	
			int dnin2=Integer.parseInt(dni2);
			int resto=dnin2 % 23;
			String letradni=dni.substring(8);
			
			String letra=letras.substring(resto, resto +1);
			if(letra.equals(letradni)){
				validar=true;
			}
			else{
				validar=false;
			}
			return validar;
}



public String getDNi(){
	return dni;
}


public void calcularIMC(){
double total;
total=peso / (altura * altura);
System.out.println("El IMC = "+total+"");
}

public double setAltura(){
	Scanner sc=new Scanner(System.in);
	System.out.println("dame la altura: ");
	altura=sc.nextFloat();
	return altura;
}
public double getAltura(){
	return altura;
}

public double setPeso(){
	Scanner sc=new Scanner(System.in);
	System.out.println("dame el peso: ");
	peso=sc.nextDouble();
	return peso;
}
public double getPeso(){
	return peso;
}

public String setNombre(){
	Scanner sc=new Scanner(System.in);
	System.out.println("dame el nombre: ");
	nombre=sc.nextLine();
	return nombre;
}
public String getNombre(){
	return nombre;
}



public String getDNI(){
	return dni;
}

public String toString(){
	
	String mensaje=getDNI()+", "+getNombre()+" tiene una altura de "+getAltura()+" metros, y un peso de "+getPeso()+" Kg ";
	
	return mensaje;

	}





}