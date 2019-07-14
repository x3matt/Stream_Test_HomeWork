import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {

	@Test
	public void test1() {
		String input ="125";
		assertEquals(true, Main.isDigit(input));
	}
	@Test
	public void test2() {
		String input ="12S";
		assertEquals(false, Main.isDigit(input));
	}
	@Test
	public void test3() {
		String input ="word";	
		assertEquals(false, Main.isDigit(input));
	}
}
