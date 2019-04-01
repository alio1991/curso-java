package ejemplo06anotaciones.modelo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "elDire")
@Scope(value = "prototype")
public class Director {
	private String nombre;
	private String nacionalidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}

}
