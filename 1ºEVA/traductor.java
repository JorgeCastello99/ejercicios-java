import java.util.Scanner;
	public class traductor{
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	/*String idioma;
	String mes;
	
	
	System.out.print("idioma a traducir: ");
	idioma = sc.nextLine();
	System.out.println( idioma.toUpperCase());
	String lenguaje= idioma.equals("Es")? "ingles" : "españñol";
	System.out.print("introduzca mes a traducir: " +lenguaje+ " a traducir");
	usuario = sc.nextLine();
	String mes= (usuario.toLowerCase());
	
	
	String traduccion="";
	traduccion= (idioma.equals("EN") && mes.equals("january"))? "enero" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("february"))? "febrero" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("march"))? "marzo" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("april"))? "abril" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("may"))? "mayo" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("june"))? "junio" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("july"))? "julio" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("august"))? "agosto" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("september"))? "septiembre" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("october"))? "octubre" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("november"))? "noviembre" :traduccion;
	traduccion= (idioma.equals("EN") && mes.equals("december"))? "diciembre" :traduccion;
	
	traduccion= (idioma.equals("ES") && mes.equals("enero"))? "january" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("febrero"))? "february" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("marzo"))? "march" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("abril"))? "april" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("mayo"))? "may" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("junio"))? "june" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("julio"))? "july" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("agosto"))? "august" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("septiembre"))? "september" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("octubre"))? "october" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("noviembre"))? "november" :traduccion;
	traduccion= (idioma.equals("ES") && mes.equals("deciembre"))? "december" :traduccion;
	
	String salida="Al traduci "+usuario+"se obtiene"+traduccion;
	String error="Se ha producido un error" + ":( ";
	String resultado = traduccion.Length()>0 ? salida : error;
	System.out.println(resultado);
	*/
	
	
	
	

	System.out.print("introduzca idioma a traducir(es o en): ");
	String idioma = sc.nextLine();
	
	
	
	if(idioma.equals("es")){
		System.out.println("mes que quieres traducir al español: ");
		String mes = sc.nextLine();
	
		 if(mes.equals("january")){
			System.out.println("la traduccion es enero");
		}
		else if(mes.equals("february")){
			System.out.println("la traduccion es febrero");
		}
		else if(mes.equals("march")){
			System.out.println("la traduccion es marzo");
		}
		else if(mes.equals("april")){
			System.out.println("la traduccion es abril");
		}
		else if(mes.equals("may")){
			System.out.println("la traduccion es mayo");
		}
		else if (mes.equals("june")){
			System.out.println("la traduccion es junio");
		}
		else if(mes.equals("july")){
			System.out.println("la traduccion es julio");
		}
		else if(mes.equals("august")){
			System.out.println("la traduccion es agosto");
		}
		else if(mes.equals("september")){
			System.out.println("la traduccion es septiembre");
		}
		else if(mes.equals("october")){
			System.out.println("la traduccion es octubre");
		}
		else if(mes.equals("november")){
			System.out.println("la traduccion es noviembre");
		}
		else if(mes.equals("december")){
			System.out.println("la traduccion es diciembre");
		}
		
		
	}
		
	 if(idioma.equals ("en")){
		System.out.println("mes que quieres traducir al ingles: ");
		String mes1 = sc.nextLine();
	
		 if(mes1.equals("enero")){
			System.out.println("la traduccion es juanary");
		}
		else if(mes1.equals("febrero")){
			System.out.println("la traduccion es february");
		}
		else if(mes1.equals("marzo")){
			System.out.println("la traduccion es march");
		}
		else if(mes1.equals("abril")){
			System.out.println("la traduccion es april");
		}
		else if(mes1.equals("mayo")){
			System.out.println("la traduccion es may");
		}
		else if (mes1.equals("junio")){
			System.out.println("la traduccion es june");
		}
		else if(mes1.equals("julio")){
			System.out.println("la traduccion es july");
		}
		else if(mes1.equals("agosto")){
			System.out.println("la traduccion es august");
		}
		else if(mes1.equals("septiembre")){
			System.out.println("la traduccion es september");
		}
		else if(mes1.equals("octubre")){
			System.out.println("la traduccion es october");
		}
		else if(mes1.equals("noviembre")){
			System.out.println("la traduccion es november");
		}
		else if(mes1.equals("diciembre")){
			System.out.println("la traduccion es december");
		}
		
	
	}
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	}
}