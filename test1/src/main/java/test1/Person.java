package test1;

public class Person {
	private String name;
	private int id;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public void speak(){
		System.out.println("I'm a person");
	}
}
