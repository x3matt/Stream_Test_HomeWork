import static org.junit.Assert.assertEquals;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		Address a1 = new Address("Pushkina" , 23);
		Person p1 = new Person("p1",18,a1);
		
		Address a2 = new Address("Bazarova" , 217);
		Person p2 = new Person("p2",65,a2);
		
		Address a3 = new Address("Levkina" , 2);
		Person p3 = new Person("p3",12,a3);
		
		Address a4 = new Address("Alexia" , 5);
		Person p4 = new Person("p4",32,a4);
		
		List<Person> input1 = Arrays.asList(p1,p2,p3,p4);
		
		List<Address> testv= Main.get17YOaddress(input1);
		List<Address> input2 = Arrays.asList(p1.getAddress(),p2.getAddress(),p4.getAddress());
		
		assertEquals(input2, testv);
  }
}
