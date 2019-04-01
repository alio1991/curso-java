package com.curso.java.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.curso.java.ejercicio01negocio.AulasLN;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/patatas", "/limones" })
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;

	@Override
	public void init() throws ServletException {

		ApplicationContext applicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 
		 * 
		 * request.setAttribute("mensajeSingleton",
		 * context.getBean("mensajeSingleton"));
		 * request.setAttribute("mensajePrototype",
		 * context.getBean("mensajePrototype")); request.setAttribute("mensajeRequest",
		 * context.getBean("mensajeRequest")); request.setAttribute("mensajeSession",
		 * context.getBean("mensajeSession"));
		 * getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request,
		 * response);
		 * 
		 */

		// --------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------

		AulasLN aulaLN = context.getBean(AulasLN.class);

		@SuppressWarnings("unchecked")
		Set<PuestoDeTrabajo> puestos1 = context.getBean(Set.class);
		@SuppressWarnings("unchecked")
		Set<PuestoDeTrabajo> puestos2 = context.getBean(Set.class);
		PuestoDeTrabajo p0 = context.getBean(PuestoDeTrabajo.class);
		PuestoDeTrabajo p1 = new PuestoDeTrabajo();
		PuestoDeTrabajo p2 = new PuestoDeTrabajo();
		PuestoDeTrabajo p3 = new PuestoDeTrabajo();
		PuestoDeTrabajo p4 = new PuestoDeTrabajo();
		PuestoDeTrabajo p5 = new PuestoDeTrabajo();
		PuestoDeTrabajo p6 = new PuestoDeTrabajo();
		puestos1.add(p0);
		puestos1.add(p1);
		puestos1.add(p2);
		puestos1.add(p3);
		puestos2.add(p4);
		puestos2.add(p5);
		puestos2.add(p6);

		Aula aula1 = new Aula("Aula01", true, true, puestos1);
		Aula aula2 = new Aula("Aula02", true, true, puestos2);
		try {
			aulaLN.nuevoAula(aula1);
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			aulaLN.nuevoAula(aula2);
		} catch (Exception e) {
			e.getMessage();
		}

		Alumno alumno1 = context.getBean("Alumno", Alumno.class);
		request.setAttribute("alumno1", alumno1);
		Alumno alumno2 = new Alumno("Juan");
		request.setAttribute("alumno2", alumno2);
		Alumno alumno3 = new Alumno("Manu");
		request.setAttribute("alumno3", alumno3);
		Alumno alumno4 = new Alumno("Raul");
		request.setAttribute("alumno4", alumno4);
		Alumno alumno5 = new Alumno("David");
		request.setAttribute("alumno5", alumno5);
		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno1);
		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno2);
		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno3);
		aulaLN.asignarAlumnoAAula(aula2.getNombre(), alumno4);
		aulaLN.asignarAlumnoAAula(aula2.getNombre(), alumno5);
		List<Aula> aulas = new ArrayList<Aula>();
//		List<Aula> aulas = context.getBean(List.class);
		aulas.add(aula1);
		aulas.add(aula2);
		@SuppressWarnings("unchecked")
		Map<String, Collection<Alumno>> aulasMap = context.getBean(HashMap.class);
		aulasMap = aulaLN.getAlumnosPorAula(aulas);

		int i = 1;
		int j = 1;
		for (Aula a : aulas) {
			request.setAttribute("aula" + Integer.toString(j), a);
			j++;
			// i=1;
			System.out.println("");
			System.out.println(a.getNombre());
			for (Alumno al : aulasMap.get(a.getNombre())) {
				System.out.print("-");
				System.out.println(al.getNombre());
				request.setAttribute("alumno" + Integer.toString(i), al);
				i++;
			}
		}

		aulaLN.eliminarAula(aula2.getNombre());
		aulas = (List<Aula>) aulaLN.getAulas();
		aulasMap = aulaLN.getAlumnosPorAula(aulas);

		System.out.println("---------------------ELIMINO AULA01------------------------");

		for (Aula a : aulas) {
			System.out.println("");
			System.out.println(a.getNombre());
			for (Alumno al : aulasMap.get(a.getNombre())) {
				System.out.print("-");
				System.out.println(al.getNombre());
			}
		}

		aulaLN.asignarAlumnoAAula(aula1.getNombre(), alumno5);
		aulas = (List<Aula>) aulaLN.getAulas();
		aulasMap = aulaLN.getAlumnosPorAula(aulas);

		// --------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------

		request.setAttribute("alumno_extra", context.getBean("Alumno"));
		// request.setAttribute("alumno", alumno5);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);

	}

}
