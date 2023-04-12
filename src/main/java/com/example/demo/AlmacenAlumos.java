package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class AlmacenAlumos {

	List <Alumno> lista;
	
	@PostConstruct
	public void init() {
		lista=new ArrayList<>();
		
		lista.add(
				Alumno.builder()
				.nombre("Alex")
				.apellidos("Luque Hoffrogge")
				.fechaNacimiento(LocalDate.of(2002, 04, 12))
				.build()
				);
	}
	
	public List<Alumno> findAll(){
		return Collections.unmodifiableList(lista);
	}
}

