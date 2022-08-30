


import java.util.List;
import java.util.LinkedList; 
public class  CochesLinkedList{



public static void combo(LinkedList a1){

	imprimirArray(a1);
	imprimirNumCars(a1);
}


public static void imprimirArray(LinkedList a){
for (Object i: a) System.out.println("lista:" + i);

}


public static void imprimirNumCars(LinkedList a){

	System.out.println("hay "+a.size()+" marcas de coche creadas");

}


public static void main (String[] args){
	LinkedList<String> cars=new LinkedList<String>();

cars.add("Suzuki");
cars.add("Toyota");
cars.add("Kia");
cars.add("Audi");
combo(cars);
System.out.println("=================================\n");
cars.add(2,"SEAT");
combo(cars);
System.out.println("=================================\n");
cars.add("Ford");
combo(cars);
System.out.println("=================================\n");
for(int i=0;i<cars.size();i++){
if(cars.get(i).equals("SEAT")){
	cars.set(i,"Seat");
}
}
combo(cars);
System.out.println("=================================\n");
cars.remove(0);
combo(cars);
System.out.println("=================================\n");
cars.add("Seat");

for(int i=0;i<cars.size();i++){
if(cars.get(i).equals("Seat")){
	System.out.println(cars.get(i));
	System.out.println("la posicion de la primera marcaseat es: "+i);
	break;
}
}
System.out.println(cars.indexOf("Seat"));

System.out.println("=================punto 4 por la cola ================\n");



//cars.add(cars.subList(0,3));
combo(cars);


System.out.println("=================================\n");

System.out.println(cars.get(2));

System.out.println("=================================\n");
System.out.println("La posicion del ultimmo seat es: "+cars.lastIndexOf("Seat"));

System.out.println("=================================\n");



//Ejercicio 5
System.out.println("================Ejercicio 5=================\n");

System.out.println(cars.peek());
System.out.println("=================================\n");
cars.offer("volvo");
combo(cars);

System.out.println("=================================\n");
combo(cars);

for(int i=0;i<cars.size();i++){
	System.out.println(cars.peek());
	cars.poll();
	


}

System.out.println("=================================\n");

combo(cars);

}
}
