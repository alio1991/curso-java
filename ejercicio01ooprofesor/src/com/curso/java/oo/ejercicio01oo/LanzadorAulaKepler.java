package com.curso.java.oo.ejercicio01oo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class LanzadorAulaKepler {

	public static void main(String[] args) {
		
		Aula aula = new Aula("Kepler", true, true,new HashSet<PuestoDeTrabajo>());
		aula.setPuestoDelProfesor(new PuestoDeTrabajo(true));
		for(int i = 0 ;i< 14;i++) {
			aula.getPuestosDeAlumnos().add(new PuestoDeTrabajo(true));
		}	
		aula.getPuestosDeAlumnos().add(new PuestoDeTrabajo(false));
		System.out.println("algo");
		aula.setPuestosDeAlumnos(aula.getPuestosDeAlumnos());
		aula.getPuestoDelProfesor().setPersona(new Profesor());
		Set<PuestoDeTrabajo> puestos = aula.getPuestosDeAlumnos();
		Iterator<PuestoDeTrabajo> iterador = puestos.iterator();
		int numeroDeAlumnos = 12;
		while(iterador.hasNext() && numeroDeAlumnos > 0) {
			PuestoDeTrabajo puestoActual = iterador.next();
			if( puestoActual.isOrdenador()) {
				puestoActual.setPersona(new Alumno());
				numeroDeAlumnos--;
			}
		}
		//aula.getPuestosDeAlumnos().stream().filter(predicate).
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
