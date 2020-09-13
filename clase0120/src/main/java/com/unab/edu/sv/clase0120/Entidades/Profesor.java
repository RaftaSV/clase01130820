/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.clase0120.Entidades;

import lombok.Data;

/**
 *
 * @author rafap
 */
@Data
public class Profesor extends personas{
    int IDprofesor;
    int IDpersona;
    String DUI;
    String Usuario;
    String Pass;
}
