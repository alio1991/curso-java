package com.curso.java.ejercicio01dao;

import java.util.Collection;
import java.util.List;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class ListDAO implements IAulaDao {
	private List<Aula>aulas;
	
	public Collection<Aula> getAulas(){
		return aulas;
	}
	
	public void updateAula(Aula aula) {
		if(buscaAula(aula.getNombre())!=null) {
			aulas.remove(buscaAula(aula.getNombre()));
			aulas.add(aula);
		}
	}
	
	public void deleteAula(String nombreAula) {
		Aula aux = buscaAula(nombreAula);
		if(aux!=null) {
			aulas.remove(aux);
			return;
		}
		throw new NullPointerException("El elemento no se encuentra guardado, no ha sido posible eliminarlo.");
	}
	
	public void createAula(Aula aula) throws Exception {
		
		if(!aulas.contains(aula)) {
			aulas.add(aula);
			return;
		}
		throw new Exception("Ese aula ya existe.");
	}
	
	public Aula getAula(String nombreAula) {
		Aula aux = buscaAula(nombreAula);
		if(aux!=null) {
			return aux;
		}
		return null;
	}
	
	private Aula buscaAula(String nombre) {
		if(!aulas.isEmpty()) {
			for(Aula a: aulas) {
				if(a.getNombre()==nombre) {
					return a;
				}
			}
		}
		return null;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
		//System.out.println(aulas.getClass());
	}
	
}
