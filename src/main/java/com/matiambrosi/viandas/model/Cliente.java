
package com.matiambrosi.viandas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public Cliente() {
    }

    public Cliente(long id, String nombre, String apellido, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    
    
}
