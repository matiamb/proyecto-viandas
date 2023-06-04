
package com.matiambrosi.viandas.service;

import com.matiambrosi.viandas.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    public void crearCliente(Cliente cliente);
    public List<Cliente> traerClientes();
    public Cliente traerUnCliente(Long id);
    public void borrarCliente(Long id);
    public void editarCliente(Long id);
    
}
