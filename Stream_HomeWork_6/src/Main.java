import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		String input = "Aa Aa Aa Bb bb";
		System.out.println(wordCount(input, "A"));
	}
	public static Long wordCount(String input,String symbol) {
		List<String> tmp = Arrays.asList(input.split(" "));
		return tmp
				.stream()
				.map(a -> changer(a))
				.filter(b -> b[0].equals(symbol)).count();
	}
	public static String[] changer(String input) {
		String[] tmp = input.split("");
		return tmp;
	}
}
