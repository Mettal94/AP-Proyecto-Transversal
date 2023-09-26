package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ManejoInscripcionIF extends javax.swing.JInternalFrame {

    private AlumnoData aluD;
    private MateriaData matD;
    private InscripcionData insD;
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    public ManejoInscripcionIF(AlumnoData aluD, MateriaData matD, InscripcionData insD) {
        this.aluD = aluD;
        this.matD = matD;
        this.insD = insD;
        initComponents();
        armarCabecera();
        cargarComboBox();
        MatInscriptasB.setSelected(true);
        InscribirB.setEnabled(false);
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EstadoMateria = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        alumnosJCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MatInscriptasB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        MatNoInscriptasB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MateriasTabla = new javax.swing.JTable();
        AnularInscB = new javax.swing.JButton();
        InscribirB = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulario de Inscripcion");
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listado de Materias");

        MatInscriptasB.setBackground(new java.awt.Color(0, 153, 102));
        EstadoMateria.add(MatInscriptasB);
        MatInscriptasB.setForeground(new java.awt.Color(0, 0, 0));
        MatInscriptasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatInscriptasBActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Materias no Inscriptas");

        MatNoInscriptasB.setBackground(new java.awt.Color(0, 153, 102));
        EstadoMateria.add(MatNoInscriptasB);
        MatNoInscriptasB.setForeground(new java.awt.Color(0, 0, 0));
        MatNoInscriptasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatNoInscriptasBActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Materias Inscriptas");

        MateriasTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(MateriasTabla);

        AnularInscB.setBackground(new java.awt.Color(0, 153, 102));
        AnularInscB.setText("Anular Inscripcion");
        AnularInscB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnularInscBActionPerformed(evt);
            }
        });

        InscribirB.setBackground(new java.awt.Color(0, 153, 102));
        InscribirB.setText("Inscribir");
        InscribirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MatInscriptasB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(65, 65, 65)
                                .addComponent(MatNoInscriptasB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(alumnosJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InscribirB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnularInscB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alumnosJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(MatNoInscriptasB, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(MatInscriptasB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnularInscB)
                    .addComponent(InscribirB))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatInscriptasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatInscriptasBActionPerformed
        // Boton de materias inscriptas
        InscribirB.setEnabled(false);
        AnularInscB.setEnabled(true);
        llenarTabla();
    }//GEN-LAST:event_MatInscriptasBActionPerformed

    private void MatNoInscriptasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatNoInscriptasBActionPerformed
        // Boton de materias no inscriptas
        AnularInscB.setEnabled(false);
        InscribirB.setEnabled(true);
        llenarTabla();
    }//GEN-LAST:event_MatNoInscriptasBActionPerformed

    private void alumnosJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosJCBActionPerformed
        // Seleccion del comboBox
        llenarTabla();
    }//GEN-LAST:event_alumnosJCBActionPerformed

    private void InscribirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirBActionPerformed
        // Boton para inscribir un alumno a una materia
        try{
            Alumno alumno = (Alumno) alumnosJCB.getSelectedItem();

            int seleccion = MateriasTabla.getSelectedRow();
            int id = (int) MateriasTabla.getValueAt(seleccion, 0);
            String nombre = (String) MateriasTabla.getValueAt(seleccion, 1);
            int anio = (int) MateriasTabla.getValueAt(seleccion, 2);
            Boolean estado = true;
            Materia materia = new Materia(id,nombre,anio,estado);

            double nota = 0;

            Inscripcion insc = new Inscripcion(alumno,materia,nota);

            insD.guardarInscripcion(insc);

            llenarTabla();
        }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Se debe seleccionar una materia");
        }        
    }//GEN-LAST:event_InscribirBActionPerformed

    private void AnularInscBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnularInscBActionPerformed
        // Boton para desinscribir un alumno
        try{
            Alumno alumno = (Alumno) alumnosJCB.getSelectedItem();
            int idAlu = alumno.getIdAlumno();

            int fila = (int) MateriasTabla.getSelectedRow();
            int idMat = (int) MateriasTabla.getValueAt(fila, 0);

            insD.anularInscripcion(idMat, idAlu);

            llenarTabla();
        }catch(ArrayIndexOutOfBoundsException ex){
            mensaje("Se debe seleccionar una materia");
        }    
    }//GEN-LAST:event_AnularInscBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnularInscB;
    private javax.swing.ButtonGroup EstadoMateria;
    private javax.swing.JButton InscribirB;
    private javax.swing.JRadioButton MatInscriptasB;
    private javax.swing.JRadioButton MatNoInscriptasB;
    private javax.swing.JTable MateriasTabla;
    private javax.swing.JComboBox<Alumno> alumnosJCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
        MateriasTabla.setModel(modelo);
    }
    
    private void llenarTabla(){
        borrarFilas();
        Alumno alumno = (Alumno) alumnosJCB.getSelectedItem();
        int selec = alumno.getIdAlumno();
        
        List<Materia>listaMat = new ArrayList<>();
        
        if(MatInscriptasB.isSelected()){
         listaMat = insD.obtenerMateriasCursadas(selec);
        }else if (MatNoInscriptasB.isSelected()){
            listaMat=insD.obtenerMateriasNOCursadas(selec);
        }
        Collections.sort(listaMat);
         for (Materia materia : listaMat) {
            modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnio()});
        }
    }
    
    private void borrarFilas() {
        int f = MateriasTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}

