package ejemplo06anotaciones.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ejemplo06anotaciones.modelo.Pelicula;

@Repository
public class PeliculasDAO {

	@Autowired
	@Qualifier("peliculas")
	private List<Pelicula> peliculas;

	public boolean savePelicula(Pelicula pelicula) {
		return peliculas.add(pelicula);
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
}
