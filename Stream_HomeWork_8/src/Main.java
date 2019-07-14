import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
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
		
		System.out.println(getBA(persons));
	}
	public static List<String> getBA(List<Person> input){
		//return input.stream().map(p -> Alianate(p.getBanAccounts())).collect(Collectors.toList());
		return input
				.stream()
				.flatMap(p -> alianate(p.getBanAccounts()).stream())
				.collect(Collectors.toList());
	}
	public static List<String> alianate(List<String> input) {
		List<String> tmp = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			String temp = input.get(i).substring(0,3);
			for (int j = temp.length(); j < input.get(i).length(); j++) {
				temp=temp+"*";
			}
			tmp.add(temp);
		  }
		return tmp;
		}
  }