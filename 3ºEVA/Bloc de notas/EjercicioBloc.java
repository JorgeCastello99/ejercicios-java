
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class EjercicioBloc{
	
public static void main(String[] args) {
//guardar,salir,scrollbar,
//Creacion de marco

	JFrame marco=new JFrame("Bloc de notas");
marco.setVisible(true);
	marco.setDefaultCloseOperation(marco.EXIT_ON_CLOSE);
marco.setBounds(500,300,650,400);


//Area de texto
         JTextArea ta = new JTextArea();
			
 //scroll	
JScrollPane scroll=new JScrollPane(ta);  

//archivo:guardar,guardarcomo..
JFileChooser filec=new JFileChooser();
 

//Menu
	 JMenuBar menu = new JMenuBar();       
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu formato = new JMenu("Formato");
        JMenu ver = new JMenu("Ver");
        JMenu ayuda = new JMenu("Ayuda");       
        menu.add(archivo);       
        menu.add(edicion);     
        menu.add(formato);       
        menu.add(ver); 
        menu.add(ayuda);     

        //menu archivo  
        JMenuItem nuevo = new JMenuItem("Nuevo"); 
        	nuevo.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			ta.setText("");
        		}
        	});


        JMenuItem abrir = new JMenuItem("Abrir"); 
        	abrir.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			
        			
        		filec.setFileSelectionMode(JFileChooser.FILES_ONLY);
        	try{
	        	if(filec.showOpenDialog(marco)==JFileChooser.APPROVE_OPTION){
	        		File archivoselec=filec.getSelectedFile();
	        		JOptionPane.showMessageDialog(marco,"De la Ruta: "+archivoselec.getAbsolutePath()+"\n Has seleccionado el archivo: "+archivoselec.getName());
	        			ta.setText("");
	        		FileInputStream fis=new FileInputStream(archivoselec.getAbsolutePath());				
	        		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
	        		
		        		String linea;
		        		while((linea=br.readLine())!=null){
		        			ta.setText(ta.getText()+linea+"\n");
		        		}
	        				
        			}
        			else{
        				JOptionPane.showMessageDialog(marco,"Archivo no seleccionado");
        			}
        		}catch(IOException a){
        			System.out.println(a.getMessage());
        		}

        	
        	}
        	});

        JMenuItem guardar = new JMenuItem("Guardar");
        	guardar.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			try{
        				
        				 filec.setFileSelectionMode(JFileChooser.FILES_ONLY);
   					 if (filec.showOpenDialog(marco)==JFileChooser.APPROVE_OPTION){
					        File archivo = filec.getSelectedFile();
					        FileWriter fw= null;
					        fw= new FileWriter(archivo);
           					 fw.write(ta.getText());

					      fw.close();
					      JOptionPane.showMessageDialog(marco,"Archivo guardado correctamente");

					  }
					  else{
					  	JOptionPane.showMessageDialog(marco,"Archivo no guardado");
					  }
        		}catch(IOException a){
        			System.out.println(a.getMessage());
        		}
        	}
        	});

        JMenuItem guardarcomo = new JMenuItem("Guardar como..."); 
        /*	guardarcomo.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			
        			
        		}
        	});*/

        JMenuItem configurar = new JMenuItem("Configurar Pagina...");       
        JMenuItem imprimir = new JMenuItem("Imprimir");

        JMenuItem salir = new JMenuItem("Salir"); 
        	salir.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			
        			System.exit(0);
        		}
        	});




       archivo.add(nuevo);       
       archivo.add(abrir);  
       archivo.add(guardar);       
       archivo.add(guardarcomo);
       //lineas de separacion  
       archivo.addSeparator();
       archivo.add(configurar);       
       archivo.add(imprimir);  
       archivo.addSeparator();
       archivo.add(salir);   

        
        //menu Edicion
         JMenuItem deshacer = new JMenuItem("Deshacer"); 
        JMenuItem cortar = new JMenuItem("Cortar");  
        	cortar.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			
        				ta.cut();
        			
        		}
        	});

        JMenuItem copiar = new JMenuItem("Copiar");

			copiar.addActionListener(new ActionListener(){
			        		public void actionPerformed(ActionEvent e){
			        			
			        				ta.copy();
			        			
			    }
			  });

        JMenuItem pegar = new JMenuItem("Pegar");  
        	pegar.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
			        			
			        				ta.paste();
			        			
			    }
			  });


        JMenuItem eliminar = new JMenuItem("Eliminar");
       

        JMenuItem buscar = new JMenuItem("Buscar");
        JMenuItem buscarsiguiete = new JMenuItem("Buscar siguiente"); 
        JMenuItem remplazar = new JMenuItem("Remplazar...");       
        JMenuItem ir = new JMenuItem("Ir a...");

        JMenuItem seleccionartodo = new JMenuItem("Seleccionar todo"); 
        	 seleccionartodo.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
			        			
			        				ta.selectAll();
			        			
			    }
			  });

        JMenuItem fechahora = new JMenuItem("Fecha y hora"); 

       edicion.add(deshacer);    
      edicion.addSeparator();   
       edicion.add(cortar);  
       edicion.add(copiar);       
       edicion.add(pegar);  
       edicion.add(eliminar); 
      edicion.addSeparator();      
       edicion.add(buscar);  
       edicion.add(buscarsiguiete);    
       edicion.add(remplazar);       
       edicion.add(ir);  
      edicion.addSeparator();
       edicion.add(seleccionartodo);       
       edicion.add(fechahora);  
         


        //Menu formato
        JMenuItem ajustelinea = new JMenuItem("Ajuste de linea"); 
        JMenuItem fuente = new JMenuItem("Fuente...");       
        
       formato.add(ajustelinea);       
       formato.add(fuente);

        //Menu ver
        JMenuItem zoom = new JMenuItem("Zoom"); 
        JMenuItem barraestado = new JMenuItem("Barra estado"); 

        ver.add(zoom);       
        ver.add(barraestado);

      



        //Menu ayuda
        JMenuItem verayuda = new JMenuItem("Ver la ayuda"); 
        JMenuItem acercade = new JMenuItem("Acerca del bloc de notas"); 
        		acercade.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			JOptionPane.showMessageDialog(null,"Bloc de notas creado por Jorge Castello");
        		}
        	});

         ayuda.add(verayuda);  
         ayuda.addSeparator();     
         ayuda.add(acercade);


   
 
	
	


//Agregar compnentes
    
 marco.getContentPane().add(BorderLayout.NORTH, menu);       
 marco.getContentPane().add(BorderLayout.CENTER,ta);  
 marco.getContentPane().add(scroll,BorderLayout.CENTER);  

 //activa el scroll con el textarea
scroll.getViewport().add(ta,null);  

 //para que el marco se vea
 marco.setResizable(true);
  

	
	


}
}