package com.arep.proyecto.proyecto;

import com.arep.proyecto.proyecto.model.Material;
import com.arep.proyecto.proyecto.persistence.MaterialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class ProyectoApplication {

	private static final Logger log = LoggerFactory.getLogger(ProyectoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}
