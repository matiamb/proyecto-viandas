
package com.matiambrosi.viandas.service;

import com.matiambrosi.viandas.model.Cliente;
import com.matiambrosi.viandas.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {
    
    @Autowired
    IClienteRepository repocliente;

    @Override
    public void crearCliente(Cliente cliente) {
        repocliente.save(cliente);
    }

    @Override
    public List<Cliente> traerClientes() {
        return repocliente.findAll();
    }

    @Override
    public Cliente traerUnCliente(Long id) {
        return repocliente.findById(id).orElse(null);
    }

    @Override
    public void borrarCliente(Long id) {
        repocliente.deleteById(id);
    }

    @Override
    public void editarCliente(Long id, Long nuevoid, String nuevoNombre, String nuevoApellido, String nuevoCelular) {
        Cliente temp = this.traerUnCliente(id);
        temp.setId(nuevoid);
        temp.setNombre(nuevoNombre);
        temp.setApellido(nuevoApellido);
        temp.setCelular(nuevoCelular);
        
        this.crearCliente(temp);
    }
    
}
