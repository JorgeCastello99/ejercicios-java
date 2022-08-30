import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class IteradorLinkedListDemo{
	public static void main(String[] args) {
		
			LinkedList<String> lista=new LinkedList<String>();

			lista.add("monitor");
			lista.add("teclado");
			lista.add("raton");
			lista.add("silla");
			lista.add("PC");
		




			Iterator <String> it= lista.iterator();

String nombre=it.next();
				while(it.hasNext()) {
				 nombre= it.next();
				System.out.println(nombre);
				
				
			}


	if(it.equals("monitor")) {
				it.remove();

			}
			Iterator <String> iti= lista.iterator();

		while(iti.hasNext()) {
				 
				System.out.println(nombre);
				nombre= iti.next();
				
			}


		System.out.println("============Ej 2==============");
			ArrayList<String> list=new ArrayList<String>();



	}
}