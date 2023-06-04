
package com.matiambrosi.viandas.service;

import com.matiambrosi.viandas.model.Comida;
import java.util.List;

public interface IComidaService {
    public void crearComida(Comida comida);
    public List<Comida> traerComidas();
    public Comida traerUnaComida(Long id);
    public void borrarComida(Long id);
    public void editarComida(Long id, Long nuevaid, String nuevonombre, double nuevoprecio);
    
}
