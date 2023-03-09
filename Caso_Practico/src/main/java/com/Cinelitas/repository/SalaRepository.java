
package com.Cinelitas.repository;

import com.Cinelitas.entity.Sala;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SalaRepository extends CrudRepository<Sala,Long> {
    
}
