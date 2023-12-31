package Vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import static Vistas.mainMenu.Escritorio;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ManejoDeMateriasIF extends javax.swing.JInternalFrame {
    private MateriaData matD;
    private DefaultTableModel modelo = new DefaultTableModel();


    List<Materia> ListaMateria = new ArrayList<>();
    
    public ManejoDeMateriasIF(MateriaData matD) {
        this.matD =matD;
        initComponents();
        armarCabecera();
        activoRB.setSelected(true);
        listar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GuardarB = new javax.swing.JButton();
        NombreT = new javax.swing.JTextField();
        AñoT = new javax.swing.JTextField();
        BModificar = new javax.swing.JButton();
        BDeshabilitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMateria = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        activoRB = new javax.swing.JRadioButton();
        inactivoRB = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manejo De Materias");
        setMaximumSize(new java.awt.Dimension(558, 452));
        setMinimumSize(new java.awt.Dimension(558, 452));
        setPreferredSize(new java.awt.Dimension(558, 452));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Año:");

        GuardarB.setBackground(new java.awt.Color(0, 153, 102));
        GuardarB.setText("Guardar");
        GuardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        BDeshabilitar.setText("Cambiar Estado");
        BDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeshabilitarActionPerformed(evt);
            }
        });

        TablaMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaMateria);

        jLabel7.setText("Activos");

        jLabel8.setText("Inactivos");

        jLabel9.setText("Mostrar :");

        buttonGroup1.add(activoRB);
        activoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(inactivoRB);
        inactivoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivoRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AñoT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(GuardarB))
                            .addComponent(NombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BDeshabilitar)
                .addGap(18, 18, 18)
                .addComponent(BModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activoRB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inactivoRB, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AñoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BDeshabilitar)
                            .addComponent(BModificar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(inactivoRB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(activoRB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))))
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBActionPerformed
        // Boton de guardar materia
        try{
            String nombre = NombreT.getText();
            int anio = Integer.parseInt(AñoT.getText());
            boolean estado = true;
            Materia materia = new Materia(nombre,anio,estado);
            MateriaData md = new MateriaData();
            md.guardarMateria(materia);
            
            listar();
            NombreT.setText("");
            AñoT.setText("");
        } catch (NumberFormatException ex) {
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario."+ex.getMessage());
        } catch(NullPointerException ex){
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario."+ex.getMessage());
        }
       
    }//GEN-LAST:event_GuardarBActionPerformed

    private void BDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeshabilitarActionPerformed
        try {
            int fila = TablaMateria.getSelectedRow();
            int id = (int) TablaMateria.getValueAt(fila, 0);
            if(activoRB.isSelected()){
                matD.eliminarMateria(id);
            }else if(inactivoRB.isSelected()){
                matD.reactivarMateria(id);
            }
            listar();
        } catch(ArrayIndexOutOfBoundsException ex){
             mensaje("Debe seleccionar una materia de la tabla."+ ERROR);
         }
         
    }//GEN-LAST:event_BDeshabilitarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
            try{    
                int fila = TablaMateria.getSelectedRow();
                int id =(int)TablaMateria.getValueAt(fila, 0);
                String nom = (String) TablaMateria.getValueAt(fila, 1);
                int anio = (int)TablaMateria.getValueAt(fila, 2);
                boolean estado = true;
                if(inactivoRB.isSelected()){
                    estado = false;
                }
                Materia modificar = new Materia(id,nom,anio,estado);
                Escritorio.removeAll();
                Escritorio.repaint();
                ModificarMateriaIF edicion = new ModificarMateriaIF(matD,modificar);
                edicion.setVisible(true);
                Escritorio.add(edicion);
                Escritorio.moveToFront(edicion);
            }catch(NullPointerException ex){
                mensaje("Debe seleccionar una meteria de la tabla.");
            }
    }//GEN-LAST:event_BModificarActionPerformed

    private void activoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoRBActionPerformed

        listar();
    }//GEN-LAST:event_activoRBActionPerformed

    private void inactivoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivoRBActionPerformed

        listar();
    }//GEN-LAST:event_inactivoRBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AñoT;
    private javax.swing.JButton BDeshabilitar;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton GuardarB;
    private javax.swing.JTextField NombreT;
    private javax.swing.JTable TablaMateria;
    private javax.swing.JRadioButton activoRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton inactivoRB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

      public void listar() {
        //Método para rellenar la tabla
        borrarFilas();
        if (activoRB.isSelected()) {
            ListaMateria = matD.listarMaterias(1);
        } else if(inactivoRB.isSelected()){
            ListaMateria = matD.listarMaterias(0);
        }
        Collections.sort(ListaMateria);
        for (Materia mate : ListaMateria) {
          modelo.addRow(new Object[]{mate.getIdMateria(),mate.getNombre(),mate.getAnio()});
      }
    }
  private void borrarFilas(){
        int f =TablaMateria.getRowCount() -1;
        for (; f >=0; f--) {
        modelo.removeRow(f);
     }
 }  
 public void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        
        TablaMateria.setModel(modelo);
}




}
