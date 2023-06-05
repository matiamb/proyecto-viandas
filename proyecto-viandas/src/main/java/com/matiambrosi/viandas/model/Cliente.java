
package com.matiambrosi.viandas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long id;
    public String nombre;
    public String apellido;
    private String celular;
    @ManyToOne
    public List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(long id, String nombre, String apellido, String celular, List<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.pedidos = pedidos;
    }    
    
}
