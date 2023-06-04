
package com.matiambrosi.viandas.service;

import com.matiambrosi.viandas.model.Comida;
import com.matiambrosi.viandas.repository.IComidaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComidaService implements IComidaService {
    
    @Autowired
    IComidaRepository comidarepo;

    @Override
    public void crearComida(Comida comida) {
        comidarepo.save(comida);
    }

    @Override
    public List<Comida> traerComidas() {
        return comidarepo.findAll();
    }

    @Override
    public Comida traerUnaComida(Long id) {
        return comidarepo.findById(id).orElse(null);
    }

    @Override
    public void borrarComida(Long id) {
        comidarepo.deleteById(id);
    }

    @Override
    public void editarComida(Long id, Long nuevaid, String nuevonombre, double nuevoprecio) {
        Comida temp = this.traerUnaComida(id);
        temp.setId(nuevaid);
        temp.setNombreComida(nuevonombre);
        temp.setPrecio(nuevoprecio);
        
        this.crearComida(temp);
    }
    
}
