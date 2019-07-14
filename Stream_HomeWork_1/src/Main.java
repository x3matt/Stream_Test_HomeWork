import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Address a1 = new Address("Pushkina" , 23);
		Person p1 = new Person("p1",18,a1);
		
		Address a2 = new Address("Bazarova" , 217);
		Person p2 = new Person("p2",65,a2);
		
		Address a3 = new Address("Levkina" , 2);
		Person p3 = new Person("p3",12,a3);
		
		Address a4 = new Address("Alexia" , 5);
		Person p4 = new Person("p4",32,a4);
		
		List<Person> input = Arrays.asList(p1,p2,p3,p4);
		
		System.out.println(get17YOaddress(input));
	}
	public static List<Address> get17YOaddress(List<Person> input){
		return input.stream()
				.filter(p -> p.getAge() > 17)
				.map(p -> p.getAddress())
				.collect(Collectors.toList());
	}
}
