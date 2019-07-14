import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> input = Arrays.asList
				("Egor","Egor","Roma","Roma","Roma","Anna","Vladislav","Dmitry");
		System.out.println(deleteDuplicates(input));
	}
	public static List<String> deleteDuplicates(List<String> input){
		return input.stream().distinct().collect(Collectors.toList());
	}
}
