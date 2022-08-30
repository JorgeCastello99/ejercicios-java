import Ejercicio1ut3.Hucha;
public class HuchaEjecutable{
	public static void main(String[] args){
	
	Hucha primerahucha = new Hucha("Jorge Castello",100.45);
	System.out.println("");
	primerahucha.sacarDinero(75);
	System.out.println("");
	System.out.println(primerahucha);
	
	
	Hucha segundaHucha = new Hucha ("Dark Vader",10);
	segundaHucha.aumentarAhorro(30);
	segundaHucha.aumentarAhorro(0.80);
	segundaHucha.sacarDinero(15.25);
	System.out.println("");
	System.out.println(segundaHucha);
	}
}
