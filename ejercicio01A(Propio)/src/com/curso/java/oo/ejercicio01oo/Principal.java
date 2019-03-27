package com.curso.java.oo.ejercicio01oo;
import java.util.ArrayList;

public class Principal {

	
	public static void main(String[]args) {
		
		//int numMesas, int numSillas, ArrayList<Alumno>alumnos, Profesor profesor, 
		//boolean puestoProfesor, ArrayList<Computadora>ordenadores, boolean proyector, boolean pizarra
		String nombre = "Kepler";
		int numMesas = 9;
		int numSillas = 15;
		boolean puestoProfesor = true;
		int proyectores = 1;
		boolean pizarra = true;
		Profesor profesor = new Profesor("Pepito", "72345672R", 14);
		
		ArrayList<Alumno>alumnos = new ArrayList<Alumno>();
		ArrayList<Computadora>ordenadores = new ArrayList<Computadora>();
		
		Computadora pc1 = new Computadora(200, "Windows 10");
		Computadora pc2 = new Computadora(500, "Linux 12.2");
		ordenadores.add(pc1);
		ordenadores.add(pc2);
		
		Alumno alumno1 = new Alumno("Juan", "134566794D", Estudios.GRADUADO);
		Alumno alumno2 = new Alumno("Paco", "724568794T", Estudios.DOCTORADO);
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		
		Aula aula = new Aula(nombre, numMesas, numSillas, alumnos, profesor, puestoProfesor, ordenadores, proyectores, pizarra);
		
		String puesto = "carece";
		if(aula.isPuestoProfesor()) {
			puesto = "consta";
		}
		

		System.out.println("El aula "+aula.getNombre()+" consta de "+aula.getAlumnos().size()+" Alumnos");
		System.out.println("Tiene "+aula.getNumMesas()+" mesas, "+aula.getNumSillas()+" sillas, "+ aula.getProyectores()+ " proyector/es y "+puesto+" de puesto de trabajo para el profesor.");
		
	}
}
