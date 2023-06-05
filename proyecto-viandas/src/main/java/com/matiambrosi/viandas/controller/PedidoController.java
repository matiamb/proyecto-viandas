
package com.matiambrosi.viandas.controller;

import com.matiambrosi.viandas.model.Cliente;
import com.matiambrosi.viandas.model.Comida;
import com.matiambrosi.viandas.model.Pedido;
import com.matiambrosi.viandas.service.PedidoService;
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
public class PedidoController {
    
    @Autowired
    PedidoService pedidosvs;
    
    @PostMapping ("/pedidos/crear")
    public String crearPedido(@RequestBody Pedido pedido){
        pedidosvs.crearPedido(pedido);
        return "Pedido creado con exito";
    }
    
    @GetMapping ("/pedidos")
    public List<Pedido> traerPedidos(){
        return pedidosvs.traerPedidos();
    }
    
    @GetMapping ("/pedidos/{id}")
    public Pedido traerUnPedido(@RequestParam Long id){
        return pedidosvs.traerUnPedido(id);
    }
    
    @DeleteMapping ("/pedidos/borrar/{id}")
    public String borrarPedido(@RequestParam Long id){
        pedidosvs.borrarPedido(id);
        return "Pedido borrado con exito";
    }
    
    @PutMapping ("/pedidos/editar/{id}")
    public Pedido editarPedido(@RequestParam Long id,
            @RequestParam (required = false, name = "id") Long nuevaid,
            @RequestParam (required = false, name = "unCliente") Cliente nuevocliente,
            @RequestParam (required = false, name = "comidas") List<Comida> nuevacomida){
        pedidosvs.editarPedido(id, nuevaid, nuevocliente, nuevacomida);
        
        return pedidosvs.traerUnPedido(id);
    }
}
