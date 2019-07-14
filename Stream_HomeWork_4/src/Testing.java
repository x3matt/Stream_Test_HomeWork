import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		Person p1 = new Person("Ivan");
		Person p2 = new Person("Andy");
		Person p3 = new Person("Sergey");
		Person p4 = new Person("Denis");
		BankAccount b1 = new BankAccount("DE152545",p1);
		BankAccount b2 = new BankAccount("DE156644",p2);
		BankAccount b3 = new BankAccount("DE195768",p3);
		BankAccount b4 = new BankAccount("DE548266",p4);
		BankAccount b5 = new BankAccount("DE548267",p4);
		List<BankAccount> input = Arrays.asList(b1,b2,b3,b4,b5);
		
		Map<Person,List<BankAccount>> testv = new HashMap<>();
		List<BankAccount> l1 = Arrays.asList(b3);
		List<BankAccount> l2 = Arrays.asList(b4,b5);
		List<BankAccount> l3 = Arrays.asList(b2);
		List<BankAccount> l4 = Arrays.asList(b1);
		testv.put(p1, l4);
		testv.put(p2, l3);
		testv.put(p3, l1);
		testv.put(p4, l2);
		
		assertEquals(testv, Main.getBAbyPerson(input));
	}
}
