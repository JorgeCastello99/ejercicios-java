//Clase
public class Coche{
	//Atributos
	String marca;
	String modelo;
	String matricula;
	int motor;
	String combustible;
	int kms;
	//Constructor
	public Coche(String marca,String modelo,String matricula,int motor,String combustible,int kms){
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.motor=motor;
		this.combustible=combustible;
		this.kms=kms;
	}	
	public Coche(String marca,String modelo,String matricula,int motor,String combustible){
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.motor=motor;
		this.combustible=combustible;
		
	}	
	
	//Metodos
	public String getMarca(){
	return marca;	
	}
	
	public void setMarca(String nuevamarca){
		marca=nuevamarca;
	}
	
	public String getModelo(){
	return modelo;	
	}
	
	public void setModelo(String nuevomodelo){
		modelo=nuevomodelo;
	}
	
	public String getMatricula(){
	return matricula;	
	}
	
	public void setMatricula(String nuevamatricula){
		matricula=nuevamatricula;
	}
	
	public int getMotor(){
	return motor;	
	}
	
	public void setMotor(int nuevomotor){
		motor=nuevomotor;
	}
	
	public String getCombustible(){
	return combustible;	
	}
	
	public void setCombustible(String nuevocombustible){
		combustible=nuevocombustible;
	}
	
	public int getKms(){
	return kms;	
	}
	
	public void setKms(int nuevokms){
		kms=nuevokms;
	}
	
	public static void main(String[] args) {
		
		Coche c1= new Coche("SEAT","Ibiza","2342FDZ",120,"diesel",40);
		c1.setCombustible("gasolina");
		System.out.println("choche 1: "+c1.getMarca()+", "+c1.getModelo()+", "+c1.getMatricula()+", "+c1.getMotor()+"Cv, "+c1.getCombustible()+", "+c1.getKms()+" Kms.");
		
		System.out.println("");
		
		Coche c2= new Coche("Mercedes","C4","2342FDZ",120,"diesel",40);
		System.out.println("choche 2: "+c2.getMarca()+", "+c2.getModelo()+", "+c2.getMatricula()+", "+c2.getMotor()+"Cv, "+c2.getCombustible()+", "+c2.getKms()+" Kms.");
		c2.setMatricula("3456DRV");
		System.out.println("choche 2: "+c2.getMarca()+", "+c2.getModelo()+", "+c2.getMatricula()+", "+c2.getMotor()+"Cv, "+c2.getCombustible()+", "+c2.getKms()+" Kms.");
		
		System.out.println("");
		
		Coche c3= new Coche("SEAT","Corsa","2342FDZ",120,"gasolina");
		
		System.out.println("choche 3: "+c3.getMarca()+", "+c3.getModelo()+", "+c3.getMatricula()+", "+c3.getMotor()+"Cv, "+c3.getCombustible()+".");
		
		c3.setMarca("Opel");
		System.out.println("choche 3: "+c3.getMarca()+", "+c3.getModelo()+", "+c3.getMatricula()+", "+c3.getMotor()+"Cv, "+c3.getCombustible()+".");
		
		
		
		
	}
}