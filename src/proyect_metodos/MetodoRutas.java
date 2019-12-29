package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Boleto;
import proyect_clases.Rutas;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MetodoRutas {
    String RutaCorrecta="";
    Vector vPrincipal = new Vector();

    /*  Se agregó este método para controlar que el archivo de almacenamiento exista        */
    /*  caso contrario lo selecciona y guarda su respectiva ruta para poder ser utilizada   */
    /*  mas adelante en otros procesos                                                      */    
    public String SeleccionaArchivoCorrecto(){
      File archivo= new File("C:\\Rutas.txt");
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
            RutaCorrecta="C:\\Rutas.txt";
        }
        return RutaCorrecta;       
    }//Fin de método seleccionar archivo correcto.
    //guarda datos en el vector
    public void guardarRutas(Rutas unaRuta) {
        vPrincipal.addElement(unaRuta);
    }
    //guardar archivo txt
    //Se incorpora nuevo método para validar la Ruta correcta    
    public void guardarArchivoRutas(Rutas rutas){
        try {
            RutaCorrecta=SeleccionaArchivoCorrecto(); 
            if (RutaCorrecta!="") {
                FileWriter fw = new FileWriter (RutaCorrecta, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.print(rutas.getId_Ruta());
                pw.print("|"+rutas.getNombre_Ruta());
                pw.print("|"+rutas.getOrigen_Ruta());
                pw.print("|"+rutas.getDestino_Ruta());
                pw.print("|"+rutas.getCosto_Ruta());
                pw.print("|"+rutas.getHora_Ruta());
                pw.println("|"+rutas.getFecha_Ruta());
                pw.close();           
            }else{
                JOptionPane.showMessageDialog(null, "Selección de Archivo incorrecto, imposible Guardar información");
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //mostrar los datos en el jtable
    //Se incorpora nuevo método para validar la Ruta correcta
    public DefaultTableModel listaRutas(){
        RutaCorrecta=SeleccionaArchivoCorrecto();
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("RUTA");
        cabeceras.addElement("ORIGEN");
        cabeceras.addElement("DESTINO");
        cabeceras.addElement("COSTO");
        cabeceras.addElement("HORA");
        cabeceras.addElement("FECHA");
        //Crear vector con nombre apellido pasajero cedula edad
        DefaultTableModel mdlTablaR = new DefaultTableModel(cabeceras,0);
        if (RutaCorrecta!="") {
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
                mdlTablaR.addRow(x);
            }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }           
        }else{
            JOptionPane.showMessageDialog(null, "Selección de Archivo incorrecto, no se mostrará información");
        }
        return mdlTablaR;
    }
     //Se incorpora nuevo método para validar la Ruta correcta  
    public Vector BuscarRuta(String unaRuta){
        try {
            RutaCorrecta=SeleccionaArchivoCorrecto();   
            if (RutaCorrecta!="") {
                FileReader fr = new FileReader(RutaCorrecta);
                BufferedReader br = new BufferedReader(fr);
                String d;
                while ((d=br.readLine())!=null){
                    StringTokenizer dato = new StringTokenizer (d,"|");
                    Vector x = new Vector();
                    while (dato.hasMoreTokens()){
                        x.addElement(dato.nextToken());
                        }
                            String a = x.elementAt(1).toString();
                            if(a.equals(unaRuta)){
                                vPrincipal=x;
                                System.out.println(vPrincipal);     
                    }
                }br.close();
                fr.close();           
            }else{
                JOptionPane.showMessageDialog(null, "Selección de Archivo incorrecto, ruta no encontrada");
            }
          }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }       
        return vPrincipal;
    }
    
    public void EditarRutas() {
           
        //FALTA
    }
    
    
    public void EliminarRutas() {
           
        //FALTA
    }
    
    
}
