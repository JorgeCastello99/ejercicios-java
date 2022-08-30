import javax.swing.JOptionPane;
public class Ejecutable {
  
    public static void main(String[] args){

    String nombre="";
    nombre=JOptionPane.showInputDialog("Nombre del empleado");
	Empleado E1 = new Empleado(nombre);

	nombre=JOptionPane.showInputDialog("Nombre del directivo");
	Directivo D1 = new Directivo(nombre);

	nombre=JOptionPane.showInputDialog("Nombre del operario");
	Operario OP1 = new Operario(nombre);

	nombre=JOptionPane.showInputDialog("Nombre del oficial");
	Oficial OF1 = new Oficial(nombre);

	nombre=JOptionPane.showInputDialog("Nombre del técnico");
	Tecnico T1 = new Tecnico(nombre);
	
	System.out.println(E1);
	System.out.println(D1);
	System.out.println(OP1);
	System.out.println(OF1);
	System.out.println(T1);

	}
}
















