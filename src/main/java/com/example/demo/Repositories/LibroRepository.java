/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repositories;

import com.example.demo.Entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository  extends BaseRepository<Libro,Long>{

}
