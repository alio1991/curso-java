package ejemplo05beans.beans5;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans5.xml");
	}
	public static void main(String[] args) {
		System.out.println(context.getBean("listaDePeliculas",List.class));
		System.out.println(context.getBean("coleccionDeColores",Collection.class));
		System.out.println(context.getBean("mapaDeLibros",Map.class));
		
	}
}
