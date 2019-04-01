package com.curso.java.ejercicio01MainList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.java.ejercicio01negocio.AulasLN;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class Lanzador {

	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		AulasLN aulaLN = context.getBean(AulasLN.class);
		
		
		Set<PuestoDeTrabajo> puestos1 = context.getBean(Set.class);
		Set<PuestoDeTrabajo> puestos2 = context.getBean(Set.class);
		PuestoDeTrabajo p0 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo p1 = new PuestoDeTrabajo();
		PuestoDeTrabajo p2 = new PuestoDeTrabajo();
		PuestoDeTrabajo p3 = new PuestoDeTrabajo();
		PuestoDeTrabajo p4 = new PuestoDeTrabajo();
		PuestoDeTrabajo p5 = new PuestoDeTrabajo();
		PuestoDeTrabajo p6 = new PuestoDeTrabajo();
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

		Alumno alumno1 = context.getBean("Alumno",Alumno.class);
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
//		List<Aula> aulas = context.getBean(List.class);
		aulas.add(aula1);
		aulas.add(aula2);
		Map<String, Collection<Alumno>> aulasMap = context.getBean(HashMap.class);
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

		System.out.println("-------------------A�ADO A DAVID AL AULA01--------------------------");

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
