package ejemplo05beans.beans6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans6.xml");
	}
	public static void main(String[] args) {
		Coche yaris = context.getBean("toyotaYaris",Coche.class);
		System.out.println(yaris);
		
	}
}
