/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.operacionesBd;

import com.unab.edu.sv.DAO.ClsPersona;
import com.unab.edu.sv.DAO.ClsProfesor;
import com.unab.edu.sv.clase0120.Entidades.Profesor;
import com.unab.edu.sv.clase0120.Entidades.personas;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author rafap
 */
public class crudProfesor extends javax.swing.JFrame {

    /**
     * Creates new form crudProfesor
     */
    public crudProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarPersona();
        MostrarPro();
        Limpiar();
    }
    int id = 0;
    String pass="";

    @SuppressWarnings("unchecked")

    void MostrarPersona() {
        String[] Titulos = {"ID", "NOMBRE", "APELLIDO"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        ClsPersona persona = new ClsPersona();
        ArrayList<personas> Person = persona.mostrarPersona();
        String Filas[] = new String[3];
        for (var i : Person) {
            Filas[0] = String.valueOf(i.getIdpersona());
            Filas[1] = String.valueOf(i.getNombre());
            Filas[2] = String.valueOf(i.getApellido());
            modelo.addRow(Filas);

        }
        tb_persona.setModel(modelo);
    }

    void MostrarPro() {
        String Titulos[] = {"IDPROFESOR", "IDPERSONA", "NOMBRE", "DUI", "USUARIO", "PASS"};
        DefaultTableModel Model = new DefaultTableModel(null, Titulos);
        ClsProfesor pr = new ClsProfesor();
        ArrayList<Profesor> pro = pr.MostrarProfesor();
        String filas[] = new String[6];
        for (var i : pro) {
            filas[0] = String.valueOf(i.getIDprofesor());
            filas[1] = String.valueOf(i.getIDpersona());
            filas[2] = String.valueOf(i.getNombre());
            filas[3] = String.valueOf(i.getDUI());
            filas[4] = String.valueOf(i.getUsuario());
            filas[5] = String.valueOf(i.getPass());
            Model.addRow(filas);
        }
        tb_Profesor.setModel(Model);
    }

    void Limpiar() {
        id = 0;
        txtDUI.setText("");
        txtIdpersona.setText("");
        txtPass.setText("");
        txtUsu.setText("");
        pass = "";
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelD = new javax.swing.JTabbedPane();
        jDatos = new javax.swing.JScrollPane();
        tb_Profesor = new javax.swing.JTable();
        jCRUD = new javax.swing.JPanel();
        lblIdpersona = new javax.swing.JLabel();
        txtIdpersona = new javax.swing.JTextField();
        lblDUI = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();
        lblUsu = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_persona = new javax.swing.JTable();
        lblIDPersona1 = new javax.swing.JLabel();
        lblDatosPro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        panelD.setBackground(new java.awt.Color(255, 255, 153));
        panelD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tb_Profesor.setBackground(new java.awt.Color(102, 255, 255));
        tb_Profesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_Profesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ProfesorMouseClicked(evt);
            }
        });
        jDatos.setViewportView(tb_Profesor);

        panelD.addTab("DATOS", jDatos);

        jCRUD.setBackground(new java.awt.Color(153, 255, 255));
        jCRUD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblIdpersona.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdpersona.setText("ID PERSONA");

        txtIdpersona.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdpersona.setEnabled(false);

        lblDUI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDUI.setText("DUI");

        txtDUI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDUIActionPerformed(evt);
            }
        });

        lblUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsu.setText("USUARIO");

        txtUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPass.setText("PASS");

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 51, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 51, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tb_persona.setBackground(new java.awt.Color(153, 255, 153));
        tb_persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tb_persona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_personaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_persona);

        lblIDPersona1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDPersona1.setText("Selecione la persona");

        javax.swing.GroupLayout jCRUDLayout = new javax.swing.GroupLayout(jCRUD);
        jCRUD.setLayout(jCRUDLayout);
        jCRUDLayout.setHorizontalGroup(
            jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCRUDLayout.createSequentialGroup()
                .addGroup(jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCRUDLayout.createSequentialGroup()
                                .addGroup(jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdpersona, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDUI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(4, 4, 4))
                            .addGroup(jCRUDLayout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblIdpersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(113, 113, 113))
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblDUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(133, 133, 133))
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117)))
                .addGap(92, 92, 92)
                .addGroup(jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCRUDLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCRUDLayout.createSequentialGroup()
                        .addComponent(lblIDPersona1)
                        .addGap(113, 113, 113))))
        );
        jCRUDLayout.setVerticalGroup(
            jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCRUDLayout.createSequentialGroup()
                .addGroup(jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addComponent(lblIDPersona1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIdpersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar))
                        .addGap(1, 1, 1)))
                .addGap(16, 16, 16))
        );

        panelD.addTab("CRUD", jCRUD);

        lblDatosPro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDatosPro.setText("DATOS PROFESORES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelD)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(lblDatosPro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDatosPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelD, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDUIActionPerformed

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (id == 0) {
            if (!txtDUI.getText().isEmpty() && !txtIdpersona.getText().isEmpty() && !txtPass.getText().isEmpty() && !txtUsu.getText().isEmpty()) {
                Profesor profe = new Profesor();
                profe.setIDpersona(Integer.parseInt(txtIdpersona.getText()));
                profe.setDUI(txtDUI.getText());
                profe.setUsuario(txtUsu.getText());
                profe.setPass(txtPass.getText());
                ClsProfesor pro = new ClsProfesor();
                pro.Guardar(profe);
                Limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Todos los campos son Obligatorio");
            }

            MostrarPro();
        } else {

            if (!txtDUI.getText().isEmpty() && !txtIdpersona.getText().isEmpty() && !txtPass.getText().isEmpty() && !txtUsu.getText().isEmpty()) {
                if (pass.equals(txtPass.getText())) {
                    Profesor prof = new Profesor();
                    prof.setIDprofesor(id);
                    prof.setIDpersona(Integer.parseInt(txtIdpersona.getText()));
                    prof.setDUI(txtDUI.getText());
                    prof.setUsuario(txtUsu.getText());
                    prof.setPass(txtPass.getText());
                    ClsProfesor pro = new ClsProfesor();
                    pro.Actualizarsc(prof);
                    MostrarPro();
                    Limpiar();
                } else {
                    Profesor profe = new Profesor();
                    profe.setIDprofesor(id);
                    profe.setIDpersona(Integer.parseInt(txtIdpersona.getText()));
                    profe.setDUI(txtDUI.getText());
                    profe.setUsuario(txtUsu.getText());
                    profe.setPass(txtPass.getText());
                    ClsProfesor pro = new ClsProfesor();
                    pro.Actualizar(profe);
                    MostrarPro();
                    Limpiar();
                 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son Obligatorio");

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tb_personaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_personaMouseClicked
        int fila = tb_persona.getSelectedRow();
        txtIdpersona.setText(String.valueOf(tb_persona.getValueAt(fila, 0)));
    }//GEN-LAST:event_tb_personaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (id != 0) {
            Profesor pro = new Profesor();
            pro.setIDprofesor(id);
            ClsProfesor prof = new ClsProfesor();
            prof.Eliminar(pro);
            Limpiar();
            MostrarPro();
        } else {
            JOptionPane.showMessageDialog(null, "Debe de seleccionar un profesor");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tb_ProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ProfesorMouseClicked
        panelD.setSelectedIndex(panelD.indexOfComponent(jCRUD));
        int fila = tb_Profesor.getSelectedRow();
        String ID = String.valueOf(tb_Profesor.getValueAt(fila, 0));
        id = Integer.valueOf(ID);
        txtIdpersona.setText(String.valueOf(tb_Profesor.getValueAt(fila, 1)));
        txtDUI.setText(String.valueOf(tb_Profesor.getValueAt(fila, 3)));
        txtUsu.setText(String.valueOf(tb_Profesor.getValueAt(fila, 4)));
        pass = String.valueOf(tb_Profesor.getValueAt(fila, 5));
        txtPass.setText(String.valueOf(tb_Profesor.getValueAt(fila, 5)));


    }//GEN-LAST:event_tb_ProfesorMouseClicked

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
            java.util.logging.Logger.getLogger(crudProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jCRUD;
    private javax.swing.JScrollPane jDatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblDatosPro;
    private javax.swing.JLabel lblIDPersona1;
    private javax.swing.JLabel lblIdpersona;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JTabbedPane panelD;
    private javax.swing.JTable tb_Profesor;
    private javax.swing.JTable tb_persona;
    private javax.swing.JTextField txtDUI;
    private javax.swing.JTextField txtIdpersona;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
