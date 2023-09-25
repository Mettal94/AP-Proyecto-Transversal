package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManipulacionNotasIF extends javax.swing.JInternalFrame {

    private AlumnoData aluD;
    private MateriaData matD;
    private InscripcionData insD;
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public ManipulacionNotasIF(AlumnoData aluD, MateriaData matD, InscripcionData insD) {
        this.aluD = aluD;
        this.matD = matD;
        this.insD = insD;
        initComponents();
        armarCabecera();
        cargarComboBox();
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        alumnosJCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotasTabla = new javax.swing.JTable();
        CalificarB = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Carga de Datos");
        setMaximumSize(new java.awt.Dimension(558, 452));
        setMinimumSize(new java.awt.Dimension(558, 452));
        setPreferredSize(new java.awt.Dimension(558, 452));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione un Alumno:");

        alumnosJCB.setBackground(new java.awt.Color(255, 255, 255));
        alumnosJCB.setForeground(new java.awt.Color(0, 0, 0));
        alumnosJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosJCBActionPerformed(evt);
            }
        });

        NotasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(NotasTabla);

        CalificarB.setText("Editar nota");
        CalificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalificarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(alumnosJCB, 0, 265, Short.MAX_VALUE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CalificarB)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alumnosJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CalificarB)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alumnosJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosJCBActionPerformed
        // Seleccion en el comboBox
        llenarTabla();
     
    }//GEN-LAST:event_alumnosJCBActionPerformed

    private void CalificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalificarBActionPerformed
        // Boton para calificar
        try{
            Alumno alumno = (Alumno)alumnosJCB.getSelectedItem();
            int idAlu = alumno.getIdAlumno();
            int fila = NotasTabla.getSelectedRow();
            int idMat =(int) NotasTabla.getValueAt(fila, 0);
            //int nota = (int) NotasTabla.getValueAt(fila, 3);
            double nota = Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese la nota."));

            insD.cambiarNota(nota, idMat, idAlu);

            llenarTabla();
        }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Debe seleccionar una materia de la tabla. ");
        }catch(NumberFormatException ex){
            mensaje("Debe ingresar una nota correcta. ");
        }catch(NullPointerException ex){
            mensaje("Calificación sin éxito. ");
        }    
    }//GEN-LAST:event_CalificarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalificarB;
    private javax.swing.JTable NotasTabla;
    private javax.swing.JComboBox<Alumno> alumnosJCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    private void cargarComboBox(){
        
        List<Alumno> listaAlu = new ArrayList<>();
        listaAlu = aluD.listarAlumno(1);
        Collections.sort(listaAlu);
        
        for (Alumno alumno : listaAlu) {
            alumnosJCB.addItem(alumno);
        }
    }
    
    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
        NotasTabla.setModel(modelo);
    }
    
    public void llenarTabla(){
        borrarFilas();
        Alumno alumno = (Alumno)alumnosJCB.getSelectedItem();
        int id = alumno.getIdAlumno();
        List<Inscripcion> listaInsc = insD.obtenerInscripciones(id);
        
        for (Inscripcion inscripcion : listaInsc) {
            String sinNota = "Sin calificar";
            Double nota = inscripcion.getNota();
            if(nota>0){
            modelo.addRow(new Object[]{inscripcion.getIdMateria().getIdMateria(),inscripcion.getIdMateria().getNombre(),
                                        inscripcion.getIdMateria().getAnio(),inscripcion.getNota()});
            }else{
                modelo.addRow(new Object[]{inscripcion.getIdMateria().getIdMateria(),inscripcion.getIdMateria().getNombre(),
                                        inscripcion.getIdMateria().getAnio(),sinNota});
            }
        }
    }
    
     private void borrarFilas() {
        int f = NotasTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
