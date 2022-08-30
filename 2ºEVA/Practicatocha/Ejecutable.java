import java.util.Scanner;
public class Ejecutable{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int opcion=0;
int buclemenu=0;
int bucleperfiles=0;
String nombre;double altura;double peso;
boolean perfilcorrecto;
String dnirev;
Perfil p1=null;
Perfil p2=null;
Perfil p3=null;
try{
do{
Menu menu=new Menu();
		System.out.println("=========================================");
		menu.mostrarMenu();
		menu.modificaOpcionActual();
		opcion=menu.getOpcionActual();
		System.out.println("=========================================");



	
		switch(opcion){
			case 1:
				if(p1!=null && p2!= null && p3!=null){
					System.out.println("no se pueden introducir mas perfiles");
					System.out.println("");
				}
				
					if(p1==null){
						System.out.println("PERFIL 1");
						String dniintro=introducirDNI();
						Perfil.comprobarDNICorrecto(dniintro);
						
						if(Perfil.comprobarDNICorrecto(dniintro)==true && existeDNI(p1,p2,p3,dniintro)==false){
							
							
							System.out.println("dame nombre");
							nombre=sc.nextLine();
							System.out.println("dame altura");
							altura=sc.nextDouble();
							System.out.println("dame peso");
							peso=sc.nextDouble();
							 
							perfilcorrecto=validarDatosPefil(nombre,altura,peso);
							if(perfilcorrecto==true){
							
							
							p1=new Perfil(dniintro,nombre,altura,peso);
							System.out.println(p1.toString());
							bucleperfiles++;
							}
							
						}
						else{
							System.out.println("DNI no valido");
						}
					}
				else{
					
					 if(p2==null){
					System.out.println("PERFIL 2");
					String dniintro=introducirDNI();
					Perfil.comprobarDNICorrecto(dniintro);
					
						if(Perfil.comprobarDNICorrecto(dniintro)==true){
						
							sc.nextLine();
							System.out.println("dame nombre");
							nombre=sc.nextLine();
							
							System.out.println("dame altura");
							altura=sc.nextDouble();
							System.out.println("dame peso");
							peso=sc.nextDouble();
							perfilcorrecto=validarDatosPefil(nombre,altura,peso);
							if(perfilcorrecto==true){								
							p2=new Perfil(dniintro,nombre,altura,peso);
							System.out.println(p2.toString());
							bucleperfiles++;
							}
							else{
								System.out.println("datos de perfil introducido incorrecto");
							}
						
						
						}	
						else{
							System.out.println("DNI no valido");
						}
					}

					else{
							
						if(p3==null){
								System.out.println("PERFIL 3");
							String dniintro=introducirDNI();
							Perfil.comprobarDNICorrecto(dniintro);
							
							if(Perfil.comprobarDNICorrecto(dniintro)==true && existeDNI(p1,p2,p3,dniintro)==false){
								
								
								System.out.println("dame nombre");
								nombre=sc.nextLine();
								System.out.println("dame altura");
								altura=sc.nextDouble();
								System.out.println("dame peso");
								peso=sc.nextDouble();
								
								
								perfilcorrecto=validarDatosPefil(nombre,altura,peso);
								if(perfilcorrecto==true){ 
								p3=new Perfil(dniintro,nombre,altura,peso);
								System.out.println(p3.toString());
								bucleperfiles++;
								}
								else{
									System.out.println("datos de perfil introducido incorrecto");
								}
							}
							else{
								System.out.println("DNI no valido");
							}
					
						}
						
					}
					
					
					
				}
				
				
			
				
					
					
			
					
					
					
					
				
			break;
		case 2:
			
			
			
				if(p1!=null || p2!=null || p3!= null){
					dnirev=introducirDNI();
			
					
					if(p1.getDNI().equals(dnirev))	{
						p1.setNombre();
						p1.setAltura();				
						p1.setPeso();			
						}
					else if(p2.getDNI().equals(dnirev))	{
						p2.setNombre();
						p2.setAltura();
						p2.setPeso();				
					}
					else if(p3.getDNI().equals(dnirev))	{
						p3.setNombre();
						p3.setAltura();
						p3.setPeso();		
					}
				}
				else{
					System.out.println("No hay perfiles creados");
				}
			break;
			
			
			
		case 3:			
				if(p1!=null || p2!=null || p3!= null){
				
					
					if(p1!=null){
						System.out.println("PERFIL 1");
					System.out.println(p1);
					}
							
					if(p2!=null){
						System.out.println("PERFIL 2");
					System.out.println(p2);
					}
							
					if(p3!=null){
						System.out.println("PERFIL 3");
					System.out.println(p3);
					}
				}
				else{
					System.out.println("No hay perfiles creados");
				}
				
				
			
			break;
	case 4:
			
			if(p1!=null || p2!=null || p3!= null){
					dnirev=introducirDNI();
			
					if(p1.getDNI().equals(dnirev)){
						p1=null;
						System.out.println("El perfil 1 se ha borrado correctamente");
					}
					else if(p2.getDNI().equals(dnirev)){
						p2=null;
						System.out.println("El perfil 2 se ha borrado correctamente");
					}
					else if(p3.getDNI().equals(dnirev)){
						p3=null;
						System.out.println("El perfil 3 se ha borrado correctamente");
					}
					else{
						System.out.println("Ningun perfil ha sido creado con este DNI.");
					}
			}
			else{
					System.out.println("No hay perfiles creados");
			}
						
			
			break;
	case 5:
			if(p1!=null || p2!=null || p3!= null){
					dnirev=introducirDNI();
			
					
				if(p1.getDNI().equals(dnirev)){
					int bucleimcp1=0;
					
					if(bucleimcp1==0){
						p1.calcularIMC();
					}
					else{
						p1.calcularIMC();
						bucleimcp1++;
					}
				}
				else if(p2.getDNI().equals(dnirev)){
					int bucleimcp2=0;
					if(bucleimcp2==0){
						p2.calcularIMC();
					}
					else{
					p2.calcularIMC();
						bucleimcp2++;
					}
					
					
				
				}
				else if(p3.getDNI().equals(dnirev)){
					int bucleimcp3=0;
					if(bucleimcp3==0){
						p3.calcularIMC();
					}
					else{
						p3.calcularIMC();
						bucleimcp3++;
					}				
				}			
				else{
					System.out.println("DNI no valido.");
				}
								
						
						
						
						
						
			}
			else{
					System.out.println("No hay perfiles creados");
			}
			
			
			
			
			
			
			
			
			
			
			break;
			case 6:
			System.out.println("has salido del programa");
			buclemenu++;
			break;	
		}
	}
	while(buclemenu==0);
	

}
catch(Exception todo){
	System.out.println("Excepcion encontrada");
}
}





