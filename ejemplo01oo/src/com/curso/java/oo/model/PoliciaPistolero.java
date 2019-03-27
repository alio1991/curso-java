package com.curso.java.oo.model;

public class PoliciaPistolero extends Policia  implements PuedeDisparar{

	private String pistola;

	public String getPistola() {
		return pistola;
	}

	public void setPistola(String pistola) {
		this.pistola = pistola;
	}
	
	@Override
	public void dispararSinJuicio(String objetivo) {
		System.out.println("Disparando con "+pistola+" a "+ objetivo);
	}
}
