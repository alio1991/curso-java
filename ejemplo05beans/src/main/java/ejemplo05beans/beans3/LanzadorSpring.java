package ejemplo05beans.beans3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans3.xml");
	}
	public static void main(String[] args) {
		Coche yaris = context.getBean("toyotaYaris",Coche.class);
		System.out.println(yaris);
		Coche audi = context.getBean("audiA4",Coche.class);
		System.out.println(audi);
	}
}
