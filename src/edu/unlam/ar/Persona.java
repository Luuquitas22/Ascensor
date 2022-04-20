package edu.unlam.ar;

public class Persona {

	private String nombre;
	private Integer edad;
	private Double peso;

	public Persona(String nombre, Integer edad, Double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}


	public Persona() {
		
	}


	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public Double getPeso() {
		return peso;
	}
	
	
	
}
