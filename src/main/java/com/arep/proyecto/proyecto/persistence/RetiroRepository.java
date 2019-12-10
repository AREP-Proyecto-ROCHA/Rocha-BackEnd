package com.arep.proyecto.proyecto.persistence;

import com.arep.proyecto.proyecto.model.Material;
import com.arep.proyecto.proyecto.model.Retiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetiroRepository extends JpaRepository<Retiro, String>{

}
