/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.clase0120.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rafap
 */
public class conexionBd {
    
    private Connection conexion;
    public conexionBd(){
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/clase01","root","root");
            System.out.println("Conexion exitosa");
            
        } catch (Exception e) {
            System.out.println("error"+e);
        }
    
    }
    
    public Connection retornarConexion(){
    return conexion;
    }
}
