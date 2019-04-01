package com.curso.java.oo.ejercicio01oo.model;

import java.io.Serializable;
import java.util.Set;

//@Component(value = "El Aula")
//@Scope(value = "prototype")
public class Aula implements Serializable {
	private static final long serialVersionUID = 7504501822267907447L;
	//@Value("AulaXX")
	private String nombre;
	//@Value("true")
	private Boolean proyector;
	//@Value("true")
	private Boolean pizarra;
	private PuestoDeTrabajo puestoDelProfesor;
	//@Autowired
	//@Qualifier("puestosDeAlumnos")
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
	public Boolean isProyector() {
		return proyector;
	}
	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}
	public Boolean isPizarra() {
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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
