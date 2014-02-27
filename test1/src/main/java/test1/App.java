package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext context = new ClassPathXmlApplicationContext("test1/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		person.speak();
		
		Address address = (Address) context.getBean("address");
		
		System.out.println(person);
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
