package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	
	@Autowired
	private ServicioAlumnos servicioAlumnos;
	
	@PostConstruct
	public void ejecutar() {
		System.out.println("Alumnos que cumplen hoy");
		servicioAlumnos.cumpleHoy()
		.forEach(a-> System.out.println("Felicidades "+a));
	}
}
