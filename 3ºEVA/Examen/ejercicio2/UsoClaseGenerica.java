
public class UsoClaseGenerica{
public static void main(String [] args){
	try{
	
	ClaseGenerica<Integer> u=new ClaseGenerica<Integer>();
	Integer[] g={0,1,2,3,4,5,6,7,8,9};
	for(int i=0;i<g.length;i++){
		System.out.print("|"+g[i]);
	}
	
	
	u.invertir(g);
	
	
System.out.println("");
	System.out.println("=========INVERTIR============");
		for(int i=0;i<g.length;i++){
		System.out.print("|"+g[i]);
	}
	
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e);
	
}

}

}