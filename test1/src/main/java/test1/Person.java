package test1;

public class Person {
	private String name;
	private int id;

	private int taxId;
	private Address address;

	public Person() {

	}
	public static Person getInstance(int id, String name){
		System.out.println("Creating Person usting factory method");
		return new Person(id,name);
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void onCreate(){
		System.out.println("Person created:" + this);
	}
	
	public void onDestroy(){
		System.out.println("Peron destroied");
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void speak() {
		System.out.println("I'm a person");
	}
	


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", taxId=" + taxId
				+ ", adress=" + address + "]";
	}




}
