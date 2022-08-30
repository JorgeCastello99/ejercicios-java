public class EjecutableCuentas{


public static void main(String[] args){
		
		
	
		CuentasSencillas cs=new CuentasSencillas(23,30);
		System.out.println(cs.toString());
		System.out.println("Minimo: "+cs.minimo());
		System.out.println("Maximo: "+cs.maximo());
		System.out.println("Sumatorio: "+cs.suma());
		
		
		
		System.out.println("\n");
		ArrayCuentas ac=new ArrayCuentas(7);
		
		
		
		System.out.println(ac.toString());
		
		System.out.println("Minimo: "+ac.minimo());
		System.out.println("Maximo: "+ac.maximo());
		System.out.println("Sumatorio: "+ac.suma());
	}
}