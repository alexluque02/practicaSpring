package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAlumnos {
	@Autowired //Satisface la dependencia que tiene ServicioAlumnos de AlmacenAlumnos             
	private AlmacenAlumos almacenAlumnos;

	/**
	 * Método que devuelve el listado con los nombres
	 * de aquellos alumnos que cumplen años hoy
	 * @return lista de nombres, lista vacia si no hay ninguno
	 */
	public List<String> cumpleHoy(){
		List<String> result = new ArrayList<>();
		
		result = almacenAlumnos.findAll()
		.stream()
		.filter(a->a.getFechaNacimiento().getDayOfMonth() ==
		LocalDate.now().getDayOfMonth()&&
		a.getFechaNacimiento().getMonth() == LocalDate.now().getMonth())
		.map(a -> a.getNombre() + " "+a.getApellidos())
		.toList();
		
		return result;
	}
}
