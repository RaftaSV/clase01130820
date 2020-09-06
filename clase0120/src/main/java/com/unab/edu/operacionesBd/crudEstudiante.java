/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.operacionesBd;

import com.unab.edu.sv.DAO.ClsEstudiante;
import com.unab.edu.sv.DAO.ClsPersona;
import com.unab.edu.sv.clase0120.Entidades.Estudiante;
import com.unab.edu.sv.clase0120.Entidades.personas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafap
 */
public class crudEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form crudEstudiante
     */
    public crudEstudiante() {
        initComponents();
        Mostrarper();
        MostrarEstudiantes();
        this.setLocationRelativeTo(null);
    }

    void MostrarEstudiantes() {
        String Titulos[] = {"IDEstudiante", "Matricula", "IDPersona", "Nombre", "Usuario", "Pass", "NIE"};
        DefaultTableModel Model = new DefaultTableModel(null, Titulos);
        ClsEstudiante estudiante = new ClsEstudiante();
        ArrayList<Estudiante> Estu = estudiante.mostrarEstudiantes();
        String filas[] = new String[7];
        for (var iterar : Estu) {
            filas[0] = String.valueOf(iterar.getIdEstudiante());
            filas[1] = String.valueOf(iterar.getMatricula());
            filas[2] = String.valueOf(iterar.getIdpersona());
            filas[3] = iterar.getNombre();
            filas[4] = iterar.getUsu();
            filas[5] = iterar.getPass();
            filas[6] = String.valueOf(iterar.getNIE());
            Model.addRow(filas);
        }
        tb_Estudiante.setModel(Model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Table = new javax.swing.JTabbedPane();
        panelDatos = new javax.swing.JScrollPane();
        tb_Estudiante = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JTextField();
        txtIDPersona = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblIDPersona = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNIE = new javax.swing.JLabel();
        txtNIE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Per = new javax.swing.JTable();
        lblIDPersona1 = new javax.swing.JLabel();
        lblBienbenidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        tb_Estudiante.setBackground(new java.awt.Color(102, 255, 204));
        tb_Estudiante.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_EstudianteMouseClicked(evt);
            }
        });
        panelDatos.setViewportView(tb_Estudiante);

        Table.addTab("Mostrar Datos", panelDatos);

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));

        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtIDPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIDPersona.setEnabled(false);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setText("0");
        txtID.setEnabled(false);

        lblIDPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDPersona.setText("ID Persona");

        lblMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMatricula.setText("Matricula");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPass.setText("Pass");

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setText("ID");

        btnGuardar.setBackground(new java.awt.Color(255, 51, 51));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblNIE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNIE.setText("NIE");

        txtNIE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tb_Per.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo 1", "Titulo 2", "Titulo 3"
            }
        ));
        tb_Per.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_PerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Per);

        lblIDPersona1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDPersona1.setText("Selecione la persona");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDPersona1)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblPass)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNIE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(38, 38, 38)
                                .addComponent(btnEliminar))
                            .addComponent(txtNIE, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario)
                            .addComponent(txtIDPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDPersona)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(lblIDPersona1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPass)
                .addGap(13, 13, 13)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNIE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        Table.addTab("CRUD", jPanel3);

        lblBienbenidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBienbenidos.setText("Bienvenido aqui encontraras toda la informacion de los estudiantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblBienbenidos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Table)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienbenidos)
                .addGap(18, 18, 18)
                .addComponent(Table)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Estudiante es = new Estudiante();
        es.setIdEstudiante(Integer.parseInt(txtID.getText()));
        ClsEstudiante estu = new ClsEstudiante();
        estu.EliminarEstudiante(es);
        limpiar();
        MostrarEstudiantes();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(txtID.getText()) == 0) {
            Estudiante es = new Estudiante();
            es.setMatricula(Integer.parseInt(txtMatricula.getText()));
            es.setIdpersona(Integer.parseInt(txtIDPersona.getText()));
            es.setUsu(txtUsuario.getText());
            es.setPass(txtPass.getText());
            es.setNIE(Integer.parseInt(txtNIE.getText()));
            ClsEstudiante estudiante = new ClsEstudiante();
            estudiante.GuardarEstudiante(es);
             System.out.println(es);
        } else {
            Estudiante es = new Estudiante();
            es.setIdEstudiante(Integer.parseInt(txtID.getText()));
            es.setMatricula(Integer.parseInt(txtMatricula.getText()));
            es.setIdpersona(Integer.parseInt(txtIDPersona.getText()));
            es.setUsu(txtUsuario.getText());
            es.setPass(txtPass.getText());
            es.setNIE(Integer.parseInt(txtNIE.getText()));
            ClsEstudiante estudiante = new ClsEstudiante();
            estudiante.ActualizarEstudiante(es);
        }
       
        MostrarEstudiantes();
        limpiar();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tb_EstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_EstudianteMouseClicked
        Table.setSelectedIndex(Table.indexOfComponent(jPanel3));
        int fila = tb_Estudiante.getSelectedRow();
        String ID = String.valueOf(tb_Estudiante.getValueAt(fila, 0));
        txtID.setText(ID);
        String Matricula = String.valueOf(tb_Estudiante.getValueAt(fila, 1));
        txtMatricula.setText(Matricula);
        String Idper = String.valueOf(tb_Estudiante.getValueAt(fila, 2));
        txtIDPersona.setText(Idper);
        String usu = String.valueOf(tb_Estudiante.getValueAt(fila, 4));
        txtUsuario.setText(usu);
        String pass = String.valueOf(tb_Estudiante.getValueAt(fila, 5));
        txtPass.setText(pass);
        String nie = String.valueOf(tb_Estudiante.getValueAt(fila, 6));
        txtNIE.setText(nie);

    }//GEN-LAST:event_tb_EstudianteMouseClicked

    private void tb_PerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_PerMouseClicked
        // TODO add your handling code here:
        int fila = tb_Per.getSelectedRow();
        txtIDPersona.setText(String.valueOf(tb_Per.getValueAt(fila, 0)));
    }//GEN-LAST:event_tb_PerMouseClicked
    public void limpiar() {
        txtID.setText("0");
        txtIDPersona.setText("");
        txtMatricula.setText("");
        txtNIE.setText("");
        txtPass.setText("");
        txtUsuario.setText("");
    }

    void Mostrarper() {
         String Titulos[] = {"ID persona", "Nombre", "Apellido"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        ClsPersona persona = new ClsPersona();
        ArrayList<personas> per = persona.mostrarPersona();
        String Filas[] = new String[3];
        for (var i : per) {
            Filas[0] = String.valueOf(i.getIdpersona());
            Filas[1] = i.getNombre();
            Filas[2] = i.getApellido();
            modelo.addRow(Filas);
        }
        tb_Per.setModel(modelo);
    }

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
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Table;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienbenidos;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDPersona;
    private javax.swing.JLabel lblIDPersona1;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNIE;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JScrollPane panelDatos;
    private javax.swing.JTable tb_Estudiante;
    private javax.swing.JTable tb_Per;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDPersona;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNIE;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
