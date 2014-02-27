package test1;

public class Person {
	private String name;
	private int id;

	private int taxId;
	private Address address;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
