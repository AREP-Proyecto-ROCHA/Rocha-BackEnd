package com.arep.proyecto.proyecto.persistence;

import com.arep.proyecto.proyecto.model.Ingreso;
import com.arep.proyecto.proyecto.model.Producido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducidoRepository extends JpaRepository<Producido, String>{

}
