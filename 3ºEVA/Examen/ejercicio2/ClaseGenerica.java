public class ClaseGenerica<T>{

public void invertir(T[] a){
	
T aux;	

 for (int i=0; i<a.length/2; i++) {
            aux = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = aux;
   
   }
   
   
    
   
}
}