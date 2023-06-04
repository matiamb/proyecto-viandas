
package com.matiambrosi.viandas.repository;

import com.matiambrosi.viandas.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComidaRepository extends JpaRepository <Comida, Long>{
    
}