private static String dniIntroducido;

public static String introducirDNI(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Introduce DNI: ");
		
		dniIntroducido=sc.nextLine();
					
	return dniIntroducido;
	
}
public String getDNI(){
	return dniIntroducido;
}

public static boolean existeDNI(Perfil p1, Perfil p2, Perfil p3, String dni){
		boolean devueltadni;
		if (p1!=null && p1.getDNI().equals(dni)){
			System.out.println("existe perfil");
			devueltadni=true;
			return devueltadni;
		}
		if (p2!=null && p2.dni.equals(dni)){
			System.out.println("existe perfil");
			devueltadni=true;
			return devueltadni;
		}
		if (p3!=null && p3.dni.equals(dni)){
			System.out.println("existe perfil");
			devueltadni=true;
			return devueltadni;
		}
		else{
			System.out.println("no existe el perfil");
			devueltadni=false;
			return devueltadni;
		}
		
	}

public static boolean validarDatosPefil(String nombre,double altura,double peso){
	boolean devuelta;
	if (altura<=0 || peso<=0 || nombre.equals("")){
		System.out.println("datos introducidos no validos");
		devuelta=false;
		return devuelta;
	}
	else{
		System.out.println("datos introducidos validos");
	devuelta=true;
		return devuelta;
	}	 
}

}