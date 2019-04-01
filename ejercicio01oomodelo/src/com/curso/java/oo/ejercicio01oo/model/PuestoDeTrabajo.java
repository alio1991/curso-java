package com.curso.java.oo.ejercicio01oo.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PuestoDeTrabajo implements Serializable {
	private static final long serialVersionUID = -3743281008339211890L;
	@Value("true")
	private Boolean ordenador;
	@Value("true")
	private Persona persona;
	
//	public PuestoDeTrabajo(Boolean ordenador) {
//		this.ordenador = ordenador;
//	}
	public Boolean isOrdenador() {
		return ordenador;
	}
	public void setOrdenador(boolean ordenador) {
		this.ordenador = ordenador;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
