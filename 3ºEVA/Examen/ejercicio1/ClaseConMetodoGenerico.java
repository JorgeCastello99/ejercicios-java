
public class ClaseConMetodoGenerico{

public static <T>int compararTamano(T[] a,T[] b){
return a.length-b.length;

}

public static void main(String[] args){
	
	Integer [] a={4,1,2,3};
	Integer [] b={6,4,5,8,2,6};
	

	
	
	if(compararTamano(a,b)==0){
		System.out.println("Son iguales");
	}
	if(compararTamano(a,b)<0){
		System.out.println("El array b es el mayor");
	}
	if(compararTamano(a,b)>0){
		System.out.println("El array a es el mayor");
	}
	
	Double[] c={4.23,1.43,2.123,3.54};
	Double[] d={6.54,4.34};
	if(compararTamano(c,d)==0){
		System.out.println("Son iguales");
	}
	if(compararTamano(c,d)<0){
		System.out.println("El array d es el mayor");
	}
	if(compararTamano(c,d)>0){
		System.out.println("El array c es el mayor");
	}
	
}
}