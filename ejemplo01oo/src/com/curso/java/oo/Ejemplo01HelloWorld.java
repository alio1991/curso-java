package com.curso.java.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.model.CargoDePolicia;
import com.curso.java.oo.model.Persona;
import com.curso.java.oo.model.Policia;
import com.curso.java.oo.model.PoliciaDeLosDeLasPorras;
import com.curso.java.oo.model.PoliciaPistolero;

public class Ejemplo01HelloWorld {

	public static void main(String[]args) {
		
		String miCadena = "Hello World";
		System.out.println(miCadena);
		Persona.algoExplicito = "ss";
		Persona persona = new Persona();
		persona.setNombre("Rubencillo");
		//persona.algoExplicito = "Es de rubencillo";
		Persona persona2 = new Persona();
		persona2.setNombre("Otro nombre");
		
		Persona persona3 = new PoliciaDeLosDeLasPorras();
		PoliciaDeLosDeLasPorras poliPorrero = (PoliciaDeLosDeLasPorras) persona3;
		
		Policia policia = new Policia();
		policia.setCargo(CargoDePolicia.RASO);
		//PoliciaDeLosDeLasPorras otroPorrero = (PoliciaDeLosDeLasPorras) policia;
		
		
		Set<Policia> setDePolicias = new HashSet<Policia>();
		//setDePolicias.add(poliPorrero);
		setDePolicias.add((Policia)persona3); //Lo mismo que la linea comentada, parte desde el mismo objeto
		setDePolicias.add(new PoliciaPistolero());
		//System.out.println(setDePolicias.size());
		
		List<Policia> lista = new ArrayList<Policia>();
		lista.add(poliPorrero);
		lista.add((Policia)persona3); //Lo mismo que la linea comentada, parte desde el mismo objeto
		lista.add(new PoliciaPistolero());
		//System.out.println(lista.size());
		
		Map<String, Persona> mapa = new HashMap<String, Persona>();
		mapa.put("ROJO", policia); //el dato es pisado si se repite la clave.
		mapa.put("VERDE", poliPorrero);
		mapa.put("ROJO", poliPorrero);
		//System.out.println(poliPorrero);
		//System.out.println(mapa.get("ROJO"));
	}
	
	
	
	
}
