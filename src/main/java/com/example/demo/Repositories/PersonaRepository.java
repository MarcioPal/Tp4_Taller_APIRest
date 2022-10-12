/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repositories;

import com.example.demo.Entities.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    @Query(
            value ="SELECT * FROM personas p where p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%" ,
            nativeQuery = true
    )
    List<Persona> searchPersonasFiltro(@Param("filtro") String filtro);
}
