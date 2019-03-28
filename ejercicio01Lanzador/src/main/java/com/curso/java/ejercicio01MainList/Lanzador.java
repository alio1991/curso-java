package com.curso.java.ejercicio01MainList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.curso.java.ejercicio01negocio.AulasLN;
import com.curso.java.oo.ejercicio01oo.model.*;

public class Lanzador {

	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void main(String[] args) {

		AulasLN aulaLN = context.getBean("aulaLN", AulasLN.class);

		Set<PuestoDeTrabajo> puestos1 = new HashSet<PuestoDeTrabajo>();
		Set<PuestoDeTrabajo> puestos2 = new HashSet<PuestoDeTrabajo>();
		PuestoDeTrabajo p0 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo p1 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo p2 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo p3 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo p4 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo p5 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo p6 = new PuestoDeTrabajo(true);
		puestos1.add(p0);
		puestos1.add(p1);
		puestos1.add(p2);
		puestos1.add(p3);
		puestos2.add(p4);
		puestos2.add(p5);
		puestos2.add(p6);

		Aula aula1 = new Aula("Aula01", true, true, puestos1);
		Aula aula2 = new Aula("Aula02", true, true, puestos2);
		try {
			aulaLN.nuevoAula(aula1);
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			aulaLN.nuevoAula(aula2);
		} catch (Exception e) {
			e.getMessage();
		}

		Alumno alumno1 = new Alumno("Pepe");
		Alumno alumno2 = new Alumno("Juan");
		Alumno alumno3 = new Alumno("Manu");
		Alumno alumno4 = new Alumno("Raul");
		Alumno alumno5 = new Alumno("David");
		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno1);
		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno2);
		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno3);
		aulaLN.asignarAlumnoAAula(aula2.getNombre(), alumno4);
		aulaLN.asignarAlumnoAAula(aula2.getNombre(), alumno5);
		List<Aula> aulas = new ArrayList<Aula>();
		aulas.add(aula1);
		aulas.add(aula2);
		Map<String, Collection<Alumno>> aulasMap = new HashMap<String, Collection<Alumno>>();
		aulasMap = aulaLN.getAlumnosPorAula(aulas);

		for (Aula a : aulas) {
			System.out.println("");
			System.out.println(a.getNombre());
			for (Alumno al : aulasMap.get(a.getNombre())) {
				System.out.print("-");
				System.out.println(al.getNombre());
			}
		}

		aulaLN.eliminarAula(aula2.getNombre());
		aulas = (List<Aula>) aulaLN.getAulas();
		aulasMap = aulaLN.getAlumnosPorAula(aulas);

		System.out.println("---------------------ELIMINO AULA01------------------------");

		for (Aula a : aulas) {
			System.out.println("");
			System.out.println(a.getNombre());
			for (Alumno al : aulasMap.get(a.getNombre())) {
				System.out.print("-");
				System.out.println(al.getNombre());
			}
		}

		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno5);
		aulas = (List<Aula>) aulaLN.getAulas();
		aulasMap = aulaLN.getAlumnosPorAula(aulas);

		System.out.println("-------------------AÑADO A DAVID AL AULA01--------------------------");

		for (Aula a : aulas) {
			System.out.println("");
			System.out.println(a.getNombre());
			for (Alumno al : aulasMap.get(a.getNombre())) {
				System.out.print("-");
				System.out.println(al.getNombre());
			}
		}
	}
}
