package ejercicio01dao;

import java.util.Collection;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public interface IAulaDao {

	Collection<Aula> getAulas();
	void updateAula(Aula aula);
	void deleteAula(String nombreAula);
	void createAula(Aula aula);
	Aula getAula(String nombreAula);
	
}
