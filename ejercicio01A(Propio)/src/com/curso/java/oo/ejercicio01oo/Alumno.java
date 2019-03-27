package com.curso.java.oo.ejercicio01oo;

public class Alumno extends Persona{

	private Estudios nivelMaxEstudios;
	
	public Alumno(String nombre, String dNI, Estudios nivel) {
		super(nombre,dNI);
		this.nivelMaxEstudios=nivel;
	}

	public Estudios getNivelMaxEstudios() {
		return nivelMaxEstudios;
	}

	public void setNivelMaxEstudios(Estudios nivelMaxEstudios) {
		this.nivelMaxEstudios = nivelMaxEstudios;
	}
	
}
