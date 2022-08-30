public class SerializablePlayers{
	
	
	public static void main(String[] args){
try{

FileOutputStream archivo=new FileOutputStream(Futbolista.sec);
ObjectOutputStream os=new ObjectOutputStream(archivo);

Futbolista f1 =null;
Futbolista f2 =null;
Futbolista f3 =null;

Futbolista primer=new Futbolista("lateral","Alejandro",2);
os.writeObject(f1);

Futbolista primer=new Futbolista("extremo","Jorge",2);
os.writeObject(f2);

Futbolista primer=new Futbolista("portero","Sofian",2);
os.writeObject(f3);





}
	catch(FileNotFoundException e){
		System.out.println("excepcion File not found");
		}
		
		catch(IOException halo){
		System.out.println("error mientras se leia el fichero.");	
		}
		catch(Exception hola){
			System.out.println("excepcion allada");
		} 	
		finally{
			archivo.close();
			os.close();
			
		}
	}
}