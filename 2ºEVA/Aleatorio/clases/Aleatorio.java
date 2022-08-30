//Crear clase aleatorio que genere 10 numeros entre 50-100 y muestre por pantalla
//Crear carpeta con otro archivo que llame a este metodo
package clases;

public class Aleatorio{
	
	
	public static void aleatorio(){
		int numero=10;
		int aleatorio;
		do{
		aleatorio=(int) (Math.random()*50 + 50);
		System.out.println(aleatorio);
		numero--;
		}
		while(numero>0);
	}	

}