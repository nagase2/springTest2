package test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext context = new ClassPathXmlApplicationContext("test4/beans.xml");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		
		System.out.println(jungle);
	
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
