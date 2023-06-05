
package com.matiambrosi.viandas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Comida {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long id;
    public String nombreComida;
    public double precio;
    @ManyToMany (mappedBy = "comidas") //el mappedby va del lado que no es el dominante
    @JsonIgnoreProperties ("comidas")
    @JsonIgnore
    public List<Pedido> listaPedidos;

    public Comida() {
    }

    public Comida(long id, String nombreComida, double precio, List<Pedido> listaPedidos) {
        this.id = id;
        this.nombreComida = nombreComida;
        this.precio = precio;
        this.listaPedidos = listaPedidos;
    }

    
    
}
