
package com.Cinelitas.service;

import com.Cinelitas.entity.Sala;
import com.Cinelitas.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService implements ISala{
     @Autowired 
    private SalaRepository salarepository;
    
    
    @Override
    public List<Sala> listCountry() {
      return (List<Sala>)salarepository.findAll();
    }
}
