package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AlumnosPorMateriaIF extends javax.swing.JInternalFrame {

    private AlumnoData aluD;
    private MateriaData matD;
    private InscripcionData insD;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    public AlumnosPorMateriaIF(AlumnoData aluD, MateriaData matD, InscripcionData insD) {
        this.aluD = aluD;
        this.matD = matD;
        this.insD = insD;
        initComponents();
        armarCabecera();
        llenarComboBox();
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MateriasJCB = new javax.swing.JComboBox<>();
        SalirB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlumnosTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de Alumnos por Materia");
        setMaximumSize(new java.awt.Dimension(558, 452));
        setMinimumSize(new java.awt.Dimension(558, 452));
        setPreferredSize(new java.awt.Dimension(558, 452));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione una Materia:");

        MateriasJCB.setBackground(new java.awt.Color(255, 255, 255));
        MateriasJCB.setForeground(new java.awt.Color(0, 0, 0));
        MateriasJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasJCBActionPerformed(evt);
            }
        });

        SalirB.setBackground(new java.awt.Color(0, 153, 102));
        SalirB.setText("Salir");
        SalirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBActionPerformed(evt);
            }
        });

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
        ));
        jScrollPane1.setViewportView(AlumnosTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SalirB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(MateriasJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MateriasJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(SalirB)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirBActionPerformed

    private void MateriasJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasJCBActionPerformed
        // Seleccion en el comboBox
        llenarTabla();
    }//GEN-LAST:event_MateriasJCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AlumnosTabla;
    private javax.swing.JComboBox<Materia> MateriasJCB;
    private javax.swing.JButton SalirB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de nacimiento");
        modelo.addColumn("Nota");
        AlumnosTabla.setModel(modelo);
         
    }
    
     private void borrarFilas() {
        int f = AlumnosTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    private void llenarComboBox(){
        List<Materia> materias = new ArrayList<>();
        materias = matD.listarMaterias(1);
        
        for (Materia materia : materias) {
            MateriasJCB.addItem(materia);
        }
    }
    
    public void llenarTabla(){
        borrarFilas();
        
        List<Inscripcion> listaInscriptos = new ArrayList<>();
        Materia mat = (Materia) MateriasJCB.getSelectedItem();
        int id = mat.getIdMateria();
        listaInscriptos = insD.obtenerAlumnosInscriptosPorMateria(id);
        
        for (Inscripcion inscripto : listaInscriptos) {
            modelo.addRow(new Object[]{inscripto.getIdAlumno().getIdAlumno(),inscripto.getIdAlumno().getDni(),
                                       inscripto.getIdAlumno().getApellido(),inscripto.getIdAlumno().getNombre(),
                                       inscripto.getIdAlumno().getFechaNacimiento(),inscripto.getNota()});
        }
    }

}
