
public class Person {

	String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
