/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Entities.Libro;
import com.example.demo.Repositories.BaseRepository;
import com.example.demo.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService extends BaseServiceImpl<Libro,Long> {

    @Autowired
    private LibroRepository libroRepo;

    public LibroService(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
