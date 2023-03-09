
package com.Cinelitas.repository;

import com.Cinelitas.entity.Funcion;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FuncionRepository extends CrudRepository<Funcion,Long>{
    
}
