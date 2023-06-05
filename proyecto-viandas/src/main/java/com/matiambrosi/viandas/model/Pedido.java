
package com.matiambrosi.viandas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pedido {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    public Cliente unCliente;
    @ManyToMany//las propiedades van del lado dominante
    @JoinTable ( //esta es la tabla intermedia, por mas que la crea automaticamente, a veces al parecer no lo hace bien
            name = "Pedido_comidas",//nombre de la tabla
            joinColumns = @JoinColumn (name = "id_pedido"),//nombre de las columnas
            inverseJoinColumns = @JoinColumn (name = "id_comida"))
    public List<Comida> comidas;

    public Pedido() {
    }

    public Pedido(Long id, Cliente unCliente, List<Comida> comidas) {
        this.id = id;
        this.unCliente = unCliente;
        this.comidas = comidas;
    }
    
}
