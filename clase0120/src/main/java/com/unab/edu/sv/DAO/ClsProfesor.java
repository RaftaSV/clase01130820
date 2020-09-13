/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.clase0120.Entidades.Profesor;
import com.unab.edu.sv.clase0120.mysql.conexionBd;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class ClsProfesor {

    conexionBd con = new conexionBd();
    Connection conectar = con.retornarConexion();

    public ArrayList<Profesor> MostrarProfesor() {
        ArrayList<Profesor> lista = new ArrayList<>();
        try {
            CallableStatement st = conectar.prepareCall("call SP_S_PROFESOR()");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Profesor pro = new Profesor();
                pro.setIDprofesor(rs.getInt("IDprofesor"));
                pro.setIDpersona(rs.getInt("IDpersona"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDUI(rs.getString("DUI"));
                pro.setUsuario(rs.getString("Usuario"));
                pro.setPass(rs.getString("Pass"));
                lista.add(pro);

            }
            conectar.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return lista;
    }

    public void Guardar(Profesor pro) {
        try {
            CallableStatement st = conectar.prepareCall("Call SP_I_PROFESOR(?,?,?,?)");
            st.setInt("pIdPersona", pro.getIDpersona());
            st.setString("pDui", pro.getDUI());
            st.setString("pUsuario", pro.getUsuario());
            st.setString("pPass", pro.getPass());
            st.executeQuery();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
            conectar.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Actualizar(Profesor pro) {
        try {
            CallableStatement st = conectar.prepareCall("call SP_U_PROFESOR(?,?,?,?,?)");
            st.setInt("pID", pro.getIDprofesor());
            st.setInt("pIdPersona", pro.getIDpersona());
            st.setString("pDui", pro.getDUI());
            st.setString("pUsuario", pro.getUsuario());
            st.setString("pPass", pro.getPass());
            st.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Eliminar(Profesor pro) {

        try {

            CallableStatement st = conectar.prepareCall("call SP_D_PROFESOR(?)");
            st.setInt("pID", pro.getIDprofesor());
            st.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Boolean Resul = null;

    public Boolean Login(String Usu, String pass) {
        ArrayList<Profesor> ListaUsu = new ArrayList<>();
        ArrayList<Profesor> ListaContra = new ArrayList<>();
        try {
            CallableStatement st1 = conectar.prepareCall("call SP_S_LOGINPROFESOR(?,?)");
            st1.setString("pUsuario", Usu);
            st1.setString("pPass", pass);
            ResultSet result = st1.executeQuery();
            while (result.next()) {
                Profesor pro = new Profesor();
                pro.setUsuario(result.getString("Usuario"));
                pro.setPass(result.getString("Pass"));
                ListaUsu.add(pro);
            }
            String Usuariobase = "";
            String PassBase = "";
            for (var i : ListaUsu) {
                Usuariobase = i.getUsuario();
                PassBase = i.getPass();
            }

            CallableStatement st2 = conectar.prepareCall("call SP_S_CRIPP(?)");
            st2.setString("PcripPass", pass);
            ResultSet result2 = st2.executeQuery();
            while (result2.next()) {
                Profesor pro = new Profesor();
                pro.setPass(result2.getString("crip"));
                ListaContra.add(pro);
            }
            String passcrip = null;
            for (var i : ListaContra) {
                passcrip = i.getPass();
                pass = passcrip;

            }
            if (Usuariobase != null && PassBase != null) {
                if (Usuariobase.equals(Usu) && PassBase.equals(pass)) {
                    Resul = true;
                } else {
                    Resul = false;
                    System.out.println(Usuariobase + " espacio " + Usu);
                    System.out.println(pass + " espacio " + passcrip);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return Resul;
    }

}
