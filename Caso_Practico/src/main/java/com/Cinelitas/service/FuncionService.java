
package com.Cinelitas.service;

import com.Cinelitas.entity.Funcion;
import com.Cinelitas.repository.FuncionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionService implements IFuncion{
    @Autowired
    private FuncionRepository funcionrepository;
    
    @Override
    public void delete(long id) {
       funcionrepository.deleteById(id);
    }

    @Override
    public List<Funcion> getAllEvento() {
        return (List<Funcion>)funcionrepository.findAll();
    }

    @Override
    public Funcion getEventoById(long id) {
        return funcionrepository.findById(id).get();
    }

    @Override
    public void saveEvento(Funcion funcion) {
        funcionrepository.save(funcion);
    }
    
}
