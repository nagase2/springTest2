package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext context = new ClassPathXmlApplicationContext("test2/beans/beans.xml");
		
		FruitBasket basket = (FruitBasket)context.getBean("basket");
		System.out.println(basket);
	
		
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
