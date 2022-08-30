import java.util.Scanner;
public class Ejecutable{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
public static boolean validarDatosPefil(String nombre,double altura,double peso){
	boolean devuelta;
	if (altura>0 && peso>0 && nombre!=""){
		System.out.println("datos introducidos correctos");
		devuelta=true;
		return devuelta;
	}
	else{System.out.println("datos introducidos no validos");}
	devuelta=false;
		return devuelta;
	}
	
	public static boolean existeDNI(Perfil p1, Perfil p2, Perfil p3, String dni){
		boolean devueltadni;
		if (p1!=null && p1.getDNI.equals(dni)){
			System.out.println("existe perfil");
			devueltadni=true;
		}
		if (p2!=null && p2.dni.equals(dni)){
			System.out.println("existe perfil");
			devueltadni=true;
			
		}
		if (p3!=null && p3.dni.equals(dni)){
			System.out.println("existe perfil");
			devueltadni=true;
		}
		else{
			System.out.println("no existe el perfil");
			devueltadni=false;
		}
		
	}
	
	case 2:
	introduce dni
	si es valido
		altura=pidePerfil();
		validarDatosPerfil(p1.getNombre(),p1.getAltura(),p1.getPeso);
		if(devuelta==true){
			
			
		}
		else{
			System.out.println("datos introducidos no validos");
		}
	
	
	
	break;
	case 3:
	if(p1!=null){
		p1.toString();
	}
		
	if(p1!=null){
		p2.toString();
	}
		
	if(p1!=null){
		p3.toString();
	}
	if(p1==null && p2== null && p3==null){
		System.out.println("No hay ningun perfil creado.");
	}
	
	
	break;
	
	case 4:
	//dame dni se valida
	if(dni.equals(p1.dni)){
		p1=null;
	}
	if(dni.equals(p2.dni)){
		p2=null;
	}
	if(dni.equals(p3.dni)){
		p3=null;
	}
	else{
		System.out.println("Ningun perfil ha sido creado con este DNI.");
	}
	
	
	break;
	case 5:
	//pidedni comprueba si es valido, si lo es entra aqui
	
	if(validar==true){
	if(dni.equals(p1.dni)){
		int bucleimcp1=0;
		
		if(bucleimcp1==0){
			calcularIMC(p1.getPeso(),p1.getAltura());
		}
		else{
			System,out,println("");
			bucleimcp1++;
		}
	}
	if(dni.equals(p2.dni)){
		int bucleimcp2=0;
		if(bucleimcp2==0){
			calcularIMC(p2.getPeso(),p2.getAltura());
		}
		else{
			System,out,println("");
			bucleimcp2++;
		}
		
		
	
	}
	if(dni.equals(p3.dni)){
		int bucleimcp3=0;
		if(bucleimcp3==0){
			calcularIMC(p3.getPeso(),p3.getAltura());
		}
		else{
			System,out,println("");
			bucleimcp2++;
		}
		
	}
	if(dni.!equals(p3.dni)&& dni.!equals(p3.dni)&& dni.!equals(p1.dni)){
		System.out.println("hay que crea al menos un perfil");
	}
		
	}
	else{
		system.out.println("DNI no valido.")
	}
	
	break;