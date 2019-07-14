import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<IBANN> input = Arrays.asList(
				new IBANN("DE157294")
				,new IBANN("DE657284")
				,new IBANN("DE589265")
				);
		System.out.println(changer(input));
	}
	public static List<String> changer(List<IBANN> input){
	return input.stream().map(a -> alianate(a)).collect(Collectors.toList());
	}
	public static String alianate(IBANN input) {
		String tmp = input.getIBANN().substring(0,3);
		for (int i = tmp.length(); i < input.getIBANN().length(); i++) {
			tmp=tmp+"*";
		}
		return tmp;
	}
}
