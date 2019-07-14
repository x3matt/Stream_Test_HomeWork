import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan",18);
		Person p2 = new Person("Andrew",10);
		Person p3 = new Person("Sergey",14);
		Person p4 = new Person("Anna",22);
		Person p5 = new Person("Maria",12);
		List<Person> input = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(solution(input));
	}
	public static int solution(List<Person> input) {
		return input.stream().map(Person::getAge).filter(a -> a>17).reduce(0,(a,b) -> a+b);
	}
}
