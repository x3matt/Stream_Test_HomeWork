import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {

	@Test
	public void test1() {
		String input = "Aa Aa Aa Bb bb";
		Long testv = 3l;
		Long i = Main.wordCount(input, "A");
		assertEquals(testv,i);
	}
	@Test
	public void test2() {
		String input = "Aa Aa Aa Bb bb";
		Long testv = 1l;
		Long i = Main.wordCount(input, "b");
		assertEquals(testv,i);
	}
	@Test
	public void test3() {
		String input = "Aa Aa Aa Bb bb";
		Long testv = 0l;
		Long i = Main.wordCount(input, "a");
		assertEquals(testv,i);
	}
}
