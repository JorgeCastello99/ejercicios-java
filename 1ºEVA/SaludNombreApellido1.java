
/**
@Author Jorge castello
@java version "1.13"
*/ 

import java.util.Scanner;
public class SaludNombreApellido1{
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	
	//menu y case1
	String nombre="",nombre2=""; char sexo, sexo2;String DNI="",DNI2="";char letra,letra2;
	int menu=1;int perfiles;int dni;int hacer1;int edad;int edad2; String DNIT="",DNIT2="";
	
	//para validar DNI primero meter numero y luego te pide la letra
	
	//case2
	String dniimc;
	float peso,altura;float totalimc=1f;
		
	//case 4 
	int fruta=0;int verdura=0;
	
	do{	
	System.out.println("Selecciona una de las siguientes opciones para continuar: ");
	System.out.println("1- Crear perfil. ");
	System.out.println("2- Calculo del IMC.");
	System.out.println("3- Seguir hábitos saludables. ");
	System.out.println("4- Conocer si llevas una alimentación variada y rica para una buena salud. ");
	System.out.println("5- Salir del programa. ");
		hacer1 = sc.nextInt();
//menu			
	switch(hacer1){
		//case1 menu
		case 1: 
				int buclepe=0;
				for(int p=0;buclepe<1;p++){
					
				System.out.println("¿Cuantos perfiles quieres hacer? 1 o 2: ");
				perfiles= sc.nextInt();
				 if(perfiles>0 && perfiles<3){
				switch(perfiles){
				
				case 1:buclepe++;
					System.out.println("Nombre: ");
					nombre= sc.nextLine();
					sc.nextLine();
							
					
					System.out.println("dame DNI: ");
						DNI= sc.nextLine();
						
					/*	
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					DNIT=DNI+""+letra;
						Validardni(DNI,letra,DNIT);						
						*/
					
					System.out.printf("Edad entre 5 y 120 años: ");
					edad= sc.nextInt();
					
					buclep(edad);
															
					
					System.out.printf("Sexo(M)Masculino o (F)Femenino: ");
					sexo=sc.next().charAt(0);
					buclesex(sexo);
				
				
				
				break;
				case 2:
				buclepe++;
					System.out.printf("Nombre: ");
					nombre= sc.nextLine();
					sc.nextLine();
					
					
					
						
					System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
				/*		
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					
						DNIT=DNI+""+letra;
						Validardni(DNI,letra,DNIT);	
						*/
					System.out.printf("Edad entre 5 y 120 años: ");
					edad= sc.nextInt();
					
					buclep(edad);
														
																								
					System.out.printf("Sexo(M)Masculino o (F)Femenino: ");
					sexo=sc.next().charAt(0);
					buclesex(sexo);
					
					
					
					
			
					System.out.printf("Nombre: ");
					nombre2= sc.nextLine();
					sc.nextLine();
					
					
						
					System.out.printf("dame numeros del DNI: ");
						 DNI2= sc.nextLine();
						/*
					System.out.println(" dame la letra: ");
						letra2= sc.next().charAt(0);
					
						DNIT2=DNI2+""+letra2;
						Validardni(DNI2,letra2,DNIT2);	
					
					*/
						
					
					System.out.printf("Edad entre 5 y 120 años: ");
					edad2= sc.nextInt();
					
					buclep(edad2);
							
					System.out.printf("Sexo(M)Masculino o (F)Femenino: ");
					sexo2=sc.next().charAt(0);
					buclesex(sexo2);
					break;
					
				}
				}
				else{
					System.out.println("mala seleccion, cuantos quiere hacer,1 o 2: ");
					perfiles= sc.nextInt();					
				}											
				}
			break;
//case 2 menu
		case 2:		
		System.out.println("dame dni para revisar perfil");
		String dnicase2=sc.nextLine();
		 dnicase2=sc.nextLine();
					if(dnicase2.equals(DNI)){	
		System.out.println("Hola "+nombre+" da los siguientes datos para calcular el IMC");
		
			
			System.out.println("dame altura en metros: ");
			altura= sc.nextFloat();
			
			System.out.println("dame el peso en KG: ");
			peso= sc.nextFloat();
			
			 Imc(peso,altura,totalimc);	
					}
					if(dnicase2.equals(DNI2)){	
		System.out.println("Hola "+nombre2+" da los siguientes datos para calcular el IMC");
			
			System.out.println("dame altura en metros: ");
			altura= sc.nextFloat();
			
			System.out.println("dame el peso en KG: ");
			peso= sc.nextFloat();
			
			 Imc(peso,altura,totalimc);	
					}
					else{
						System.out.println("no hay perfil creado");
					}				
					System.out.println("");
					System.out.println("");
					System.out.println("");
		break;
//case3		menu	
		case 3:	
		
			
				System.out.printf("DNI de tu perfil: ");
				String dnicase3=sc.nextLine();
				sc.nextLine();
				if(dnicase3.equals(DNI)){
					System.out.println("hola"+nombre);
				}
				if(dnicase3.equals(DNI2)){
					System.out.println("hola"+nombre);
				}
				else{
					System.out.println("no hay perfil");
				}
				System.out.println("6.1  ¿Fumas a menudo?");										
				System.out.println("a. Si");								
				System.out.println("b. Algunos días ");
				System.out.println("c. No");
						char primero=sc.next().charAt(0);
						preguntas(primero);
				
				System.out.println(" 6/2 ¿ Cuanto alcohol bebes?");
				System.out.println(" a. Todos los días");
				System.out.println(" b. Sobretodo los fines de semana");
				System.out.println(" c. Muy poco");
				char segundo=sc.next().charAt(0);
				preguntas(segundo);



				
				
				System.out.println("6.3 ¿Cuántas horas duermes al día? ");
				System.out.println("a. Menos de 4 horas ");
				System.out.println("b. Entre 5 y 6 horas ");
				System.out.println("c. Más de 6 horas ");
				char tercero=sc.next().charAt(0);
				preguntas(tercero);
				
				System.out.println(" 6.4 ¿Sueles estresarte y notar cansancio a lo largo del día?");
				System.out.println("a. Es mi día a día ");
				System.out.println("b. A veces ");
				System.out.println(" c. Muy poco");
				char cuarto=sc.next().charAt(0);
				preguntas(cuarto);



				
				System.out.println(" 6.5 ¿Cuál es tu forma física?");
				System.out.println(" a. Estoy muy desentrenado tanto en fuerza como en resistencia");
				System.out.println(" b. Forma física normal");
				System.out.println(" c. Muy buena forma física");
				char quinto=sc.next().charAt(0);
				preguntas(quinto);



				System.out.println("6.6 ¿Cuántas veces practicas deporte a la semana?");
				System.out.println("a. Entre 1 y 2 veces ");
				System.out.println("b. Entre 3 y 4 veces");
				
				System.out.println("c. Todos los días ");
				char sexto=sc.next().charAt(0);
				preguntas(sexto);
				if(primero=='c' && segundo =='c' && tercero=='c' && cuarto=='c' && quinto=='c' && sexto=='c'){
					
					System.out.println(" los hábitos en el día a día son muy buenos y que de seguir así gozara mas facilmente de una buena salud aumentando la esperanza de vida más de 10 años.");
				}
				if(primero=='a' && segundo =='a' && tercero=='a' && cuarto=='a' && quinto=='a' && sexto=='a'){
					System.out.println("a salud de la persona corre peligro y que debe cambiar sus habitos de forma drástica e inmediata para prevenir posibles enfermedades.");
					
				}
		break;
		
//case4		menu
	
		case 4:	
			System.out.printf("DNI de tu perfil: ");
			 dnicase3=sc.nextLine();
				sc.nextLine();
				if(dnicase3.equals(DNI)){
					System.out.println("hola"+nombre);
					System.out.println("¿cuantas comidas realizas al dia?");
			int comidas=sc.nextInt();
			if(comidas>0 && comidas <11){
			switch(comidas){ 
				case 1:
				buclecomidas(comidas,verdura,fruta);
				
				
				break;
				case 2:
				buclecomidas(comidas,verdura,fruta);
				
				
				
				break;
				case 3:
				buclecomidas(comidas,verdura,fruta);
				
				
				break;
				case 4:
				buclecomidas(comidas,verdura,fruta);
				
				break;
				case 5:
				buclecomidas(comidas,verdura,fruta);
				
				break;
				case 6:
				buclecomidas(comidas,verdura,fruta);
				
				break;
				case 7:
				buclecomidas(comidas,verdura,fruta);
				
				
				break;
				case 8:
				buclecomidas(comidas,verdura,fruta);
				
				
				
				break;
				case 9:
				buclecomidas(comidas,verdura,fruta);
				
				
				
				break;
				case 10:
				buclecomidas(comidas,verdura,fruta);				
				break;
			
				
			}
				}
				if(dnicase3.equals(DNI2)){
					System.out.println("hola"+nombre);

				}
				else{
					System.out.println("no hay perfiles");
				}
			
			
			}
			
			
			
			
			
			
			
			
		break;
//fin de programa	case5 menu			
		case 5:	
			
			System.out.println("has cerrado el programa");
			menu--;
		break;
				
				}
				
				
	}		
	while(menu>0);
				
				
}





