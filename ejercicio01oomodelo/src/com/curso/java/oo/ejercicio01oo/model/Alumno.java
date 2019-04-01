package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Alumno")
@Scope("prototype")
public class Alumno extends Persona {
	
	@Value("true")
	private Boolean subvencionado;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre) {
		super(nombre);
	}

	

	public Boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}
}
