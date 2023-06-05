
package com.matiambrosi.viandas.repository;

import com.matiambrosi.viandas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository <Pedido, Long>{
    
}
