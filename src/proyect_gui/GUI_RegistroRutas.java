package proyect_gui;

import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyect_clases.Rutas;
import proyect_metodos.MetodoRutas;
import proyect_metodos.Metodos;

public class GUI_RegistroRutas extends javax.swing.JFrame {

    Rutas ruta = new Rutas();
    MetodoRutas metodos = new MetodoRutas();
    DefaultTableModel mdlTablaR;
    Vector vCabeceras = new Vector();
    boolean editarRegistro=false;    
    Metodos validacion=new Metodos();
    
    public GUI_RegistroRutas() {
        initComponents();
        
        vCabeceras.addElement("ID");
        vCabeceras.addElement("RUTA");
        vCabeceras.addElement("ORIGEN");
        vCabeceras.addElement("DESTINO");
        vCabeceras.addElement("COSTO");
        vCabeceras.addElement("HORA");
        vCabeceras.addElement("FECHA");
        mdlTablaR = new DefaultTableModel(vCabeceras,0);
        table_rutas.setModel(mdlTablaR);
        table_rutas.setModel(metodos.listaRutas());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_rutas = new javax.swing.JTable();
        btn_r_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_r_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_r_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_r_origen = new javax.swing.JTextField();
        txt_r_destino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_r_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_r_hora = new javax.swing.JTextField();
        txt_r_costo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_r_nombre1 = new javax.swing.JTextField();
        txt_r_id1 = new javax.swing.JTextField();
        btn_r_nuevo = new javax.swing.JButton();
        btn_r_guardar = new javax.swing.JButton();
        btn_r_eliminar = new javax.swing.JButton();
        btn_r_actializar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo De Rutas");

        table_rutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "TIPO", "CEDULA", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_rutas);

