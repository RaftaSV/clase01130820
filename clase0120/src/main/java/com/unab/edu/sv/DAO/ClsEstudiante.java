/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.clase0120.Entidades.Estudiante;
import com.unab.edu.sv.clase0120.mysql.conexionBd;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class ClsEstudiante {

    conexionBd con = new conexionBd();
    Connection conectar = con.retornarConexion();

    public ArrayList<Estudiante> mostrarEstudiantes() {
        ArrayList<Estudiante> Estudiante = new ArrayList<>();
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_ESTUDIANTE()");
            ResultSet ResultadoConsulta = Statement.executeQuery();
            while (ResultadoConsulta.next()) {
                Estudiante es = new Estudiante();

                es.setIdEstudiante(ResultadoConsulta.getInt("idEstudiante"));
                es.setMatricula(ResultadoConsulta.getInt("Matricula"));
                es.setIdpersona(ResultadoConsulta.getInt("idpersona"));
                es.setNombre(ResultadoConsulta.getString("nombre"));
                es.setUsu(ResultadoConsulta.getString("Usu"));
                es.setPass(ResultadoConsulta.getString("Pass"));
                es.setNIE(ResultadoConsulta.getInt("NIE"));
                Estudiante.add(es);
            }
            conectar.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return Estudiante;
    }

    public void GuardarEstudiante(Estudiante es) {
        try {
            CallableStatement Statement = conectar.prepareCall("Call SP_I_ESTUDIANTE(?,?,?,?,?)");
            Statement.setInt("pMatricula", es.getMatricula());
            Statement.setInt("pIdpersona", es.getIdpersona());
            Statement.setString("pUsu", es.getUsu());
            Statement.setString("pPass", es.getPass());
            Statement.setInt("pNIE", es.getNIE());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
            conectar.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClsPersona.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
        }

    }
        public void ActualizarEstudiante(Estudiante es) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_U_ESTUDIANTE(?,?,?,?,?,?)");
            Statement.setInt("pID", es.getIdEstudiante());
            Statement.setInt("pMatricula", es.getMatricula());
            Statement.setInt("pIdpersona", es.getIdpersona());
            Statement.setString("pUsu", es.getUsu());
            Statement.setString("pPass", es.getPass());
            Statement.setInt("pNIE", es.getNIE());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Cambio exitoso");
            conectar.close();
         

        } catch (Exception e) {
            Logger.getLogger(ClsPersona.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ActualizarEstudianteSC(Estudiante es) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_U_ESTUDIANTESC(?,?,?,?,?,?)");
            Statement.setInt("pID", es.getIdEstudiante());
            Statement.setInt("pMatricula", es.getMatricula());
            Statement.setInt("pIdpersona", es.getIdpersona());
            Statement.setString("pUsu", es.getUsu());
            Statement.setString("pPass", es.getPass());
            Statement.setInt("pNIE", es.getNIE());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Cambio exitoso");
            conectar.close();
         

        } catch (Exception e) {
            Logger.getLogger(ClsPersona.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public void EliminarEstudiante(Estudiante es){
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_D_ESTUDIANTE(?)");
            Statement.setInt("pID", es.getIdEstudiante());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Eliminado exitoso");
        } catch (Exception e) {
             Logger.getLogger(ClsPersona.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
}
