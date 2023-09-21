package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
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
        SalirB = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listado de Materias");

        MatInscriptasB.setBackground(new java.awt.Color(0, 153, 102));
        EstadoMateria.add(MatInscriptasB);
        MatInscriptasB.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Materias no Inscriptas");

        MatNoInscriptasB.setBackground(new java.awt.Color(0, 153, 102));
        EstadoMateria.add(MatNoInscriptasB);
        MatNoInscriptasB.setForeground(new java.awt.Color(0, 0, 0));

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

        InscribirB.setBackground(new java.awt.Color(0, 153, 102));
        InscribirB.setText("Inscribir");

        SalirB.setBackground(new java.awt.Color(0, 153, 102));
        SalirB.setText("Salir");
        SalirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2))
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(InscribirB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnularInscB)
                                .addGap(90, 90, 90)
                                .addComponent(SalirB))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alumnosJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
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
                    .addComponent(SalirB)
                    .addComponent(AnularInscB)
                    .addComponent(InscribirB))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnularInscB;
    private javax.swing.ButtonGroup EstadoMateria;
    private javax.swing.JButton InscribirB;
    private javax.swing.JRadioButton MatInscriptasB;
    private javax.swing.JRadioButton MatNoInscriptasB;
    private javax.swing.JTable MateriasTabla;
    private javax.swing.JButton SalirB;
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
         listaMat = insD.obtenerInscripcionesPorAlumno(selec);
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

