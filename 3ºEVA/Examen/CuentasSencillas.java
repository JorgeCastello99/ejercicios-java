public class CuentasSencillas implements Cuentas{
	
	private double primero,segundo;
	
	public CuentasSencillas(double primero,double segundo){
		this.primero=primero;
		this.segundo=segundo;
	}
	
	public String toString(){
		String mensaje="Primer dato es: "+primero+", el segundo dato es: "+segundo;
		return mensaje;
		
	}
	
	public double minimo(){
		if(primero<segundo){
			return primero;
		}
		else{
			return segundo;
		}
		
	}
	public double maximo(){
		if(primero>segundo){
			return primero;
		}
		else{
			return segundo;
		}
		
	}
	public double suma(){
		double total=primero+segundo;
		return total;
	}
	
	
	
}