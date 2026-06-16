package com.example;

import java.time.LocalDate;

import lombok.Builder;



@Builder

public record Persona(
		String nombre, 
		String apellido1, 
		String apellido2, 
		LocalDate fechaNacimiento) {
		
}
