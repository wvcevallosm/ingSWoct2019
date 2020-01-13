
package proyect_metodos;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Pasajero;

public class MetodoPasajero {
    String RutaCorrecta="";   
    Vector vPrincipal = new Vector();
    Vector v1 = new Vector();       
 
   /*  Se agregó este método para controlar que el archivo de almacenamiento exista        */
   /*  caso contrario lo selecciona y guarda su respectiva ruta para poder ser utilizada   */
   /*  mas adelante en otros procesos                                                      */   
    public String SeleccionaArchivoCorrecto(){
        File archivo= new File("C:\\ArchivosTexto\\pasajero.txt");
        if (!archivo.exists()){
            JOptionPane.showMessageDialog(null, "Archivo no existe, favor seleccionar");
            JFileChooser seleccionaFile = new JFileChooser();
            seleccionaFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
            seleccionaFile.setMultiSelectionEnabled(false);
            FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivos textos","txt");
            seleccionaFile.setFileFilter(filtro);
            
            int resultado=seleccionaFile.showOpenDialog(null);
            if (resultado==JFileChooser.APPROVE_OPTION) {
                RutaCorrecta=seleccionaFile.getSelectedFile().getAbsolutePath();
             }else{
                RutaCorrecta="";
            }
        }else{
            
            RutaCorrecta="C:\\ArchivosTexto\\pasajero.txt";
            
        }
        return RutaCorrecta;       
    }//Fin de método seleccionar archivo correcto.    
    
    //guarda datos en el vector
    public void guardarPasajero(Pasajero unPasajero) {
        vPrincipal.addElement(unPasajero);
    }
    
    //guardar archivo txt
    public void guardarArchivoPasajero(Pasajero pasajero){
        
        try {
             RutaCorrecta=SeleccionaArchivoCorrecto(); 
             if (RutaCorrecta!=""){
               FileWriter fw = new FileWriter (RutaCorrecta, true);
               BufferedWriter bw = new BufferedWriter(fw);
               PrintWriter pw = new PrintWriter(bw);
               pw.print(pasajero.getNombre_pasajero());
               pw.print("|"+pasajero.getApellido_pasajero());
               pw.print("|"+pasajero.getTipo_pasajero());
               pw.print("|"+pasajero.getCedula_pasajero());
               pw.println("|"+pasajero.getEdad_pasajero());
               pw.close();            
             }else{
                 JOptionPane.showMessageDialog(null, "Selección de Archivo incorrecto, imposible Guardar información");
             }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //mostrar los datos en el jtable
    public DefaultTableModel listaPasajero(){
        RutaCorrecta=SeleccionaArchivoCorrecto();       
        Vector cabeceras = new Vector();
        cabeceras.addElement("NOMBRE");
        cabeceras.addElement("APELLIDO");
        cabeceras.addElement("CATEGORIA");
        cabeceras.addElement("CEDULA");
        cabeceras.addElement("EDAD");
        
        //Crear vector con nombre apellido pasajero cedula edad
        DefaultTableModel mdlTablaP = new DefaultTableModel(cabeceras,0);
        if (RutaCorrecta!=""){
            try {

               FileReader fr = new FileReader(RutaCorrecta);
               BufferedReader br = new BufferedReader(fr);
               String d;

               while ((d=br.readLine())!=null){
                   StringTokenizer dato = new StringTokenizer (d,"|");
                   Vector x = new Vector();
                   while (dato.hasMoreTokens()){
                       x.addElement(dato.nextToken());
                   }
                   mdlTablaP.addRow(x);
               }
               br.close();
               fr.close();              
           }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           }       
        }else{
            JOptionPane.showMessageDialog(null, "Selección de Archivo incorrecto, no se mostrará información");
        }
        return mdlTablaP;
    }
    //-------------------------------------------//
  
    public Vector BuscarPasajero(String cedulaP){
        try {
            RutaCorrecta=SeleccionaArchivoCorrecto();  
            if (RutaCorrecta!=""){
              FileReader fr = new FileReader(RutaCorrecta);
              BufferedReader br = new BufferedReader(fr);
              String d;
              while ((d=br.readLine())!=null){
                  StringTokenizer dato = new StringTokenizer (d,"|");
                  Vector x = new Vector();
                  while (dato.hasMoreTokens()){
                      x.addElement(dato.nextToken());
                      }
                          String a = x.elementAt(3).toString();
                          if(a.equals(cedulaP)){

                              vPrincipal=x;
                              System.out.println(vPrincipal);     
                  }
              }
              br.close();
              fr.close();          
            }else{
                JOptionPane.showMessageDialog(null, "Selección de Archivo incorrecto, ruta no encontrada");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
        return vPrincipal;
    }
 
    public Vector EditarPasajero(String unIdUser) {
        try{
            Vector vtmp = new Vector();
            FileReader fr = new FileReader("C:\\ArchivosTexto\\pasajero.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                String a = x.elementAt(0).toString();
                if(!a.equals(unIdUser)){
                    vtmp.add(d);
                }
            }
            br.close();
            fr.close();
            v1=vtmp;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
        return v1;   
    }   
    
    
    public void EditaPasajero(Pasajero pasajero){
          try {
            FileWriter fw = new FileWriter ("C:\\ArchivosTexto\\pasajeroTMP.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(pasajero.getNombre_pasajero());
            pw.print("|"+pasajero.getApellido_pasajero());
            pw.print("|"+pasajero.getTipo_pasajero());
            pw.print("|"+pasajero.getCedula_pasajero());
            pw.println("|"+pasajero.getEdad_pasajero());
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }         
    }
    
    public void EliminarPasajero(){
        //Se reusa el método de Editar Pasajero para la eliminación (usando archivo TMP)
        //del registro, donde no se incorpora el regitro a eliminar.
    }
    
}
