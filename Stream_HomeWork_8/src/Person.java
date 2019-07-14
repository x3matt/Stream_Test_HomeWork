import java.util.List;

public class Person {

	String name;
	List<String> banAccounts;
	
	public Person(String name, List<String> banAccounts) {
		super();
		this.name = name;
		this.banAccounts = banAccounts;
	}
	public String getName() {
		return name;
	}
	public List<String> getBanAccounts() {
		return banAccounts;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", banAccounts=" + banAccounts + "]";
	}
	
	
}
