package ejercicio01dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class ListDAO implements IAulaDao {
	List<Aula>aulas = new ArrayList<Aula>();
	
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
	
	public void createAula(Aula aula) {
		Aula aux = buscaAula(aula.getNombre());
		if(aux==null) {
			aulas.add(aux);
			return;
		}
		throw new NullPointerException("Ese aula ya existe.");
	}
	
	public Aula getAula(String nombreAula) {
		Aula aux = buscaAula(nombreAula);
		if(aux!=null) {
			return aux;
		}
		throw new NullPointerException("Ese aula ya existe.");
	}
	
	private Aula buscaAula(String nombre) {
		for(Aula a: aulas) {
			if(a.getNombre()==nombre) {
				return a;
			}
		}
		return null;
	}


}
