package ejemplo06anotaciones.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejemplo06anotaciones.dao.PeliculasDAO;
import ejemplo06anotaciones.modelo.Pelicula;

@Service
public class NegocioPelis {

	@Autowired
	private PeliculasDAO peliculasDao;

	public boolean guardala(Pelicula peli) {
		return peliculasDao.savePelicula(peli);
	}

	public List<Pelicula> aVerLoQueTengo() {
		return peliculasDao.getPeliculas();
	}
}
