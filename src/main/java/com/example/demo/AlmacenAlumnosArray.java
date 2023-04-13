package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlmacenAlumnosArray implements AlmacenAlumnos{

	@Override
	public List<Alumno> findAll() {
		Alumno[] lista = new Alumno[] {
						Alumno.builder()
						.nombre("Alex")
						.apellidos("Luque Hoffrogge")
						.fechaNacimiento(LocalDate.of(2002, 04, 13))
						.build()
		};
		return Arrays.asList(lista);
	}

}
