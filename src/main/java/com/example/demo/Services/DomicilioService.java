/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Entities.Domicilio;
import com.example.demo.Repositories.BaseRepository;
import com.example.demo.Repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseServiceImpl<Domicilio,Long> {
    @Autowired
    private DomicilioRepository domRepo;

    public DomicilioService(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }

    
    
}
