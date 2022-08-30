public class Ejecutable{
	public static void main(String[] args) {
		
		float preciot=0;
		float preciol=0;
		float precioelec=0;
		Electrodomestico[] a1=new Electrodomestico[10];

		a1[0]=new Television();
		a1[1]=new Lavadora();
		a1[2]=new Electrodomestico();
		a1[3]=new Lavadora(100.67f,65.34f);
		a1[4]=new Television(500f,"Azul",'C',50f,40,true);
		a1[5]=new Lavadora(600.99f,"Gris",'E',45f,7);
		a1[6]=new Electrodomestico(110f,"Dorado",'V',25.45f);
		a1[7]=new Lavadora(450f,"negro",'F',80f,10);
		a1[8]=new Television(1000f,"gris",'A',70.43f,60,false);
		a1[9]=new Television();
		
float total;
boolean entrar=false;
		for(int i=0;i<a1.length;i++){
		total=a1[i].precioFinal();

		entrar=true;

			if(total instanceof Television){
				System.out.println("Television: "+total.getPrecioBase());
				preciot+=total.getPrecioBase();

				entrar=false;
			}
			if(total instanceof Lavadora){
				System.out.println("Lavadora: "+total.getPrecioBase());
				preciol+=total.getPrecioBase();
				entrar=false;
			}


			if(total instanceof Electrodomestico && entrar==true){
				System.out.println("Electrodomestico: "+total.getPrecioBase());
				precioelec+=a1[i].getPrecioBase();
			}
}
		System.out.println("Precio total de las televisiones: "+preciot+"\nPrecio ttal de las lavadoras: "+preciol+"\nPrecio total electrodomesticos: "+precioelec);

		System.out.println("\nPrecio total de todos los electrodomesticos(television y lavadoras): "+(preciol+preciot+precioelec));

		

		





	}
}