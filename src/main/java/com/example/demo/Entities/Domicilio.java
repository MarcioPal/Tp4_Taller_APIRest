/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Domicilio extends Base {
    
    private String calle;
    private int numero;
    @ManyToOne(optional = false) //optional indica si el atributo puede ser null o no
    @JoinColumn(name="fk_localidad")
    private Localidad localidad;
}
