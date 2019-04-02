package com.curso.java.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.curso.java.web.model.MensajeChulo;

@Controller
@Scope("request")
public class ControladorDeSpringMVC {
	
	@Autowired
	private MensajeChulo mensajeChulo;
	
	@RequestMapping("verFormularioSpringMVC")
	public ModelAndView verFormulario() {
		//Llamo al negocio y en el model and view le pongo  los datos.
		return new ModelAndView("formularioSpringMVC");
	}
	
	@RequestMapping("mensajeChulo")
	public ModelAndView miraMensajeChulo(
			@RequestParam("nombre") String nombre, 
			HttpServletRequest request) {
		System.out.println("El nombre es : " + nombre);
		System.out.println("Desde la request : " + request.getParameter("nombre"));
		mensajeChulo.setNombre(nombre);
		mensajeChulo.setDescripcion("El nombre es : " + nombre);
		
		ModelAndView modelAndView = new ModelAndView("mensajeChulo");
		modelAndView.addObject("mensajeChulo",mensajeChulo);
		return modelAndView;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
