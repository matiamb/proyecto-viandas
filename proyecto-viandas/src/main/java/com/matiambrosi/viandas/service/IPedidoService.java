
package com.matiambrosi.viandas.service;

import com.matiambrosi.viandas.model.Cliente;
import com.matiambrosi.viandas.model.Comida;
import com.matiambrosi.viandas.model.Pedido;
import java.util.List;

public interface IPedidoService {
    
    public void crearPedido(Pedido pedido);
    public List<Pedido> traerPedidos();
    public Pedido traerUnPedido(Long id);
    public void borrarPedido(Long id);
    public void editarPedido(Long id, Long nuevaid, Cliente nuevocliente, List<Comida> nuevacomida);
      
}
