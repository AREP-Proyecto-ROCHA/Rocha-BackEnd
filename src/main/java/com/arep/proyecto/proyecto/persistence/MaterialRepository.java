package com.arep.proyecto.proyecto.persistence;

import com.arep.proyecto.proyecto.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, String>{

}
