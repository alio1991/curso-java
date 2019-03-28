package com.curso.java.ejercicio01dao;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapDAO implements IAulaDao{
	Map<String,Aula>aulas = new HashMap<String,Aula>();
	
	public Collection<Aula> getAulas(){
		return aulas.values();
	}
	
	public void updateAula(Aula aula) {
		if(aulas.containsKey(aula.getNombre())) {
			aulas.remove(aula.getNombre());
			aulas.put(aula.getNombre(),aula);
		}
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