package com.curso.java.ejercicio01dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;

@Repository
public class ListDAO implements IAulaDao {
	@Autowired
	@Qualifier("listaDeAulas")
	private List<Aula> aulas;

	public Collection<Aula> getAulas() {
		return aulas;
	}

	public Boolean updateAula(Aula aula) {
		if (buscaAula(aula.getNombre()) != null) {
			aulas.remove(buscaAula(aula.getNombre()));
			aulas.add(aula);
			if (buscaAula(aula.getNombre()) == aula) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public Boolean deleteAula(String nombreAula) {
		Aula aux = buscaAula(nombreAula);
		if (aux != null) {
			aulas.remove(aux);
			return true;
		}
		// throw new NullPointerException("El elemento no se encuentra guardado, no ha
		// sido posible eliminarlo.");
		return false;
	}

	public boolean createAula(Aula aula) {
		if (aulas == null || aulas.isEmpty() || !aulas.contains(aula)) {
			aulas.add(aula);
			if (buscaAula(aula.getNombre()).equals(aula)) {
				return true;
			}

		}

		// throw new Exception("Ese aula ya existe.");
		return false;
	}

	public Aula getAula(String nombreAula) {
		Aula aux = buscaAula(nombreAula);
		if (aux != null) {
			return aux;
		}
		return null;
	}

	private Aula buscaAula(String nombre) {
		if (!aulas.isEmpty()) {
			for (Aula a : aulas) {
				if (a.getNombre() == nombre) {
					return a;
				}
			}
		}
		return null;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
		// System.out.println(aulas.getClass());
	}

}
