package Vistas;

import AccesoADatos.Conexion;
import javax.swing.JOptionPane;

public class mainMenu extends javax.swing.JFrame {

    
    public mainMenu() {
        initComponents();
        Conexion.getConexion();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        FormularioAlumnpoJM = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FormularioMateriaJM = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ManejoInscripcionJM = new javax.swing.JMenuItem();
        ManejoAlumnosJM = new javax.swing.JMenuItem();
        ManipulacionNotasJM = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AlumnosPorMateriasJM = new javax.swing.JMenuItem();
        SalirJM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        FormularioAlumnpoJM.setText("Formulario de Alumno");
        FormularioAlumnpoJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioAlumnpoJMActionPerformed(evt);
            }
        });
        jMenu1.add(FormularioAlumnpoJM);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        FormularioMateriaJM.setText("Formulario de Materia");
        FormularioMateriaJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioMateriaJMActionPerformed(evt);
            }
        });
        jMenu2.add(FormularioMateriaJM);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        ManejoInscripcionJM.setText("Manejo de Inscripciones");
        ManejoInscripcionJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManejoInscripcionJMActionPerformed(evt);
            }
        });
        jMenu3.add(ManejoInscripcionJM);

        ManejoAlumnosJM.setText("Manejo de Alumos");
        ManejoAlumnosJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManejoAlumnosJMActionPerformed(evt);
            }
        });
        jMenu3.add(ManejoAlumnosJM);

        ManipulacionNotasJM.setText("Manipulacion de Notas");
        ManipulacionNotasJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManipulacionNotasJMActionPerformed(evt);
            }
        });
        jMenu3.add(ManipulacionNotasJM);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        AlumnosPorMateriasJM.setText("Alumnos por Materia");
        AlumnosPorMateriasJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosPorMateriasJMActionPerformed(evt);
            }
        });
        jMenu4.add(AlumnosPorMateriasJM);

        jMenuBar1.add(jMenu4);

        SalirJM.setText("Salir");
        SalirJM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirJMMouseClicked(evt);
            }
        });
        jMenuBar1.add(SalirJM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormularioAlumnpoJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioAlumnpoJMActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioAlumnoIF faif = new FormularioAlumnoIF();
        faif.setVisible(true);
        Escritorio.add(faif);
        Escritorio.moveToFront(faif);
    }//GEN-LAST:event_FormularioAlumnpoJMActionPerformed

    private void SalirJMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirJMMouseClicked
        this.dispose();
    }//GEN-LAST:event_SalirJMMouseClicked

    private void FormularioMateriaJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioMateriaJMActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioMateriaIF fmif = new FormularioMateriaIF();
        fmif.setVisible(true);
        Escritorio.add(fmif);
        Escritorio.moveToFront(fmif);
    }//GEN-LAST:event_FormularioMateriaJMActionPerformed

    private void ManejoInscripcionJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManejoInscripcionJMActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ManejoInscripcionIF miif = new ManejoInscripcionIF();
        miif.setVisible(true);
        Escritorio.add(miif);
        Escritorio.moveToFront(miif);
    }//GEN-LAST:event_ManejoInscripcionJMActionPerformed

    private void ManipulacionNotasJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManipulacionNotasJMActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ManipulacionNotasIF noif = new ManipulacionNotasIF();
        noif.setVisible(true);
        Escritorio.add(noif);
        Escritorio.moveToFront(noif);
    }//GEN-LAST:event_ManipulacionNotasJMActionPerformed

    private void AlumnosPorMateriasJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosPorMateriasJMActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AlumnosPorMateriaIF apmif = new AlumnosPorMateriaIF();
        apmif.setVisible(true);
        Escritorio.add(apmif);
        Escritorio.moveToFront(apmif);
    }//GEN-LAST:event_AlumnosPorMateriasJMActionPerformed

    private void ManejoAlumnosJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManejoAlumnosJMActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ManejoDeAlumnos mdaif = new ManejoDeAlumnos();
        mdaif.setVisible(true);
        Escritorio.add(mdaif);
        Escritorio.moveToFront(mdaif);
    }//GEN-LAST:event_ManejoAlumnosJMActionPerformed

    
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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumnosPorMateriasJM;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem FormularioAlumnpoJM;
    private javax.swing.JMenuItem FormularioMateriaJM;
    private javax.swing.JMenuItem ManejoAlumnosJM;
    private javax.swing.JMenuItem ManejoInscripcionJM;
    private javax.swing.JMenuItem ManipulacionNotasJM;
    private javax.swing.JMenu SalirJM;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
