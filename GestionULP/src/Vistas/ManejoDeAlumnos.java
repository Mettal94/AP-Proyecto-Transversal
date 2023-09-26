/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import static Vistas.mainMenu.Escritorio;
import static Vistas.mainMenu.mensaje;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ManejoDeAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData aluD;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    List<Alumno> lista = new ArrayList<>();

    public ManejoDeAlumnos(AlumnoData aluD) {
        this.aluD = aluD;
        initComponents();
        armarCabecera();
        ActivosRB.setSelected(true);
        listar();
        //Con las últimas dos líneas, cuando se abra la ventana, se llenará la tabla con los alumnos activos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlumnosTabla = new javax.swing.JTable();
        ModificarB = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ActivosRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        InactivosRB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        BusquedaT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BuscarB = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manejo de Alumnos");
        setMaximumSize(new java.awt.Dimension(558, 452));
        setMinimumSize(new java.awt.Dimension(558, 452));
        setPreferredSize(new java.awt.Dimension(558, 452));

        AlumnosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AlumnosTabla);
        if (AlumnosTabla.getColumnModel().getColumnCount() > 0) {
            AlumnosTabla.getColumnModel().getColumn(0).setResizable(false);
            AlumnosTabla.getColumnModel().getColumn(1).setResizable(false);
            AlumnosTabla.getColumnModel().getColumn(2).setResizable(false);
            AlumnosTabla.getColumnModel().getColumn(3).setResizable(false);
        }

        ModificarB.setText("Modificar");
        ModificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBActionPerformed(evt);
            }
        });

        Eliminar.setText("Cambiar Estado");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mostrar :");

        grupoEstado.add(ActivosRB);
        ActivosRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivosRBActionPerformed(evt);
            }
        });

        jLabel2.setText("Activos");

        grupoEstado.add(InactivosRB);
        InactivosRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivosRBActionPerformed(evt);
            }
        });

        jLabel3.setText("Inactivos");

        jLabel4.setText("Buscar por DNI :");

        BuscarB.setText("Buscar");
        BuscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ModificarB)
                        .addGap(31, 31, 31)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActivosRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InactivosRB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BusquedaT, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarB)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BusquedaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModificarB)
                        .addComponent(Eliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(InactivosRB, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(ActivosRB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActivosRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivosRBActionPerformed
        // Mostrar alumnos activos (se muestran por defecto al abrir la ventana)
        listar();
    }//GEN-LAST:event_ActivosRBActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // Botón de eliminar alumno
         try{
            int fila = AlumnosTabla.getSelectedRow();
            int id = (int) AlumnosTabla.getValueAt(fila, 0);
            
            if(ActivosRB.isSelected()){
                aluD.eliminarAlumno(id);
            }else if(InactivosRB.isSelected()){
                aluD.reactivarAlumno(id);
            }
            listar();
         }catch(ArrayIndexOutOfBoundsException ex){
             mensaje("Primero debe seleccionar un alumno de la tabla. "+ex.getMessage());
         }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBActionPerformed
        //Boton para modificar un alumno
        try{
            int seleccionado = AlumnosTabla.getSelectedRow();
            int id = (int) AlumnosTabla.getValueAt(seleccionado, 0);
            int dni = (int) AlumnosTabla.getValueAt(seleccionado, 1);
            String apellido = (String) AlumnosTabla.getValueAt(seleccionado, 2);
            String nombre = (String) AlumnosTabla.getValueAt(seleccionado, 3);
            LocalDate fechaNac = LocalDate.parse(AlumnosTabla.getValueAt(seleccionado, 4).toString()) ;
            Boolean estado = true;
            if(ActivosRB.isSelected()){
                estado = true;
            }else if(InactivosRB.isSelected()){
                estado = false;
            }
            Alumno alumno = new Alumno(id,dni,apellido,nombre,fechaNac,estado);

            Escritorio.removeAll();
            Escritorio.repaint();
            ModificarAlumnoIF edicion = new ModificarAlumnoIF(aluD,alumno);
            edicion.setVisible(true);
            Escritorio.add(edicion);
            Escritorio.moveToFront(edicion);
        }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Debe seleccionar un alumno de la tabla primero. "+ex.getMessage());
        }
    }//GEN-LAST:event_ModificarBActionPerformed

    private void InactivosRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivosRBActionPerformed
        // Boton para mostrar los inactivos
        ActivosRB.setSelected(false);
        listar();
    }//GEN-LAST:event_InactivosRBActionPerformed

    private void BuscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBActionPerformed
        // Boton para buscar alumno
        try{
            if(BusquedaT.getText().isEmpty()){
                listar();
            }
            int dni = Integer.parseInt(BusquedaT.getText());
            borrarFilas();
            Alumno buscado;
            if(ActivosRB.isSelected()){
              buscado = aluD.buscarAlumnoPorDni(dni, 1);
               modelo.addRow(new Object[]{buscado.getIdAlumno(),buscado.getDni(),buscado.getApellido(),buscado.getNombre(),buscado.getFechaNacimiento().toString()});
             }else if(InactivosRB.isSelected()){
                 buscado = aluD.buscarAlumnoPorDni(dni, 0);
               modelo.addRow(new Object[]{buscado.getIdAlumno(),buscado.getDni(),buscado.getApellido(),buscado.getNombre(),buscado.getFechaNacimiento().toString()});
             }
            BusquedaT.setText("");
        }catch(NumberFormatException ex){
          //  mensaje("Debe ingresar caracteres válidos");
        }catch(NullPointerException ex){
            //listar();
        }   
    }//GEN-LAST:event_BuscarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ActivosRB;
    public static javax.swing.JTable AlumnosTabla;
    private javax.swing.JButton BuscarB;
    private javax.swing.JTextField BusquedaT;
    private javax.swing.JButton Eliminar;
    private javax.swing.JRadioButton InactivosRB;
    private javax.swing.JButton ModificarB;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
  
    public void listar() {
        //Método para rellenar la tabla
        borrarFilas();
        if (ActivosRB.isSelected()) {
            lista = aluD.listarAlumno(1);
        } else if(InactivosRB.isSelected()){
            lista = aluD.listarAlumno(0);
        }
        for (Alumno alumno : lista) {
            modelo.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(),
                                      alumno.getNombre(), alumno.getFechaNacimiento().toString()});
        }
    }

    private void borrarFilas() {
        int f = AlumnosTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de nacimiento");
        AlumnosTabla.setModel(modelo);
    }

}
