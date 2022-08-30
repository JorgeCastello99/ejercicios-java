import javax.swing.JFrame;
 import javax.swing.JDialog;
 import javax.swing.JPanel;
  import javax.swing.JOptionPane;
public class PruebaJDialog{
	
public static void main(String[] args) {


	JFrame fr=new JFrame("Ejercicio 3");
	JOptionPane midialogo=new JOptionPane("Bienvenido a mi programa",JOptionPane.PLAIN_MESSAGE);
	JDialog mid= midialogo.createDialog("Programa DAM");
	

	mid.setVisible(true);
	
	fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);

	fr.setSize(500,400);

	fr.setVisible(true);


}
}