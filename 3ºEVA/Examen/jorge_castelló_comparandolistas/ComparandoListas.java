import java.util.List;
import java.util.LinkedList; 
import java.util.ArrayList;
public class ComparandoListas{
public static void main (String[] args){

	
ArrayList<Personas> al=new ArrayList<Personas>();
LinkedList<Personas> lista=new LinkedList<Personas>();

//punto 1
int i;
System.out.println("===============Punto 1==================");


System.out.println("=====Crear ArrayList=====");
long t0= System.nanoTime();

for(i=0;i<1000000;i++){

String nombre="Jorge"+i;
int id=i;
double altura=(double) (Math.random()*2.10)+0.5;
Personas p=new Personas(id,nombre,altura);
al.add(p);



}

System.out.print("El tiempo que tarda en meter todos los objectos en la lista: ");
long t1= System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");




System.out.println("=====Crear linkedList=====");

 t0= System.nanoTime();
for(i=0;i<1000000;i++){

	String nombre="Jorge"+i;
	int id=i;
	double altura=(double) (Math.random()*2.10)+0.5;
	Personas p=new Personas(id,nombre,altura);
	lista.add(p);
}

System.out.print("El tiempo que tarda en meter todos los objectos en la lista: ");
t1= System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

//Punto 2
System.out.println("===============Punto 2==================");
System.out.println("Tiempo invertido en insertar la persona en la posicion 0 del ArrayList");
Personas p2=new Personas(0,"alex",1.23);
t0=System.nanoTime();

al.add(0,p2);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");
System.out.println("Tiempo invertido en insertar la persona en la posicion 0 del LinkedList ");

t0=System.nanoTime();
lista.add(0,p2);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");


//Punto 3
System.out.println("===============Punto 3==================");
System.out.println("Tiempo invertido en insertar la persona en la mitad del ArrayList");

t0=System.nanoTime();

al.add(500000,p2);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

System.out.println("Tiempo invertido en insertar la persona en la mitads del LinkedList ");

t0=System.nanoTime();
lista.add(500000,p2);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");


//punto 4
System.out.println("===============Punto 4==================");
System.out.println("Tiempo invertido en eliminar 10 personas del inicio del ArrayList");

t0=System.nanoTime();
for(i=0;i<10;i++){
al.remove(i);
}

t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

System.out.println("Tiempo invertido en eliminar 10 personas del inicio del LinkedList");
t0=System.nanoTime();
for(i=0;i<10;i++){
lista.remove(i);
}

t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");


//punto 5 objeto enlazan y integer,double... copia
System.out.println("===============Punto 5==================");

System.out.println("Tiempo invertido en eliminar la persona en la mitad del ArrayList ");

t0=System.nanoTime();
al.remove(500000);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

System.out.println("Tiempo invertido en eliminar la persona en la mitad del LinkedList ");
t0=System.nanoTime();
lista.remove(500000);
t1=System.nanoTime()-t0;

System.out.println(t1+" nanosegundos");

//punto 6
System.out.println("===============Punto 6==================");
System.out.println("Tiempo invertido en acceder (mostrando por pantalla la persona) a la persona de la posicion del medio del arrayList");
t0=System.nanoTime();
System.out.println(al.get(500000));
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

System.out.println("Tiempo invertido en acceder (mostrando por pantalla la persona) a la persona de la posición del medio del LinkedList");
t0=System.nanoTime();
System.out.println(lista.get(500000));
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

//punto 7
System.out.println("===============Punto 7==================");
System.out.println("Tiempo invertido en acceder  a la persona de la posicion 0 del arrayList");
t0=System.nanoTime();
al.get(0);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");

System.out.println("Tiempo invertido en acceder a la persona de la posicion 0 del LinkedList");
t0=System.nanoTime();
lista.get(0);
t1=System.nanoTime()-t0;
System.out.println(t1+" nanosegundos");
}
}