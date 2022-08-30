import javax.swing.JFrame;
 import javax.swing.JDialog;
 import javax.swing.JPanel;
  import javax.swing.JOptionPane;
  import java.awt.Color;
public class PruebaJPanel{
	
public static void main(String[] args) {


	JFrame fr=new JFrame("Ejercicio 4");
	JPanel pa=new JPanel();

	fr.setVisible(true);
	fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);

	//fr.setSize(500,400);
	//fr.setLocation(500,300);
	fr.setBounds(500,300,650,400);
	fr.setResizable(true);
	pa.setBackground(Color.blue);
	fr.setTitle("Bloc de notas");
	fr.getContentPane().add(pa);//agregamos el panel
	
	
	


}
}