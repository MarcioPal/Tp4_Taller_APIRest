/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Entities.Localidad;
import com.example.demo.Repositories.BaseRepository;
import com.example.demo.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService extends BaseServiceImpl<Localidad,Long> {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadService(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

   
}
