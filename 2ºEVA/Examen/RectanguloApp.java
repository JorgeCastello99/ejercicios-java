public class RectanguloApp{
public static void main (String[] args){
	
	Punto p1=new Punto (3,5);
	Punto p2=new Punto (1,1);
	Punto p3=new Punto (6,2);
	
	Rectangulo rect1= new Rectangulo(p1,5,10);
	Rectangulo rect2= new Rectangulo(p2,20,30);
	
	rect1.desplazar(4,4);

	rect2.setPuntoReferencia(p3);
	rect2.desplazar(2,6);
	System.out.println(rect2);
	System.out.printf(rect1.toString());
	System.out.printf(" El area del primer rectangulo es: %n",rect1.calcularArea());
	
	if(rect1.estaDentro(p3)==true){
		System.out.println("El punto esta dentro");
		
	}
	else{
		System.out.println("El punto no esta dentro");
	}
}
}