package Vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import static Vistas.mainMenu.Escritorio;
import static Vistas.mainMenu.mensaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormularioMateriaIF extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();

    List<Materia> ListaMateria = new ArrayList<>();
    MateriaData MD = new MateriaData();
    public FormularioMateriaIF() {
        initComponents();
        armarCabecera();
        RBEstado.setSelected(true);
        listarMateria();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GuardarB = new javax.swing.JButton();
        SalirB = new javax.swing.JButton();
        NombreT = new javax.swing.JTextField();
        AñoT = new javax.swing.JTextField();
        BModificar = new javax.swing.JButton();
        BDeshabilitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMateria = new javax.swing.JTable();
        RBEstado = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulario de Materias");
        setMaximumSize(new java.awt.Dimension(558, 452));
        setMinimumSize(new java.awt.Dimension(558, 452));
        setPreferredSize(new java.awt.Dimension(558, 452));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Año:");

        GuardarB.setBackground(new java.awt.Color(0, 153, 102));
        GuardarB.setText("Guardar");
        GuardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBActionPerformed(evt);
            }
        });

        SalirB.setBackground(new java.awt.Color(0, 153, 102));
        SalirB.setText("Salir");
        SalirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBActionPerformed(evt);
            }
        });

        NombreT.setBackground(new java.awt.Color(255, 255, 255));

        AñoT.setBackground(new java.awt.Color(255, 255, 255));

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        BDeshabilitar.setText("Deshabilitar");
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

        RBEstado.setText("Estado ");
        RBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AñoT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(GuardarB)
                        .addGap(34, 34, 34)
                        .addComponent(BModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SalirB)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BDeshabilitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RBEstado)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AñoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarB)
                    .addComponent(SalirB)
                    .addComponent(BModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BDeshabilitar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RBEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirBActionPerformed

    private void GuardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBActionPerformed
        // Boton de guardar materia
        try{
            String nombre = NombreT.getText();
            int anio = Integer.parseInt(AñoT.getText());
            boolean estado = true;
            Materia materia = new Materia(nombre,anio,estado);
            MateriaData md = new MateriaData();
            md.guardarMateria(materia);
        } catch (NumberFormatException ex) {
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario."+ex.getMessage());
        } catch(NullPointerException ex){
            mensaje("Hay campos vacíos o valores mal ingresados, revisar el formulario."+ex.getMessage());
        }
       
    }//GEN-LAST:event_GuardarBActionPerformed

    private void RBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBEstadoActionPerformed
        listarMateria();
    }//GEN-LAST:event_RBEstadoActionPerformed

    private void BDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeshabilitarActionPerformed
        try {
            int fila = TablaMateria.getSelectedRow();
            MD.eliminarMateria(fila);
            listarMateria();
        } catch(ArrayIndexOutOfBoundsException ex){
             mensaje("Primero debe seleccionar una materia de la tabla. "+ex.getMessage());
         }
         
    }//GEN-LAST:event_BDeshabilitarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        try{
            
            int fila = TablaMateria.getSelectedRow();
            if (fila != -1) {
                String nombre =(String)TablaMateria.getValueAt(fila, 0);
                Integer nivelObj= (Integer)TablaMateria.getValueAt(fila, 0);

            int nivel =(nivelObj !=null) ? nivelObj.intValue() : 0;
                NombreT.setText(nombre);
                AñoT.setText(String.valueOf(nivel));
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            mensaje("Debe seleccionar una materia");
        }
    }//GEN-LAST:event_BModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AñoT;
    private javax.swing.JButton BDeshabilitar;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton GuardarB;
    private javax.swing.JTextField NombreT;
    private javax.swing.JRadioButton RBEstado;
    private javax.swing.JButton SalirB;
    private javax.swing.JTable TablaMateria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
  public void listarMateria(){
      borrarFilas();
      String est;
        if (RBEstado.isSelected()) {
            ListaMateria = MD.listarMaterias(1);
            est = "Activa";
        } else {
            ListaMateria = MD.listarMaterias(0);
            est = "Inactiva";
        }
      for (Materia mate : ListaMateria) {
          modelo.addRow(new Object[]{mate.getNombre(),mate.getAnio(),est});
      }
  }  
  private void borrarFilas(){
        int f =TablaMateria.getRowCount() -1;
        for (; f >=0; f--) {
        modelo.removeRow(f);
     }
 }  
 public void armarCabecera(){
        modelo.addColumn("Nombre");
        modelo.addColumn("Nivel");
        modelo.addColumn("Estado");
        TablaMateria.setModel(modelo);
}




}