        btn_r_salir.setText("Salir");
        btn_r_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_salirActionPerformed(evt);
            }
        });

        jLabel9.setText("Hora");

        jLabel1.setText("ID");

        jLabel3.setText("Costo Ruta");

        txt_r_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_r_nombreKeyTyped(evt);
            }
        });

        jLabel4.setText("Ruta");

        txt_r_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_r_idKeyTyped(evt);
            }
        });

        jLabel5.setText("Origen");

        txt_r_origen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_r_origenKeyTyped(evt);
            }
        });

        txt_r_destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_r_destinoKeyTyped(evt);
            }
        });

        jLabel2.setText("Destino");

        jLabel10.setText("Fecha");

        jLabel6.setText("DATOS DE LA RUTA:");

        txt_r_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_r_costoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_r_hora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_origen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_id, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txt_r_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txt_r_destino))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txt_r_fecha)
                            .addComponent(jLabel3)
                            .addComponent(txt_r_costo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_r_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel7.setText("BUSQUEDA DE LA RUTA:");

        jLabel8.setText("ID");

        jLabel11.setText("Ruta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_r_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txt_r_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btn_r_nuevo.setText("Nuevo");
        btn_r_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_nuevoActionPerformed(evt);
            }
        });

        btn_r_guardar.setText("Guardar");
        btn_r_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_guardarActionPerformed(evt);
            }
        });

        btn_r_eliminar.setText("Eliminar");
        btn_r_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_eliminarActionPerformed(evt);
            }
        });

        btn_r_actializar.setText("Editar");
        btn_r_actializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_actializarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_r_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btn_r_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r_actializar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r_salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_r_nuevo)
                        .addGap(35, 35, 35)
                        .addComponent(btn_r_guardar)
                        .addGap(34, 34, 34)
                        .addComponent(btn_r_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_r_actializar)
                        .addGap(35, 35, 35)
                        .addComponent(btn_r_salir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_r_actializar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean ValidacionIngresos(){
        boolean resultado=true;
        Metodos validacion=new Metodos();
        
        boolean validaCampo=false;
        validaCampo=validacion.esVacio(txt_r_id.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar valores en ID");
            txt_r_id.requestFocus();
            resultado=false;
            return resultado;
        }
       validaCampo=validacion.esVacio(txt_r_nombre.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar nombre de Ruta válida");
            txt_r_nombre.requestFocus();
            resultado=false;
            return resultado;
        }     
        validaCampo=validacion.esVacio(txt_r_costo.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar Costo válido");
            txt_r_costo.requestFocus();
            resultado=false;
            return resultado;
        }      
        validaCampo=validacion.esVacio(txt_r_origen.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar Origen válido");
            txt_r_origen.requestFocus();
            resultado=false;
            return resultado;
        }        
         validaCampo=validacion.esVacio(txt_r_destino.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar Destino válido");
            txt_r_destino.requestFocus();
            resultado=false;
            return resultado;
        }        
        validaCampo=validacion.esVacio(txt_r_fecha.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar Fecha válido");
            txt_r_fecha.requestFocus();
            resultado=false;
            return resultado;
        } 
        validaCampo=validacion.esVacio(txt_r_hora.getText());
        if (validaCampo==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar Hora válido");
            txt_r_hora.requestFocus();
            resultado=false;
            return resultado;
        }
        return resultado;
    }//Fin de métodos validación de Ingresos
    
    
    private void btn_r_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_guardarActionPerformed
        if (ValidacionIngresos()){
            if(editarRegistro){
            
                Vector vEditar = new Vector();       
                String idRuta = txt_r_id.getText();
                vEditar = metodos.EditarRutas(idRuta);              
                if (!vEditar.isEmpty()){
                    try {
                        //Crear archivo Temporal
                        if (!validacion.crearArchivoTMP("rutasTMP.txt")){
                            JOptionPane.showMessageDialog(rootPane, "Error al crear archivo Temporal!");                       
                            return;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Recorrer el vector y agregar los registros
                    int i=0;
                    while (i <= vEditar.size()-1){
                        StringTokenizer linea = new StringTokenizer (vEditar.elementAt(i).toString(),"|");
                        Vector x = new Vector();
                        while (linea.hasMoreTokens()){
                             x.addElement(linea.nextToken());
                         }                       
                        int id_u =Integer.parseInt(x.elementAt(0).toString());
                        ruta.setId_Ruta(id_u);
                        ruta.setNombre_Ruta(x.elementAt(1).toString());
                        ruta.setOrigen_Ruta(x.elementAt(2).toString());
                        ruta.setDestino_Ruta(x.elementAt(3).toString());
                        ruta.setCosto_Ruta(x.elementAt(4).toString());
                        ruta.setHora_Ruta(x.elementAt(5).toString());
                        ruta.setFecha_Ruta(x.elementAt(6).toString());
                        
                        metodos.EditaRutas(ruta);
                        i++;
                    }//fin de ciclo While
                    //Eliminar archivo original
                    boolean resultaElimina=validacion.eliminarArchivoOriginal("C:\\ArchivosTexto\\Rutas.txt");
                    if(resultaElimina){
                        //Renombrar archivo temporal
                        boolean resultadoRenombrar=validacion.renombrarArchivoTmp("C:\\ArchivosTexto\\Rutas.txt","C:\\ArchivosTexto\\rutasTMP.txt");
                        if (!resultadoRenombrar){
                            JOptionPane.showMessageDialog(rootPane, "Error al renombrar archivo Temporal!");
                            return;                       
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Error al eliminar archivo Original!");
                        return;
                    }
                    //Agrego el registro que se encuentra en el formulario               
                    int id_r = Integer.parseInt(txt_r_id.getText());
                    String nombre_r = txt_r_nombre.getText();
                    String origen_r = txt_r_origen.getText();
                    String destino_r = txt_r_destino.getText();
                    String costo_r = txt_r_costo.getText();
                    String hora_r = txt_r_hora.getText();
                    String fecha_r = txt_r_fecha.getText();
                    ruta.setId_Ruta(id_r);
                    ruta.setNombre_Ruta(nombre_r);
                    ruta.setOrigen_Ruta(origen_r);
                    ruta.setDestino_Ruta(destino_r);
                    ruta.setCosto_Ruta(costo_r);
                    ruta.setHora_Ruta(hora_r);
                    ruta.setFecha_Ruta(fecha_r);
                    metodos.guardarRutas(ruta);
                    metodos.guardarArchivoRutas(ruta);
                    table_rutas.setModel(metodos.listaRutas());       
                    JOptionPane.showMessageDialog(rootPane, "Registro actualizado Satisfactoriamente");                   
                }//fin de edición de Registros           
             }else{
                mdlTablaR = new DefaultTableModel();
                int id_r = Integer.parseInt(txt_r_id.getText());
                String nombre_r = txt_r_nombre.getText();
                String origen_r = txt_r_origen.getText();
                String destino_r = txt_r_destino.getText();
                String costo_r = txt_r_costo.getText();
                String hora_r = txt_r_hora.getText();
                String fecha_r = txt_r_fecha.getText();

                ruta.setId_Ruta(id_r);
                ruta.setNombre_Ruta(nombre_r);
                ruta.setOrigen_Ruta(origen_r);
                ruta.setDestino_Ruta(destino_r);
                ruta.setCosto_Ruta(costo_r);
                ruta.setHora_Ruta(hora_r);
                ruta.setFecha_Ruta(fecha_r);
                metodos.guardarRutas(ruta);
                metodos.guardarArchivoRutas(ruta);
                table_rutas.setModel(metodos.listaRutas());             
            }//Guardar datos nuevos
            limpiarTextos();
        } 
    }//GEN-LAST:event_btn_r_guardarActionPerformed
    
    
    private void btn_r_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_r_salirActionPerformed

    private void btn_r_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_nuevoActionPerformed
        // Limpia los Jtext:
        limpiarTextos();
    }//GEN-LAST:event_btn_r_nuevoActionPerformed
    private void limpiarTextos(){
        txt_r_id.setText("");
        txt_r_nombre.setText("");
        txt_r_origen.setText("");
        txt_r_destino.setText("");
        txt_r_costo.setText("");
        txt_r_hora.setText("");
        txt_r_fecha.setText("");   
        boolean editarRegistro=false;       
      }
    private void btn_r_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_eliminarActionPerformed
        // Boton eliminar Rutas en tabla
        boolean validaCampoID=validacion.esVacio(txt_r_id1.getText());
        if (validaCampoID==false) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar ID válido a eliminar!");
            txt_r_id1.requestFocus();
            return;
        }
        //Incorporar código para eliminar registro seleccionado.
        Vector v = new Vector();       
        String idRuta = txt_r_id1.getText();
        v = metodos.BuscarRuta(idRuta,1);
        if (!v.isEmpty()){
            txt_r_id.setText((String) v.elementAt(0));
            txt_r_nombre.setText((String) v.elementAt(1));
            txt_r_costo.setText((String) v.elementAt(4));
            txt_r_origen.setText((String) v.elementAt(2));       
            txt_r_destino.setText((String) v.elementAt(3));
            txt_r_fecha.setText((String) v.elementAt(6));
            txt_r_hora.setText((String) v.elementAt(5));
          
            if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)           
                eliminarRegistro();
            limpiarTextos();    
        }else{
           JOptionPane.showMessageDialog(rootPane, "No se encuentra el Id a buscar");
            txt_r_id1.requestFocus();
        }                
    }//GEN-LAST:event_btn_r_eliminarActionPerformed

    private void eliminarRegistro(){
        Vector vEditar = new Vector();       
        String idRuta = txt_r_id.getText();
        vEditar = metodos.EditarRutas(idRuta);              
         if (!vEditar.isEmpty()){
             try {
                 //Crear archivo Temporal
                 if (!validacion.crearArchivoTMP("rutasTMP.txt")){
                     JOptionPane.showMessageDialog(rootPane, "Error al crear archivo Temporal!");                       
                     return;
                 }
             } catch (IOException ex) {
                 Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
             }
             //Recorrer el vector y agregar los registros
             int i=0;
             while (i <= vEditar.size()-1){
                 StringTokenizer linea = new StringTokenizer (vEditar.elementAt(i).toString(),"|");
                 Vector x = new Vector();
                 while (linea.hasMoreTokens()){
                      x.addElement(linea.nextToken());
                  }                       
                    int id_u =Integer.parseInt(x.elementAt(0).toString());
                    ruta.setId_Ruta(id_u);
                    ruta.setNombre_Ruta(x.elementAt(1).toString());
                    ruta.setOrigen_Ruta(x.elementAt(2).toString());
                    ruta.setDestino_Ruta(x.elementAt(3).toString());
                    ruta.setCosto_Ruta(x.elementAt(4).toString());
                    ruta.setHora_Ruta(x.elementAt(5).toString());
                    ruta.setFecha_Ruta(x.elementAt(6).toString());

                    metodos.EditaRutas(ruta);
                    i++;
             }//fin de ciclo While
             //Eliminar archivo original
             boolean resultaElimina=validacion.eliminarArchivoOriginal("C:\\ArchivosTexto\\Rutas.txt");
             if(resultaElimina){
                 //Renombrar archivo temporal
                 boolean resultadoRenombrar=validacion.renombrarArchivoTmp("C:\\ArchivosTexto\\Rutas.txt","C:\\ArchivosTexto\\rutasTMP.txt");
                 if (!resultadoRenombrar){
                     JOptionPane.showMessageDialog(rootPane, "Error al renombrar archivo Temporal!");
                     return;                       
                 }
             }else{
                 JOptionPane.showMessageDialog(rootPane, "Error al eliminar archivo Original!");
                 return;
             }
             table_rutas.setModel(metodos.listaRutas());   
             JOptionPane.showMessageDialog(rootPane, "Registro eliminado Satisfactoriamente");                   
         }//fin de eliminar Registro    
    }    
    
    
    private void btn_r_actializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_actializarActionPerformed
       // Carga los datos del archivo de texto con la base de datos de Rutas
       //Validar que exista campo id usuario a Buscar
        editarRegistro=false;
        boolean buscaPorID=false;
        boolean buscaPorNombre=false;
        boolean validaCampoID=validacion.esVacio(txt_r_id1.getText());
        if (validaCampoID==false) {
            validaCampoID=validacion.esVacio(txt_r_nombre1.getText());
            if (validaCampoID==false){
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar ID válido o nombre de Ruta a buscar");
                txt_r_id1.requestFocus();
                return;
            }    
            else{
                buscaPorNombre=true;
            }
        }    
        else{
            buscaPorID=true;               
        }
        //Incorporar código para búsqueda de Id de Rutas por Id o Nombre antes de Edicion de datos
        if (buscaPorID) {
            Vector v = new Vector();       
            String idRuta = txt_r_id1.getText();
            v = metodos.BuscarRuta(idRuta,1);
            if (!v.isEmpty()){
                txt_r_id.setText((String) v.elementAt(0));
                txt_r_nombre.setText((String) v.elementAt(1));
                txt_r_costo.setText((String) v.elementAt(4));
                txt_r_origen.setText((String) v.elementAt(2));       
                txt_r_destino.setText((String) v.elementAt(3));
                txt_r_fecha.setText((String) v.elementAt(6));
                txt_r_hora.setText((String) v.elementAt(5));
                editarRegistro=true;
            }else{
               JOptionPane.showMessageDialog(rootPane, "No se encuentra el Id a buscar");
                txt_r_id1.requestFocus();
            }          
        } //Fin de búsqueda por ID
        if (buscaPorNombre){
            Vector vRuta = new Vector();       
            String nombreRuta = txt_r_nombre1.getText();
            vRuta = metodos.BuscarRuta(nombreRuta,2);
            if (!vRuta.isEmpty()){
                txt_r_id.setText((String) vRuta.elementAt(0));
                txt_r_nombre.setText((String) vRuta.elementAt(1));
                txt_r_costo.setText((String) vRuta.elementAt(4));
                txt_r_origen.setText((String) vRuta.elementAt(2));       
                txt_r_destino.setText((String) vRuta.elementAt(3));
                txt_r_fecha.setText((String) vRuta.elementAt(6));
                txt_r_hora.setText((String) vRuta.elementAt(5));
                editarRegistro=true;
            }else{
               JOptionPane.showMessageDialog(rootPane, "No se encuentra el nombre deRuta a buscar");
                txt_r_nombre1.requestFocus();
            }                 
         }//fin de búsqueda por Nombre
        //table_rutas.setModel(metodos.listaRutas());
    }//GEN-LAST:event_btn_r_actializarActionPerformed

    //Validación de ingreso de datos numéricos en el campo ID
    private void txt_r_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_r_idKeyTyped
        char ingreso=evt.getKeyChar();
        if (!Character.isDigit(ingreso)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
    }//GEN-LAST:event_txt_r_idKeyTyped

    private void txt_r_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_r_nombreKeyTyped
        char ingreso=evt.getKeyChar();
        if (!Character.isLetterOrDigit(ingreso)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar letras o números");
        }
    }//GEN-LAST:event_txt_r_nombreKeyTyped

    private void txt_r_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_r_costoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_r_costoKeyTyped

    private void txt_r_origenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_r_origenKeyTyped
     char ingreso=evt.getKeyChar();
        if (!Character.isLetterOrDigit(ingreso)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar letras o números");
        }        
    }//GEN-LAST:event_txt_r_origenKeyTyped

    private void txt_r_destinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_r_destinoKeyTyped
   char ingreso=evt.getKeyChar();
        if (!Character.isLetterOrDigit(ingreso)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar letras o números");
        }                
    }//GEN-LAST:event_txt_r_destinoKeyTyped
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RegistroRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_r_actializar;
    private javax.swing.JButton btn_r_eliminar;
    private javax.swing.JButton btn_r_guardar;
    private javax.swing.JButton btn_r_nuevo;
    private javax.swing.JButton btn_r_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_rutas;
    private javax.swing.JTextField txt_r_costo;
    private javax.swing.JTextField txt_r_destino;
    private javax.swing.JTextField txt_r_fecha;
    private javax.swing.JTextField txt_r_hora;
    private javax.swing.JTextField txt_r_id;
    private javax.swing.JTextField txt_r_id1;
    private javax.swing.JTextField txt_r_nombre;
    private javax.swing.JTextField txt_r_nombre1;
    private javax.swing.JTextField txt_r_origen;
    // End of variables declaration//GEN-END:variables
}
