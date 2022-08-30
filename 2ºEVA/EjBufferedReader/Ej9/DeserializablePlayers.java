public class DeserializablePlayers{
	public static void main(String[] args){
		try{
		FileInputStream fis=new FileOutputStream(Futbolista.sec);
		ObjectInputStream ois=new ObjectOutputStream(fis);
		
		Futbolista f1=(Futbolista)ois.read
		
		

		
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