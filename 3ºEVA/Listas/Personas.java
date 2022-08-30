
public class Personas{
private int idPersona;
private String nombre;
private double altura;

public Personas(int idPersona,String nombre,double altura){
this.idPersona=idPersona;
this.nombre=nombre;
this.altura=altura;

}
public String toString(){
	String mensaje="IdPersona: "+idPersona+", nombre: "+nombre+"y la altura es :"+altura;
	return mensaje;
}

}