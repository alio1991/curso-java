package com.curso.java.ejercicio01dao;


import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;

//@Repository
public class MapDAO implements IAulaDao{

	private Map<String,Aula>aulas;
	
	public Collection<Aula> getAulas(){
		return aulas.values();
	}
	
	public void updateAula(Aula aula) {
		if(aulas.containsKey(aula.getNombre())) {
			aulas.remove(aula.getNombre());
			aulas.put(aula.getNombre(),aula);
		}
	}
	
	public void setAulas(Map<String, Aula> aulas) {
		this.aulas = aulas;
	}

	public void deleteAula(String nombreAula) {
		if(aulas.containsKey(nombreAula)) {
			aulas.remove(nombreAula);
			return;
		}
		throw new NullPointerException("El elemento no se encuentra guardado, no ha sido posible eliminarlo.");
	}
	
	public void createAula(Aula aula) {
		
		if(aulas.get(aula.getNombre()) == null) {
			aulas.put(aula.getNombre(), aula);
			return;
		}
		throw new NullPointerException("Ese aula ya existe.");
	}
	
	public Aula getAula(String nombreAula) {
		return aulas.get(nombreAula);
	}
	
	
}
