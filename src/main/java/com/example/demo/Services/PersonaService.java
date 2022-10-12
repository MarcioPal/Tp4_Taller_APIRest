/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Entities.Persona;
import com.example.demo.Repositories.BaseRepository;
import com.example.demo.Repositories.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends BaseServiceImpl<Persona,Long> {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona,Long> baseRepository) {
       super(baseRepository);
    }
  public List<Persona> searchPersonasFiltro(String filtro){
      return personaRepository.searchPersonasFiltro(filtro);
  }
    
}
