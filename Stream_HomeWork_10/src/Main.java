import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan",10);
		Person p2 = new Person("Ian",11);
		Person p3 = new Person("Anton",19);
		Person p4 = new Person("Sergey",22);
		Person p5 = new Person("Andrew",14);
		Person p6 = new Person("Denis",18);
		List<Person> input = Arrays.asList(p1,p2,p3,p4,p5,p6);
		solution1(input);
	}
	public static String solution(List<Person> input){
			return	input
				.stream().filter(p -> p.getAge()>17)
				.map(Person::getName)
				.collect(Collectors.joining(" and ","In Germany "," are of legal age"));
	}
	public static void solution1(List<Person> input){
		System.out.println(input
			.stream().filter(p -> p.getAge()>17)
			.map(Person::getName)
			.collect(Collectors.joining(" and ","In Germany "," are of legal age")));
}
}
