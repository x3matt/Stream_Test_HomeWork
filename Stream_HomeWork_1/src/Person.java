
public class Person {

	String name;
	int age;
	Address address;
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
