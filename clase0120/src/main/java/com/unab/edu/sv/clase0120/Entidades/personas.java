/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.clase0120.Entidades;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author rafap
 */
@Data
public class personas {

    protected int idpersona;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String sexo;
    protected Date Fecha;
}
