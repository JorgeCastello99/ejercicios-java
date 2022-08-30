/**
@Author Jorge castello
@java version "1.1"
*/ 


public class Ordenador{

	//Inicializacion Atributos: Marca, ram,duracion bateria.
	String marca;
	int ram;
	int bateria;
	 
	
	//Constructores
	public Ordenador(String marca, int ram, int bateria){
		this.marca = marca;
		this.ram = ram;
		this.bateria = bateria;
	
	}
	
	
	//Metodos:cree dos ordenadores diferentes y muestre sus datos por pantalla
	//y modifique alguno de sus atributos.
	
	
	public String getMarca(){
	return marca;	
	}
	
	public void setMarca(String nuevamarca){
		marca=nuevamarca;
	}
	
	public int getRam(){
		return ram;
	}
	
	public void setRam(int nuevaram){
		ram = nuevaram;
	}
	
	
	public int getbateria(){
		return bateria;
	}
	
	public void setbateria(int nuevabateria){
		bateria= nuevabateria;
	}
	
	
	//main
	
	public static void main(String[] args) {
	
	Ordenador ordenador1 = new Ordenador("Hp",4,10);
	System.out.println("el primer ordenador: "+ordenador1.getMarca()+", "+ordenador1.getRam()+" Gb de RAM, "+ordenador1.getbateria()+"mAh");
	System.out.println("");
	System.out.println("cambio de "+ordenador1.getMarca()+" a ACER");
	ordenador1.setMarca("ACER");
	System.out.println("primer ordenador: "+ordenador1.getMarca()+", "+ordenador1.getRam()+" Gb de RAM, "+ordenador1.getbateria()+" horas de bateria");
	System.out.println("");
	Ordenador ordenador2 = new Ordenador("Apple",6,14);
	System.out.println("segundo ordenador: marca "+ordenador2.getMarca()+", "+ordenador2.getRam()+" Gb de RAM, "+ordenador2.getbateria()+" horas de bateria");
	ordenador2.setbateria(18);
	System.out.println("");
	System.out.println("el segundo ordenador: marca "+ordenador2.getMarca()+", "+ordenador2.getRam()+" Gb de RAM, "+ordenador2.getbateria()+" horas de bateria");
	
	}
}
