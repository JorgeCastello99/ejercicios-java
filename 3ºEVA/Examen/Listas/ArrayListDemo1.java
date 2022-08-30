import java.util.List;
import java.util.LinkedList; 
import java.util.ArrayList;
public class  ArrayListDemo1{
public static void main (String[] args){

ArrayList<Integer> al=new ArrayList<Integer>();
System.out.println("===============Punto 1==================\n");


	for(int i=0;i<20;i++){
		al.add(i,i+1);
	}
	for(int i=0;i<20;i++){
		System.out.println(+al.get(i));
	}
	//for (Integer i: al) System.out.println("Elemento:" + i);

	//punto2
	System.out.println("===============Punto 2==================\n");


	for(int i=0;i<20;i++){
		if(al.get(i)==11){
		al.set(i,12);
	}
}
	//punto 3
System.out.println("===============Punto 3==================\n");

	al.add(8,25);

	//punto 4
	System.out.println("===============Punto 4==================\n");

	for(int i=0;i<20;i++){
		if(al.get(i)==25){
		al.remove(i);
		break;
	}
}

	//punto 5
System.out.println("===============Punto 5==================\n");

	
	for(int i=19;i>=0;i--){
		if(al.get(i)==12){
		al.remove(i);
		break;
	}
}


	//punto 6
System.out.println("===============Punto 6==================\n");

for(int i=0;i<20;i++){
		if(al.get(i)==12){
		al.add(i,11);
	}
}
	//punto 7
System.out.println("===============Punto 7==================\n");

List subLista = al.subList(0,10);

for (Object i: subLista) System.out.println("sublista:" + i);

//punto 8
	System.out.println("===============Punto 8==================\n");
subLista.clear();
//punto 9
System.out.println("===============Punto 9==================\n");
for (Integer i: al) System.out.println("lista:" + i);

System.out.println("Sucede que se ha borrado la sublista por lo que lo que habia en la lista tambien pero se ha rellenado con el siguiente valor de la lista");

//Punto 10
	System.out.println("===============Punto 10==================\n");


 List subLista2 = al.subList(0,10);
for (Object i: subLista) System.out.println("sublista:" + i);

//Punto 11
	System.out.println("===============Punto 11==================\n");





}
}