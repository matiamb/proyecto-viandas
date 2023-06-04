
package com.matiambrosi.viandas.repository;

import com.matiambrosi.viandas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository <Cliente, Long>{
    
}
