
public class ClaseGenerica2 <T>{


public boolean invertir(T[] a){
	
T aux;	
boolean invert=false;
int i=0;


 for ( i=0; i<a.length/2; i++) {
            aux = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = aux;
   }
   
	if(i==a.length){
		invert=true;
		
	}
    
   return invert;
   
   
}
}