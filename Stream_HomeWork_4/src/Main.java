import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {

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
		System.out.println(getBAbyPerson(input));
	}
	public static Map<Person,List<BankAccount>> getBAbyPerson(List<BankAccount> input){
		return input.stream().collect(Collectors.groupingBy(BankAccount::getOwner));
	}
}