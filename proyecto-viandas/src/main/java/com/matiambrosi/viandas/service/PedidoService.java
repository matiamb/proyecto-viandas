
package com.matiambrosi.viandas.service;

import com.matiambrosi.viandas.model.Cliente;
import com.matiambrosi.viandas.model.Comida;
import com.matiambrosi.viandas.model.Pedido;
import com.matiambrosi.viandas.repository.IPedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService implements IPedidoService {
    
    @Autowired
    IPedidoRepository pedidorepo;

    @Override
    public void crearPedido(Pedido pedido) {
        pedidorepo.save(pedido);
    }

    @Override
    public List<Pedido> traerPedidos() {
        return pedidorepo.findAll();
    }

    @Override
    public Pedido traerUnPedido(Long id) {
        return pedidorepo.findById(id).orElse(null);
    }

    @Override
    public void borrarPedido(Long id) {
        pedidorepo.deleteById(id);
    }

    @Override
    public void editarPedido(Long id, Long nuevaid, Cliente nuevocliente, List<Comida> nuevacomida) {
        Pedido temp = this.traerUnPedido(id);
        
        temp.setId(nuevaid);
        temp.setUnCliente(nuevocliente);
        temp.setComidas(nuevacomida);
        
        this.crearPedido(temp);
    }
    
}
