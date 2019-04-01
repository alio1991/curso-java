package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component(value = "El profe")
//@Scope(value = "prototype")
public class Profesor extends Persona {
	private Boolean malaLeche;

	public Boolean isMalaLeche() {
		return malaLeche;
	}

	public void setMalaLeche(boolean malaLeche) {
		this.malaLeche = malaLeche;
	}
}
