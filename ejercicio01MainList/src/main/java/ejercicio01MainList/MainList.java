package ejercicio01MainList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.*;

public class MainList {
	
	
	public static void main(String[] args) {
		
	
	Set<PuestoDeTrabajo>puestos = new HashSet<PuestoDeTrabajo>();
	PuestoDeTrabajo p0 = new PuestoDeTrabajo(true);
	PuestoDeTrabajo p1 = new PuestoDeTrabajo(true);
	PuestoDeTrabajo p2 = new PuestoDeTrabajo(true);
	PuestoDeTrabajo p3 = new PuestoDeTrabajo(true);
	PuestoDeTrabajo p4 = new PuestoDeTrabajo(true);
	PuestoDeTrabajo p5 = new PuestoDeTrabajo(true);
	PuestoDeTrabajo p6 = new PuestoDeTrabajo(true);
	puestos.add(p0);
	puestos.add(p1);
	puestos.add(p2);
	puestos.add(p3);
	puestos.add(p4);
	puestos.add(p5);
	puestos.add(p6);
	
	Aula aula = new Aula("Alio",true, true,puestos);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
