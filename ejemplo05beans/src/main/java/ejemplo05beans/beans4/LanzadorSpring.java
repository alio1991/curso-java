package ejemplo05beans.beans4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans4.xml");
	}
	public static void main(String[] args) {
		CocheConConstructor yaris = context.getBean("toyotaYaris",CocheConConstructor.class);
		System.out.println(yaris);
		CocheConConstructor audi = context.getBean("audiA4",CocheConConstructor.class);
		System.out.println(audi);
	}
}
