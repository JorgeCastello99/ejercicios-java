import java.util.Scanner;
import java.util.Arrays;
public class ArrayCuentas implements Cuentas{
	private double[] array;
	private int a;
	
	
	public ArrayCuentas(int a){
		array=new double[a];
		
		for(int i =0;i<array.length;i++){
			
			this.array[i]=(double) (Math.random()*9.99);
		}
			
	}
	
	
	public double minimo(){
		double min=array[0];
		for(int i=0;i<array.length;i++){
			if(min>array[i]){
					min=array[i];
					
				}
				
		}
		return min;
	}
	
	public double maximo(){
		double max=array[0];
		for(int i=0;i<array.length;i++){
			
			if(max<array[i]){
				max=array[i];
				
			}
			
		}
		return max;
	}
	public double suma(){
		
		double total=0;
		for(int i=0;i<array.length;i++){
			double sumar=array[i];
			total=total+sumar;
			
		}
		return total;
	}
	
	
	
	
	
	public String toString(){
		String mensaje="El array contiene"+Arrays.toString(array);
			return mensaje;
		
		
	}
	
	
}