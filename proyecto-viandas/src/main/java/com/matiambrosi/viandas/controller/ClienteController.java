
package com.matiambrosi.viandas.controller;

import com.matiambrosi.viandas.model.Cliente;
import com.matiambrosi.viandas.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    ClienteService clientesvs;
    
    @PostMapping ("/cliente/crear")
    public String crearCliente(@RequestBody Cliente cliente){
        clientesvs.crearCliente(cliente);
        return "Cliente creado con exito";
    }
    
    @GetMapping ("/cliente")
    public List<Cliente> traerClientes(){
        return clientesvs.traerClientes();
    }
    
    @GetMapping ("/cliente/{id}")
    public Cliente traerUnClientes(@PathVariable Long id){
        return clientesvs.traerUnCliente(id);
    }
    
    @DeleteMapping ("/cliente/borrar/{id}")
    public String borrarCliente(@PathVariable Long id){
        clientesvs.borrarCliente(id);
        return "Cliente borrado con exito";
    }
    
    @PutMapping ("/cliente/editar/{id}")
    public Cliente editarCliente(@PathVariable Long id, 
            @RequestParam (required = false, name = "id")Long nuevaid,
            @RequestParam (required = false, name = "nombre") String nuevoNombre,
            @RequestParam (required = false, name = "apellido") String nuevoApellido,
            @RequestParam (required = false, name = "celular") String nuevoCelular) {
        clientesvs.editarCliente(id, nuevaid, nuevoNombre, nuevoApellido, nuevoCelular);
        return clientesvs.traerUnCliente(id);
    }
    
}
