import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testing {
    
	@Test
	public void test() {
		List<IBANN> input = Arrays.asList(
				new IBANN("DE157294")
				,new IBANN("DE657284")
				,new IBANN("DE589265")
				);
		List<String> testv = Arrays.asList("DE1*****","DE6*****","DE5*****");
		assertEquals(testv, Main.changer(input));
	}
}
