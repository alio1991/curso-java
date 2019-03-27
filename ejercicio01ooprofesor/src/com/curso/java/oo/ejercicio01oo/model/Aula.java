package com.curso.java.oo.ejercicio01oo.model;

import java.util.Set;

public class Aula {
	
	private String nombre;
	private boolean proyector;
	private boolean pizarra;
	private PuestoDeTrabajo puestoDelProfesor;
	private Set<PuestoDeTrabajo> puestosDeAlumnos;
	
	public Aula(String nombre, boolean proyector, boolean pizarra, Set<PuestoDeTrabajo> puestosDeAlumnos) {
		super();
		this.nombre = nombre;
		this.proyector = proyector;
		this.pizarra = pizarra;
		this.puestosDeAlumnos = puestosDeAlumnos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isProyector() {
		return proyector;
	}
	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}
	public boolean isPizarra() {
		return pizarra;
	}
	public void setPizarra(boolean pizarra) {
		this.pizarra = pizarra;
	}
	public PuestoDeTrabajo getPuestoDelProfesor() {
		return puestoDelProfesor;
	}
	public void setPuestoDelProfesor(PuestoDeTrabajo puestoDelProfesor) {
		this.puestoDelProfesor = puestoDelProfesor;
	}
	public Set<PuestoDeTrabajo> getPuestosDeAlumnos() {
		return puestosDeAlumnos;
	}
	public void setPuestosDeAlumnos(Set<PuestoDeTrabajo> puestosDeAlumnos) {
		this.puestosDeAlumnos = puestosDeAlumnos;
	}

}
