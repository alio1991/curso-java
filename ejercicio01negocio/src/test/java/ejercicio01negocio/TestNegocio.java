package ejercicio01negocio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.curso.java.ejercicio01dao.IAulaDao;
import com.curso.java.ejercicio01dao.ListDAO;
import com.curso.java.ejercicio01negocio.AulasLN;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class TestNegocio {
	
	ListDAO dao;
	AulasLN nodo;
	List<Aula>aulas;
	Map<String,Collection<Alumno>>alumnosM;
	List<Alumno>alumnos;
	Aula aula;
	Alumno alumno;
	@Before
	public void previo() {
		dao = new ListDAO();
		dao.setAulas(new ArrayList<Aula>());
		
		nodo = new AulasLN();
		nodo.setAulaDao(dao);
		Set<PuestoDeTrabajo> puestos = new HashSet<PuestoDeTrabajo>();
		alumno = new Alumno("pepe");
		PuestoDeTrabajo puesto = new PuestoDeTrabajo();
		puestos.add(puesto);
		aula = new Aula("Aula1", true, true, puestos);
		aulas = (List<Aula>) nodo.getAulas();
		alumnos = new ArrayList<Alumno>();
		alumnosM= new HashMap<String,Collection<Alumno>>();
		aulas.add(aula);
		alumnos.add(alumno);
		alumnosM.put(aula.getNombre(),(List<Alumno>)alumnos);

	}
	@Test
	public void test() {
		assertEquals(aula, nodo.nuevoAula(aula));
		assertTrue(nodo.asignarAlumnoAAula(aula.getNombre(), alumno));
		//System.out.println(alumnosM);
		//System.out.println(nodo.getAlumnosPorAula(aulas));
		assertEquals(alumnosM, nodo.getAlumnosPorAula(aulas));
	}

	@After
	public void despues() {
		assertTrue(nodo.eliminarAula(aula.getNombre()));
	}
	
	
	
	
}
