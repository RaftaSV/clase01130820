/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.clase0120.Entidades.personas;
import com.unab.edu.sv.clase0120.mysql.conexionBd;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class ClsPersona {

    conexionBd con = new conexionBd();
    Connection conectar = con.retornarConexion();

    public ArrayList<personas> mostrarPersona() {
        ArrayList<personas> Personas = new ArrayList<>();
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_Persona()");
            ResultSet ResultadoConsulta = Statement.executeQuery();
            while (ResultadoConsulta.next()) {
                personas Persona = new personas();

                Persona.setIdpersona(ResultadoConsulta.getInt("idpersona"));
                Persona.setNombre(ResultadoConsulta.getString("nombre"));
                Persona.setApellido(ResultadoConsulta.getString("apellido"));
                Persona.setEdad(ResultadoConsulta.getInt("edad"));
                Persona.setSexo(ResultadoConsulta.getString("sexo"));
                Personas.add(Persona);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Personas;
    }

    public void AgregarPersona(personas Per) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_I_Persona()");
            

        } catch (SQLException ex) {
            Logger.getLogger(ClsPersona.class.getName()).log(Level.SEVERE, null,ex);
        }

    }
}
