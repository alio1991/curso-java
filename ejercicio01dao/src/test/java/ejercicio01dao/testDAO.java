package ejercicio01dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.curso.java.ejercicio01dao.ListDAO;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class testDAO {
	ListDAO dao;
	Aula aula;
	@Before
	public void previo() {
		dao = new ListDAO();
		dao.setAulas(new ArrayList<Aula>());
		Set<PuestoDeTrabajo> puestos = new HashSet<PuestoDeTrabajo>();
		Alumno alumno = new Alumno("pepe");
		PuestoDeTrabajo puesto = new PuestoDeTrabajo();
		puesto.setPersona(alumno);
		puestos.add(puesto);
		aula = new Aula("Aula1", true, true, puestos);

	}
	@Test
	public void test() {
		assertTrue(dao.createAula(aula));
		assertTrue(dao.updateAula(dao.getAula(aula.getNombre())));
	}

	@After
	public void despues() {
		assertTrue(dao.deleteAula(aula.getNombre()));
	}
}
