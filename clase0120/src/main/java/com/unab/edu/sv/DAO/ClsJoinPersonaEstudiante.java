/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.clase0120.Entidades.Estudiante;
import com.unab.edu.sv.clase0120.mysql.conexionBd;
import java.sql.*;
import java.util.*;

/**
 *
 * @author rafap
 */
public class ClsJoinPersonaEstudiante {
    conexionBd cn = new conexionBd();
    Connection con = cn.retornarConexion();
    
    public ArrayList <Estudiante>MostrarJoinEstudiantePersona(){
    
    ArrayList<Estudiante>Lista = new ArrayList<>();
        try {
            CallableStatement st = con.prepareCall(" Call SP_S_JoinPersonaEstudiante()");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Estudiante es = new Estudiante();
                es.setNombre(rs.getString("nombre"));
                es.setApellido(rs.getString("apellido"));
                es.setMatricula(rs.getInt("Matricula"));
                Lista.add(es);
            }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        return Lista;
    }
    
}
