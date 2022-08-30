public class Ejercicio2s{
public static void main(String[] args){
	
StringBuilder strb=new StringBuilder ("Hoal Muuundo");
strb.delete(6,8);
System.out.println(strb);
strb.append ("!");
System.out.println(strb);
strb.insert (0,"¡");
System.out.println(strb);
strb.replace (4,6,"la");
System.out.println(strb);
}
}