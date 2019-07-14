import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("p1",20);
		Person p2 = new Person("p2",21);
		Person p3 = new Person("p3",22);
		Person p4 = new Person("p4",22);
	List<Person> input = Arrays.asList(p1,p2,p3,p4);
	System.out.println(getPersonsByAge(input));
	}
	public static Map<Integer, List<Person>> getPersonsByAge(List<Person> input){
    return input.stream().collect(Collectors.groupingBy(Person::getAge));
	}
}
