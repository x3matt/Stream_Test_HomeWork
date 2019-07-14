import java.util.stream.IntStream;
public class Main {

	public static void main(String[] args) {
		System.out.println(isDigit("125"));
		System.out.println(isDigit("1S"));
		System.out.println(isDigit("word"));
	}
	public static boolean isDigit(String input) {
		IntStream tmp = input.chars();
		return tmp.allMatch(Character::isDigit);
	}
}
