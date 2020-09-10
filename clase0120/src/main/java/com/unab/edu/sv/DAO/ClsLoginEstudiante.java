/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.clase0120.Entidades.Estudiante;
import com.unab.edu.sv.clase0120.Entidades.personas;
import com.unab.edu.sv.clase0120.mysql.conexionBd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class ClsLoginEstudiante {

    conexionBd con = new conexionBd();
    Connection conectar = con.retornarConexion();
    public Boolean b = null;

    public Boolean Estudiante(String Usuario, String pass) {

        ArrayList<Estudiante> ListaUsusarioPass = new ArrayList<>();
        ArrayList<Estudiante> ListarContra = new ArrayList<>();
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_LOGUIESTUDIANTE(?,?)");
            Statement.setString("pUsuario", Usuario);
            Statement.setString("pPass", pass);
            ResultSet ResultadoConsulta = Statement.executeQuery();
            while (ResultadoConsulta.next()) {
                Estudiante es = new Estudiante();
                es.setUsu(ResultadoConsulta.getString("Usu"));
                es.setPass(ResultadoConsulta.getString("Pass"));
                ListaUsusarioPass.add(es);
            }
            String usuBase = "";
            String PassBase = "";
            for (var iterador : ListaUsusarioPass) {
                usuBase = iterador.getUsu();
                PassBase = iterador.getPass();
            }
            CallableStatement st2 = conectar.prepareCall("call SP_S_CRIP(?)");
            st2.setString("PcripPass", pass);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                Estudiante escrip = new Estudiante();

                escrip.setPass(rs2.getNString("crip"));
                ListarContra.add(escrip);
            }

            String passcrip = null;
            for (var iterador : ListarContra) {

                passcrip = iterador.getPass();

                pass = passcrip;

                System.out.println(pass);
                // System.out.println(usuBase +"  hh  ");
            }
            if (usuBase != null && PassBase != null) {
                if (usuBase.equals(Usuario) && PassBase.equals(pass)) {
                    b = true;
                } else {
                    b = false;

                }
            }
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return b;

    }
}
