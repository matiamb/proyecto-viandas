
package com.matiambrosi.viandas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pedido {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToMany
    public Cliente unCliente;
    @ManyToMany
    public List<Comida> comidas;

    public Pedido() {
    }

    public Pedido(Long id, Cliente unCliente, List<Comida> comidas) {
        this.id = id;
        this.unCliente = unCliente;
        this.comidas = comidas;
    }
    
}
