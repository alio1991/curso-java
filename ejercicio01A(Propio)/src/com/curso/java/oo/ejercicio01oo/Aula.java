package com.curso.java.oo.ejercicio01oo;
import java.util.ArrayList;

public class Aula {
	
	private String nombre;
	private int numMesas;
	private int numSillas;
	private ArrayList<Alumno>alumnos;
	private Profesor profesor;
	private boolean puestoProfesor;
	private ArrayList<Computadora>ordenadores;
	private int proyectores;
	private boolean pizarra;

	
	public Aula(String nombre, int numMesas, int numSillas, ArrayList<Alumno>alumnos, Profesor profesor, 
				boolean puestoProfesor, ArrayList<Computadora>ordenadores, int proyectores, boolean pizarra) {
		this.nombre = nombre;
		this.numMesas = numMesas;
		this.numSillas = numSillas;
		this.alumnos=alumnos;
		this.profesor=profesor;
		this.puestoProfesor = puestoProfesor;
		this.ordenadores=ordenadores;
		this.proyectores=proyectores;
		this.pizarra=pizarra;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumMesas() {
		return numMesas;
	}

	public int getNumSillas() {
		return numSillas;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public boolean isPuestoProfesor() {
		return puestoProfesor;
	}

	public ArrayList<Computadora> getOrdenadores() {
		return ordenadores;
	}



	public boolean isPizarra() {
		return pizarra;
	}

	public int getProyectores() {
		return proyectores;
	}

	
	
}
