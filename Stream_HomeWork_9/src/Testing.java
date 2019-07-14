import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		Person p1 = new Person("Ivan",18);
		Person p2 = new Person("Andrew",10);
		Person p3 = new Person("Sergey",14);
		Person p4 = new Person("Anna",22);
		Person p5 = new Person("Maria",12);
		List<Person> input = Arrays.asList(p1,p2,p3,p4,p5);
		
		int testv=40;
		assertEquals(testv, Main.solution(input));
	}
}
