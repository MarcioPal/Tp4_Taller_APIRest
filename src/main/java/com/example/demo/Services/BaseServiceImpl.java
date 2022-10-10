package com.example.demo.Services;

import com.example.demo.Entities.Base;
import com.example.demo.Repositories.BaseRepository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }  //Inyeccion de dependencia mediante constructor

   @Transactional
    @Override
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public E findById(ID id) {

        Optional<E> entityOptional = baseRepository.findById(id);
        return entityOptional.get();
    }

    @Transactional
    @Override
    public E save(E entity) throws Exception {
        try {
             baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);  //La clase optional indica que se trata de un objeto de la clase que se indica 
            E persona = entityOptional.get();                             //como parametro o un NULL en el caso de que no se encuentre la persona.
            persona = entity;
            this.baseRepository.save(persona);
            return persona;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}