/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Entities.Autor;
import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor,Long> {
    @Autowired
    private AutorRepository autorRepository;

    public AutorService(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    
}
