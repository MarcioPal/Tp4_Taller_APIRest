/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;


import com.example.demo.Entities.Libro;
import com.example.demo.Entities.Persona;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PersonaDTO {
    
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private List<Libro> libros = new ArrayList<Libro>();
    
    public PersonaDTO(Persona p){
        this.nombre = p.getNombre();
        this.apellido = p.getApellido();
        this.dni = p.getDni();
        this.domicilio = p.getDomicilio().getCalle()+" "+p.getDomicilio().getNumero()
                         +" "+p.getDomicilio().getLocalidad();
        this.libros = p.getLibros();
        
    }
}
