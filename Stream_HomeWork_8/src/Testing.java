import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		BankAccount b1 = new BankAccount("DE175472");
		BankAccount b2 = new BankAccount("DE276721");
		List<String> list1 = Arrays.asList(b1.getIBANN(),b2.getIBANN());
		Person p1 = new Person("Ivan",list1);
		
		BankAccount b3 = new BankAccount("DE977264");
		BankAccount b4 = new BankAccount("DE749201");
		List<String> list2 = Arrays.asList(b3.getIBANN(),b4.getIBANN());
		Person p2 = new Person("Andrew",list2);
		
		BankAccount b5 = new BankAccount("DE852640");
		BankAccount b6 = new BankAccount("DE026537");
		List<String> list3 = Arrays.asList(b5.getIBANN(),b6.getIBANN());
		Person p3 = new Person("Sergey",list3);
		
		List<Person> persons = Arrays.asList(p1,p2,p3);
		
		List<String> testv = Arrays.asList(
				"DE1*****"
				,"DE2*****"
				,"DE9*****"
				,"DE7*****"
				,"DE8*****"
				,"DE0*****"
				);
		assertEquals(testv, Main.getBA(persons));
	}
}
