package com.curso.java.oo.ejercicio01oo;

public class Computadora {

	private double rendimiento;
	private String sistemaOperativo;
	
	public Computadora(double rendimiento, String sistemaOperativo) {
		super();
		this.rendimiento = rendimiento;
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public double getRendimiento() {
		return rendimiento;
	}
	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
}
