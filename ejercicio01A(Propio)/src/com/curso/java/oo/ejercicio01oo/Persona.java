package com.curso.java.oo.ejercicio01oo;

public class Persona {
	
	private String nombre;
	private String dNI;
	
	public Persona(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		this.dNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}
	
}
