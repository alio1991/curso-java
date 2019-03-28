package com.curso.java.oo.ejercicio01oo.model;

public class Alumno extends Persona {
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre) {
		super(nombre);
	}

	private boolean subvencionado;

	public boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}
}
