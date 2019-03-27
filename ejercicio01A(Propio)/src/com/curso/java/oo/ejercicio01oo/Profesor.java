package com.curso.java.oo.ejercicio01oo;

public class Profesor extends Persona {

	private int tiempoExperiencia;

	public Profesor(String nombre, String dNI, int tiempoExperiencia) {
		super(nombre, dNI);
		this.tiempoExperiencia=tiempoExperiencia;
	}
	
	
	public int getTiempoExperiencia() {
		return tiempoExperiencia;
	}

	public void setTiempoExperiencia(int tiempoExperiencia) {
		this.tiempoExperiencia = tiempoExperiencia;
	}
}
