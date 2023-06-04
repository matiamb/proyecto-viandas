
package com.matiambrosi.viandas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public Comida() {
    }

    public Comida(long id, String nombreComida, double precio) {
        this.id = id;
        this.nombreComida = nombreComida;
        this.precio = precio;
    }
    
}
