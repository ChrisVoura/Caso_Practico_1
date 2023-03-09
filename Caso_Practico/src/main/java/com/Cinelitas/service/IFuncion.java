
package com.Cinelitas.service;

import com.Cinelitas.entity.Funcion;
import java.util.List;


public interface IFuncion {
      public List<Funcion> getAllEvento();
    public Funcion getEventoById (long id);
    public void saveEvento(Funcion funcion);
    public void delete(long id);
}
