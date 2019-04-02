package com.curso.java.ejercicio01dao;

import java.util.Collection;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public interface IAulaDao {

	Collection<Aula> getAulas();
	Boolean updateAula(Aula aula);
	Boolean deleteAula(String nombreAula);
	boolean createAula(Aula aula);
	Aula getAula(String nombreAula);
	
}
