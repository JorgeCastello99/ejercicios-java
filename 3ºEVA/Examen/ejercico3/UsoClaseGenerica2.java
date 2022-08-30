public class UsoClaseGenerica2{
public static void main(String[] args){

	
	ClaseGenerica2<Integer> u=new ClaseGenerica2<Integer>();
	Integer[] g={0,1,2,3,4,5,6,7,8,9};
	for(int i=0;i<g.length;i++){
		System.out.print("|"+g[i]);
	}
	
	
	
	boolean bv=u.invertir(g);
	
	if(bv=true){
		
			System.out.println("");
		System.out.println("Se ha podido invertir");
		System.out.println("");
		
		
	System.out.println("=========INVERTIR============");
	
	
		for(int i=0;i<g.length;i++){
		System.out.print("|"+g[i]);

	}
	}
	
	
		
	
	


}
}