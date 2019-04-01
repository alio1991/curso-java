package com.curso.java.oo.ejercicio01oo.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Persona  implements Serializable {
	private static final long serialVersionUID = -4714702641435435419L;
	@Value("Pepito")
	private String nombre;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
