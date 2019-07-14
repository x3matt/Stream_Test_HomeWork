
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		Person p1 = new Person("Ivan",10);
		Person p2 = new Person("Ian",11);
		Person p3 = new Person("Anton",19);
		Person p4 = new Person("Sergey",22);
		Person p5 = new Person("Andrew",14);
		Person p6 = new Person("Denis",18);
		List<Person> input = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		String testv = "In Germany Anton and Sergey and Denis are of legal age";
		
		assertEquals(testv, Main.solution(input));
	}
}
