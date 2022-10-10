/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Entities.Base;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Usuario
 */

public interface BaseService<E extends Base , ID extends Serializable> {   //El parametro E indica que la clase av a trabajar con un tipo generico de objeto
    
    public List<E> findAll() throws Exception;
    public E findById(ID id);        //Cual es la difrencia en este caso de devolver E o un Object??
    public E save (E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}