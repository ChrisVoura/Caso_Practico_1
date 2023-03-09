
package com.Cinelitas.controller;

import com.Cinelitas.entity.Funcion;
import com.Cinelitas.entity.Sala;
import com.Cinelitas.service.IFuncion;
import com.Cinelitas.service.ISala;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FuncionController {
     @Autowired
    private IFuncion funcionservice;

     @Autowired
    private ISala salaservice;
     
    @GetMapping("/Cartelera")
    public String motrarFunciones (Model model){
      List<Funcion> listaFuncion =  funcionservice.getAllEvento();
      model.addAttribute("titulo", "Cartelera Disponible");
      model.addAttribute("funcion", listaFuncion);     
        return "Cartelera";
    }
    
   @GetMapping("/Nuevo") 
   public String crearFunciones(Model model){
         List<Sala> listaSala =  salaservice.listCountry();
         model.addAttribute("funcion", new Funcion());  
          model.addAttribute("sala", listaSala); 
        return "Nuevo";  
   }
   @PostMapping("/Guardar")
   public String guardarEvento(@ModelAttribute Funcion funcion){
       funcionservice.saveEvento(funcion);
       return "redirect:/Cartelera";
   }
   @GetMapping("/delete/{id}")
   public String eliminarFuncion(@PathVariable Long id){
       funcionservice.delete(id);
       return "redirect:/Cartelera";
   }
  @GetMapping("/editFuncion/{id}")
  public String editarevento(@PathVariable("id") Long idEvento, Model model){
      Funcion funcion= funcionservice.getEventoById(idEvento);
        List<Sala> listaSala = salaservice.listCountry();
       model.addAttribute("funcion", funcion);
      model.addAttribute("sala", listaSala);
      return "Nuevo";
  }
   
}
