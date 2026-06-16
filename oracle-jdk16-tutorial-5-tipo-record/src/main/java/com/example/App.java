package com.example;

import java.time.LocalDate;
import java.time.Month;


public class App {
	public static void main(String[] args) {

		/*
		 * ¿Que es un record?
		 * 
		 * Es como una clase pero que por defecto tiene todos sus campos (propiedades,
		 * atributos) privados (private) y constantes (final), incluso el propio record
		 * es final, lo cual quiere decir que no se puede heredar.
		 * 
		 * Entonces, para que sirve un record? En principio para transportar datos de
		 * forma muy segura, porque el record es inmutable, es decir, una vez
		 * inicializado no se puede modificar.
		 * 
		 * Cuando se crea un record automaticamente sus propiedades se hacen private y
		 * final, y ademas, se crean metodos publicos por cada una de las propiedades
		 * privadas, que es como si fuesen los getters
		 * 
		 * El record genera automaticamente los constructores sin parametros y otro con
		 * todos los parametros, propiedades o variables miembro del record
		 * 
		 * Tambien el record genera automaticamente los metodos equals, hashCode y
		 * toString
		 * 
		 * ¿Necesita un record de Lombok? En principio no, pero si utilizamos la
		 * anotacion @Builder va a ser más facil crear o instanciar el record
		 * 
		 * El record no participa en la herencia, pero si puede implementar interfaces
		 */
		
		Persona persona1 = new Persona("Miguel", "Manaira", "Casimiro",
				LocalDate.of(2000, Month.JANUARY, 20));
		
		/* persona2 va a ser creada utilizando el patron Builder de Lombok */
		
		Persona persona2 = Persona.builder()
				.nombre("Jakeline")
				.apellido1("Avila")
				.apellido2("Paredes")
				.fechaNacimiento(LocalDate.of(1995, Month.SEPTEMBER, 9))
				.build();
		
		/* Demostrando que el record tiene generado el metodo equals */
		
		if (persona1.equals(persona2)) {
			System.out.println("El contenido de los dos record Persona es el mismo");
			
		} else {
			System.out.println("El contenido de los dos record Persona es diferente");
		}
		
		/* Imprimir el record tambien es posible porque se genera el meotodo toString() */

		System.out.println(persona2);
	}
}
