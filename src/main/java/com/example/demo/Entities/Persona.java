/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona extends Base {

    private String nombre;
    private String apellido;
    private int dni;

 
    
}
