
package com.matiambrosi.viandas.controller;

import com.matiambrosi.viandas.model.Comida;
import com.matiambrosi.viandas.service.ComidaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComidaController {
    
    @Autowired
    ComidaService comidasvs;
    
    @PostMapping ("/comidas/crear")
    public String crearComida(@RequestBody Comida comida){
        comidasvs.crearComida(comida);
        return "Comida creada con exito";
    }
    
    @GetMapping ("/comidas")
    public List<Comida> traerComidas(){
        return comidasvs.traerComidas();
    }
    
    @GetMapping ("/comidas/{id}")
    public Comida traerUnaComida(@RequestParam Long id){
        return comidasvs.traerUnaComida(id);
    }
    
    @DeleteMapping ("/comidas/borrar/{id}")
    public String borrarComida(@RequestParam Long id){
        comidasvs.borrarComida(id);
        return "Comida borrada con exito";
    }
    
    @PutMapping ("/comidas/editar/{id}")
    public Comida editarComida(@RequestParam Long id,
            @RequestParam (required = false, name = "id") Long nuevaid,
            @RequestParam (required = false, name = "nombreComida") String nuevoNombre,
            @RequestParam (required = false, name = "precio") double nuevoprecio){
        comidasvs.editarComida(id, nuevaid, nuevoNombre, nuevoprecio);
        return comidasvs.traerUnaComida(id);
    }
}
