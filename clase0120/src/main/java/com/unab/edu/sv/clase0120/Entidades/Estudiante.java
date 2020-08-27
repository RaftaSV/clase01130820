/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.clase0120.Entidades;

import lombok.*;

/**
 *
 * @author rafap
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Estudiante extends personas{
    private int idEstudiante;
    private int matricula;
   
    
    
}
