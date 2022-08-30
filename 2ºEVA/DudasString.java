public class DudasString{
	
	public static void modifica(String a){
a="pablito lancha";
}
public static void main(String[] args) {
	//1
String p1="Jorge";
String p2=new String("Jorge");
System.out.println(p1);
System.out.println(p2);

if(p1==p2){
	System.out.println("referencian al mismo objeto");
}
else{
System.out.println("no referencian al mismo objeto");
}
System.out.println("===============================");
//2a
String p3="caste";
String p4="caste";
System.out.println(p3);
System.out.println(p4);
if(p3==p4){
	System.out.println("referencian al mismo objeto");
}
else{
System.out.println("no referencian al mismo objeto");
}

//2b
p4="weyy";
System.out.println(p4);
if(p3==p4){
	System.out.println("referencian al mismo objeto");
}
else{
System.out.println("no referencian al mismo objeto");
}


System.out.println("===============================");
//3

String p5=new String("hola");
String p6=new String("hola");
System.out.println(p5);
System.out.println(p6);
if(p5==p6){
	System.out.println("referencian al mismo objeto");
}
else{
System.out.println("no referencian al mismo objeto");
}

if(p5.equals(p6)){
	System.out.println("tienen el mismo contenido");
}
else{
	System.out.println("no tienen el mismmo contenido");
	
}
System.out.println("===============================");
//4
String p7=new String("pablo");

System.out.println(p7);

modifica(p7);
System.out.println(p7);
System.out.println("===============================");
//5
String p8="hola me llamo jorge castello,";
System.out.println(p8);
int longi=p8.length();
System.out.println(longi);

String p9=" hola mundo";

String p10=p8.concat(p9);
System.out.println(p10);





}
}