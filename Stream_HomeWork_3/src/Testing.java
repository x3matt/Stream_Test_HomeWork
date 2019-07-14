import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Testing{

	@Test
	public void test() {
		Person p1 = new Person("p1",20);
		Person p2 = new Person("p2",21);
		Person p3 = new Person("p3",22);
		Person p4 = new Person("p4",22);
	List<Person> input = Arrays.asList(p1,p2,p3,p4);
	Map<Integer, List<Person>> testv = new HashMap<>();
	List<Person> l1 = Arrays.asList(p1);
	List<Person> l2 = Arrays.asList(p2);
	List<Person> l3 = Arrays.asList(p3,p4);
	testv.put(20, l1);
	testv.put(21, l2);
	testv.put(22, l3);
	assertEquals(testv, Main.getPersonsByAge(input));
	}
}
