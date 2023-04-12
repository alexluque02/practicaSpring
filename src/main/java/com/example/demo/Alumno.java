package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Pone todo los getters and setters, toString,  etc.
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Service
public class Alumno {

	private String nombre, apellidos;
	private LocalDate fechaNacimiento;
}
