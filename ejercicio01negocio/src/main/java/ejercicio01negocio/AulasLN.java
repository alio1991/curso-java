package ejercicio01negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio01dao.IAulaDao;

public class AulasLN {

	
	private IAulaDao aulaDao;

	public AulasLN(IAulaDao aulaDao) {
		this.aulaDao = aulaDao;
	}

	public Aula nuevoAula(String nombre, boolean proyector, boolean pizarra, Set<PuestoDeTrabajo> puestosDeAlumnos) {
		Aula aula = new Aula(nombre, proyector, pizarra, puestosDeAlumnos);
		aulaDao.createAula(aula);
		return aulaDao.getAula(nombre);
	}
	
	/**
	 * 
	 * @param nombre de Aula
	 * @return Lista con los Alunos de un aula
	 */
	private Collection<Alumno> getAlumnosDeAula(String nombre){
		List<Alumno>lista = new ArrayList<Alumno>();
		for(PuestoDeTrabajo puesto: aulaDao.getAula(nombre).getPuestosDeAlumnos()) {
			if (puesto.getPersona() instanceof Alumno) {
				lista.add((Alumno)puesto.getPersona());
			}
			
		}
		return lista;
	}
	
	/**
	 * 
	 * @param aulas
	 * @return Mapa de listas de alumnos(V) por aula(K)
	 */
	public Map<String,Collection<Alumno>> getAlumnosPorAula(Collection<Aula>aulas){
		Map<String,Collection<Alumno>> mapa = new HashMap<String,Collection<Alumno>>();
		for(Aula aula: aulas) {
			mapa.put(aula.getNombre(), getAlumnosDeAula(aula.getNombre()));
		}
		return mapa;
	}
	
	
	/**
	 * 
	 * @param aulas
	 * @return lista con una lista de Profesores por aula
	 */
	public Map<String,Collection<Profesor>> getProfesoresPorAula(Collection<Aula>aulas){
		Map<String,Collection<Profesor>> mapa = new HashMap<String,Collection<Profesor>>();
		List<Profesor>lista = new ArrayList<Profesor>();
		
		for(Aula aula: aulas) {
			if(profesoresAlumnos(aulaDao.getAula(aula.getNombre()).getPuestosDeAlumnos())!=null){
				for(Profesor profe: profesoresAlumnos(aulaDao.getAula(aula.getNombre()).getPuestosDeAlumnos())) {
					lista.add(profe);
				}
			}
			if(aula.getPuestoDelProfesor().getPersona()!=null) {
				lista.add((Profesor) aula.getPuestoDelProfesor().getPersona());
			}
			mapa.put(aula.getNombre(), lista);
		}
		return mapa;
	}
	
	/**
	 * 
	 * @param lista de alumnos
	 * @return Lista con los profesores que son alumnos
	 */
	private List<Profesor> profesoresAlumnos(Set<PuestoDeTrabajo>listaPuestos) {
		List<Profesor>listaProfesores = new ArrayList<Profesor>();
		
		for(PuestoDeTrabajo p: listaPuestos) {
			if (p.getPersona() instanceof Profesor) {
			listaProfesores.add((Profesor) p.getPersona());
			}
		}
		return listaProfesores;
	}
	
	public void asignarAlumnoAAula(String nombreAula, Alumno alumno) {
		
		Aula aula = aulaDao.getAula(nombreAula);
		Set<PuestoDeTrabajo> puestos = aula.getPuestosDeAlumnos();
		
		for(PuestoDeTrabajo p: puestos){
			if(p.getPersona()==null) {
				p.setPersona(alumno);
			}
			return;
		}
		throw new NullPointerException("No se ha podido a�adir al alumno, no hay sitio.");
	}
	
	public void eliminarAula(String nombreAula) {
		
		aulaDao.deleteAula(nombreAula);
		
	}
	
}
