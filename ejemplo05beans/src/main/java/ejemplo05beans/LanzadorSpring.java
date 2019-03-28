package ejemplo05beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		
		MorcillaDeLeon morcilla = (MorcillaDeLeon)applicationContext.getBean("morcillaDeLeon");
		System.out.println(morcilla);
		morcilla.setColor("Verde oscuro");
		morcilla.setSabor("Esta que te mueres");
		MorcillaDeLeon morcilla2 = (MorcillaDeLeon)applicationContext.getBean("morcillaDeLeon");
		
		System.out.println(morcilla2);
	}
}
