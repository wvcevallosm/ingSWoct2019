
package proyect_metodos;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Pasajero;

public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    //guarda datos en el vector
    public void guardar(Pasajero unPasajero) {
        vPrincipal.addElement(unPasajero);
    }
    
    //guardar archivo txt
    public void guardarArchivo(Pasajero pasajero){
        try {
            FileWriter fw = new FileWriter ("C:\\Users\\HackWhite\\Desktop\\Pasajero.txt", true);
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
    
    //mostrar los datos en el jtable
    public DefaultTableModel listaPasajero(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("NOMBRE");
        cabeceras.addElement("APELLIDO");
        cabeceras.addElement("TIPO");
        cabeceras.addElement("CEDULA");
        cabeceras.addElement("EDAD");
        
        //Crear vectos con nombre apellido tipo de pasajero cedula edad
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        try {
            FileReader fr = new FileReader("C:\\Users\\HackWhite\\Desktop\\Pasajero.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
            
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
    public boolean renombrarArchivoTmp(String archivoOriginal,String archivoTMP){
        boolean resultado=false;
        File ficheroTMP=new File (archivoTMP);
        File ficheroOriginal=new File (archivoOriginal);
        resultado = ficheroTMP.renameTo(ficheroOriginal);
        return resultado;
    }

    public boolean crearArchivoTMP (String archivoTMP) throws IOException{
        boolean resultado=false;
 	FileWriter archivo = new FileWriter("C:\\ArchivosTexto\\"+archivoTMP);
        archivo.close();
        File archivoCreado = new File("C:\\ArchivosTexto\\"+archivoTMP);
        if (archivoCreado.exists()){
            resultado=true;
        }
        return resultado;
    }
    
    
    public boolean eliminarArchivoOriginal(String nombreArchivo){
        boolean resultado=false;
        File fichero = new File (nombreArchivo);
        if (fichero.delete()){
            resultado=true;
        }
        return resultado;
    }
    public boolean esVacio(String valor){
        if (valor.isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }
}
