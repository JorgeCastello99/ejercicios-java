
import java.util.Scanner;
public class Creatividad{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		String nomb1="";
		String nomb2="";
		String nomb3="";
		String nomb4="";
				
		String nombre1=nombres(nomb1);
		System.out.println("");
		String nombre2=nombres(nomb2);
		System.out.println("");
		String nombre3=nombres(nomb3);
		System.out.println("");
		String nombre4=nombres(nomb4);
				System.out.println("");
			
		double nota11=0;		
		double nota12=0;		
		double nota13=0;		
		double nota21=0;	
		double nota22=0;		
		double nota23=0;		
		double nota31=0;		
		double nota32=0;		
		double nota33=0;		
		double nota41=0;		
		double nota42=0;		
		double nota43=0;
		
		System.out.println("ahora vamos a hayar las medias de los alumnos");
		
		double notamedia1=medias(nombre1,nota11,nota12,nota13);
		double notamedia2=medias(nombre2,nota21,nota22,nota23);
		double notamedia3=medias(nombre3,nota31,nota32,nota33);
		double notamedia4=medias(nombre4,nota41,nota42,nota43);
		System.out.println("");
		System.out.println("");
		
		double notamediag=(notamedia1+notamedia2+notamedia3+notamedia4)/4;
		System.out.println("La nota media del grupo es:"+notamediag);
	}

static String nombres(String a){
	Scanner sc = new Scanner (System.in);
	int bucle=1;
	do{
	System.out.println("nombre alumno");
		a=sc.nextLine();		
		bucle--;		
		System.out.println("");
		
			if(a.equals("")){
					System.out.println("no has puesto nada");bucle++;
				}
			}
			while(bucle>0);
			
	return a;	
}


static double medias(String nombre,double nota1,double nota2,double nota3){
	Scanner sc = new Scanner (System.in);
	double notamedia=0;
	int bucle=0;
	do{
		
		System.out.println("Dame las 3 notas de"+nombre);
		System.out.println("primera");
		nota1=sc.nextDouble();
		System.out.println("segunda");
		nota2=sc.nextDouble();
		System.out.println("tercera");
		nota3=sc.nextDouble();
	
	if(nota1>=0 && nota1<=10 && nota2>=0 && nota2<=10 && nota3>=0 && nota3<=10){
	if(nota1<4 || nota2<4 ||nota3<4 ){
		System.out.println("no se puede hacer la media de "+nombre+" porque tiene alguna nota suspensa pero se le tiene que poner una nota");
		System.out.println("");
		if(nota1>0 && nota2>0 && nota3>0){
			
			System.out.println("el alumno "+nombre+" ha sacado un 4");
			System.out.println("");bucle++;
		}
		else if(nota1>0 && nota2==0 && nota3==0){
			System.out.println("el alumno "+nombre+" ha sacado un 3");
			System.out.println("");bucle++;
		}
		else if(nota1>0 && nota2==0 && nota3>0){
			System.out.println("el alumno "+nombre+" ha sacado un 3");
			System.out.println("");bucle++;
		}
		else if(nota1>0 && nota2>0 && nota3==0){
			System.out.println("el alumno "+nombre+" ha sacado un 3");
			System.out.println("");bucle++;
		}
		else if(nota1==0 && nota2>0 && nota3>0){
			System.out.println("el alumno "+nombre+" ha sacado un 3");
			System.out.println("");bucle++;
		}
		else if(nota1==0 && nota2==0 && nota3>0){
			
			System.out.println("el alumno"+nombre+" ha sacado un 2");
			System.out.println("");bucle++;
		}
		else if(nota1==0 && nota2==0 && nota3==0){
			System.out.println("el alumno"+nombre+" ha sacado un 1");
			System.out.println("");bucle++;
		}
	}
	if(nota1>4 && nota2>4 && nota3>4 ){
		System.out.println("Se puede hacer la media de "+nombre+" porque no hay ninguna suspensa.");
		System.out.println("");
		
	notamedia=(nota1 + nota2 + nota3) / 3;
		
		System.out.println("la nota media de "+nombre+" es igual a "+notamedia);
		System.out.println("");
		bucle++;
	}
	}
	else{
		System.out.println("los numeros introducidos no son correctos");
	}
	}
	
	
	while(bucle==0);
	
	
	return notamedia;
}
}