//bucle comidas
static void buclecomidas(int buclec, int verdura,int fruta){
Scanner sc = new Scanner(System.in);
			int totalverd =0;
			int totalfrut=0;
for (int q=0;buclec>0;q++){
			
		System.out.println("¿Cuantas porciones de verdura ( guarnicion, verdura cruda, ensalada)?");
		 verdura=sc.nextInt();
		System.out.println("¿cuantas porciones de fruta (porcion equivvale a puñado de uvas)?");
		 fruta=sc.nextInt();
		totalverd= totalverd + verdura;
		totalfrut=totalfrut+fruta;
		
	buclec--;
	
	
}

if(totalfrut<5 && totalfrut>=0){
	System.out.println(totalfrut+" Son el total de frutas, es necesario comer al menos 5 piezas de fruta al dia");
}
else{
	System.out.println(totalfrut+" Son el total de frutas,continua con el habito de comer fruta");
}
if(totalverd>=0 && totalverd<3){
	System.out.println(totalverd+" Son total de verduras, es necesario comer al menos 5 piezas de verdura al dia");
}
else{
	System.out.println(totalverd+" Son total de verduras, continua con el hábito de comer verdura");
}

System.out.println("¿Cuantas veces a la semana comes McDonals, Kebab o Burger KIng?");
				double mc =sc.nextInt();
				double totalmc= mc*100;
				double totalsemana=buclec*7;
			double porcentaje= totalmc/totalsemana;
			System.out.println("el porcentaje total es:"+porcentaje+"%");
			System.out.println(" ");
			
			if(porcentaje==0){
				System.out.println("El no comer comida rápida va a beneficiar tu salud a largo plazo.");
				System.out.println(" ");
			}
			if(porcentaje>0 && porcentaje<10){
				System.out.println("Tu porcentaje de comida rápida semanal ingerida es 8.5%. Está dentro del límite recomendado siempre que hagas deporte y descanses lo suficiente");
			System.out.println(" ");
			}
			if(porcentaje>10 && porcentaje<40){
				System.out.println("Tu porcentaje de comida rápida semanal ingerida es 20.9%. Deberías comer menos comida rápida para prevenir posibles problemas de salud.");
			System.out.println(" ");
			}
			if(porcentaje>40){
				System.out.println("Tu porcentaje de comida rápida semanal ingerida es 53%. Debes cambiar tus hábitos, tu salud está en riesgo por tu alta ingesta de comida rápida. ");
			}
}






