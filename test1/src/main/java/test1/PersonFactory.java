package test1;

public class PersonFactory {
	public Person createPerson(int id,String name){
		System.out.println("Using factory to create person.Factory");
		return new Person(id, name);
		
	}
}
