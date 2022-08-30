import java.util.List;
import java.util.LinkedList; 
import java.util.ArrayList;
public class  LinkedListDemo1{
public static void main (String[] args){

	LinkedList<Integer> lista=new LinkedList<Integer>();

	lista.add(1);
	lista.add(3);
	lista.add(1,2);
	System.out.print("La suma de la posicion 1 y 2 es :\n"+(lista.get(0)+lista.get(1)));

}
}