//preguntas case 3

static char preguntas(char preg){
	Scanner sc = new Scanner(System.in);
	char fallo;
	int bucle=0;
	for (int q=0;bucle<=1;q++){
			
		
	if(preg=='a' || preg=='b' || preg=='c'){
		if(preg=='a'){
			bucle++;
		}
		if(preg=='b'){
			System.out.println("este punto debes mejorarlo");bucle++;
		}
		if(preg=='c'){
			bucle++;
		}
		
	
	}
		else{
			System.out.println("dame letra correcta");
			 preg=sc.next().charAt(0);
		}
	}
	return preg;
}



/*
//validador DNI
static void Validardni(String DNI,char letra,String DNIT){
		Scanner sc = new Scanner(System.in);
	
	int bucledni=0;
	for(int p=0;bucledni<1;p++){
																		
						if(DNI.length()==8){
						int dnin2=Integer.parseInt(DNI);
						int dninr=dnin2 % 23;
						
						
						
				

						char letras;
		if (letra >= 'A' && letra<= 'Z'){
			
			switch(dninr){
				case 0:				
					letras=('T');
					if (letras==letra){
						 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");
					 System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					bucledni++;							
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
					
				case 1:
					letras=('R');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}	
				break;
				
				case 2:
					 letras= ('W');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						 System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 3:
					 letras= ('A');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						 System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}	
				break;
				
				case 4:
					 letras = ('G');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						 System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}	
				
				break;
				
				case 5:
					letras = ('M');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
						}	
				break;
				
				case 6:
					letras = ('Y');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}			
				break;
				case 7:
					 letras = ('F');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}			

				break;
				
				case 8:
					 letras = ('P');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}		

				break;
				
				case 9:
					 letras = ('D');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}		
				break;
				
				case 10:
					letras = ('X');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}		
				break;
				
				case 11:
					 letras = ('B');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 12:
					letras = ('N');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				case 13:
					 letras = ('J');
					 if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				case 14:
					 letras= ('Z');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 15:
					 letras= ('S');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 16:
					letras = ('Q');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 17:
					 letras = ('V');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
					break;
				
				case 18:
					letras = ('H');
					if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 19:
					 letras= ('L');
					 if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 20:
					 letras = ('C');
					 if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				case 21:
					 letras = ('K');
					 if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;
						 System.out.println("el DNi: "+DNIT+" no es valido");
						  System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
					}
				break;
				
				case 22:
					 letras = ('E');
					 if (letras==letra){
					 DNIT=dnin2+""+letra;
					System.out.println("el DNi: "+DNIT+" es valido");	bucledni++;
					}
					else{
						 DNIT=dnin2+""+letra;				
						System.out.println("el DNi: "+DNIT+" no es valido");	
						System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();						
						System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);						
					}
				break;

			}
			
					}
		else{
		System.out.println("la letra no es valida");
		
			System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
		}		
	}	
	else{
		System.out.println("la longitud del DNI no es la correcta");
			System.out.printf("dame numeros del DNI: ");
						DNI= sc.nextLine();
						
					System.out.println(" dame la letra: ");
						letra= sc.next().charAt(0);
	}

	}

}
*/
//imc
static double Imc(float a,float b, float c){
		
	c=a/(2*b);	
	System.out.println("El imc es: "+c);
	if(c< 18.5){
				System.out.println("peso inferior al normal");
	}
	if(c>18.5 && c<24.9){
	System.out.println("peso normal");
	}
	if(c>=25.0 && c<=29.9){
	System.out.println("peso superior al normal");
	}
	if(c>30){
		System.out.println("Tienes obesidad");
	}
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
	return c;
	
	}























//bucle de edad
static void buclep(int a){
	Scanner sc = new Scanner(System.in);
		int bucle=0;
			 
	for (int q=0;bucle<=1;q++){
			if(a>=5 && a<=120){
			System.out.println("");
				bucle = 2;
				
				
			}
			
	
			else{
				
				
				System.out.println("no es correcto vuelva a ponerlo: ");
						a = sc.nextInt();
			}
		}
	
	return ;
}
//bucle sexo
static void buclesex(char a){
	Scanner sc = new Scanner(System.in);
		int bucle=0;
			 
	for (int q=0;bucle<=1;q++){
		 a= Character.toUpperCase(a);
			if(a=='M' || a=='F'){
			System.out.println("");
				bucle = 2;
				
				
			}
			
	
			else{
						System.out.println("no es correcto vuelva a ponerlo: ");
						a = sc.next().charAt(0);
			}
		}
	
	return ;
}





















}
