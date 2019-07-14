import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testing {
    @Test
	public void test() {
    	List<String> input = Arrays.asList
				("Egor","Egor","Roma","Roma","Roma","Anna","Vladislav","Dmitry");
    	List<String> testv = Main.deleteDuplicates(input);
    	List<String> testv2 = Arrays.asList("Egor","Roma","Anna","Vladislav","Dmitry");
    	
    	assertEquals(testv2, testv);
	}
}
