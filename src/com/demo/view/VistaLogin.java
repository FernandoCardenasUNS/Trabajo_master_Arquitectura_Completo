/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.view;

import com.demo.controller.ControllerLogin;
import com.demo.controller.Controller_Metodos;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author whiston
 */
public class VistaLogin extends javax.swing.JFrame {

    ControllerLogin cLogin;
    
    /**
     * Creates new form VistaLogin
     */
    public VistaLogin() {
        initComponents();
        cLogin = new ControllerLogin();
        setLocationRelativeTo(null);
    }
    Controller_Metodos metodo = new Controller_Metodos();
    String barra=File.separator;
    String ubicacion=System.getProperty("user.dir")+barra+"Registros"+barra;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        con = new javax.swing.JTextField();
        jBtnLogin = new javax.swing.JButton();
        jBtnLogup = new javax.swing.JButton();
        jBtnRecuperar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel1.setText("DEMO LOGIN");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel2.setText("USUARIO:");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel3.setText("CLAVE:");

        usu.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        con.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        jBtnLogin.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jBtnLogin.setText("Log In");
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });

        jBtnLogup.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jBtnLogup.setText("Log Up");
        jBtnLogup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogupActionPerformed(evt);
            }
        });

        jBtnRecuperar.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jBtnRecuperar.setText("Recuperar clave");
        jBtnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecuperarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usu, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(con)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jBtnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLogup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnRecuperar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLogin)
                    .addComponent(jBtnLogup)
                    .addComponent(jBtnRecuperar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        // TODO add your handling code here:
        String busqueda_usuario = metodo.buscarUsuarioRegistrado(usu.getText(), con.getText());
        if (usu.getText().equals("root") && con.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Iniciaste como administrador");
            Acceso ventana = new Acceso();
            ventana.acc.setText("Administrador");
            ventana.setVisible(true);
            this.dispose();
        }else if(busqueda_usuario.equals("Usuario encontrado")){
            String busqueda_nombre= metodo.buscarNombre(usu.getText());
            JOptionPane.showMessageDialog(null,"Bienvenido(a) \n" + busqueda_nombre);
            Acceso ventana = new Acceso();
            ventana.setVisible(true);
            ventana.acc.setText(busqueda_nombre);
            this.dispose();         
        }
        
    }//GEN-LAST:event_jBtnLoginActionPerformed

    private void jBtnLogupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogupActionPerformed
        Log_Up lu= new Log_Up();
        lu.setVisible(true);
        lu.setLocationRelativeTo(null);  
        this.dispose();
    }//GEN-LAST:event_jBtnLogupActionPerformed

    private void jBtnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecuperarActionPerformed
        Recuperar_Clave vl= new Recuperar_Clave();
        vl.setVisible(true);
        vl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBtnRecuperarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField con;
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JButton jBtnLogup;
    private javax.swing.JButton jBtnRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}
