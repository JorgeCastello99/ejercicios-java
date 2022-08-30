
import java.io.*;
public class Srectangulo{
	public static void main(String[] args){
	
	try{
		File file=new File("Rectangulos.ser");
		file.createNewFile();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
	
			Punto p1=new Punto (3,5);
			Punto p2=new Punto (1,1);
			
			
			Rectangulo rect1= new Rectangulo(p1,5,10);
			Rectangulo rect2= new Rectangulo(p2,20,30);
			
			oss.writeObject(rect1);
			oss.writeObject(rect2);

	}
	catch(IOException e){
		System.out.println(e.getMessage());
	}
	finally{
		oos.close();
	}
	}
}