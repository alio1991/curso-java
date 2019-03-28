package ejemplo05beans.beans2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	
	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans2.xml");
	}
	public static void main(String[] args) {
		Personilla marianico = context.getBean("marianico",Personilla.class);
		System.out.println(marianico);
		
		Personilla personillaUno = 
				context.getBean("miPrototipoDePersonilla",Personilla.class);
		Personilla personillaDos = 
				context.getBean("miPrototipoDePersonilla",Personilla.class);
		Personilla personillaTres = 
				context.getBean("miPrototipoDePersonilla",Personilla.class);
		
		List<Personilla> listaDePersonillas = context.getBean("listaPersonas",List.class);
		listaDePersonillas.add(personillaUno);
		listaDePersonillas.add(personillaDos);
		listaDePersonillas.add(personillaTres);
		
		vamosAMostrarLaLista();
	}
	private static void vamosAMostrarLaLista() {
		List<Personilla> listaDePersonillas = context.getBean("listaPersonas",List.class);
		System.out.println(listaDePersonillas);
	}
}
