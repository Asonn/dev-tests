import findmaximum.Answer;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FindMaxTest {

	@Test
	public void testFindMaxPositive() {
		int testarray [] = { 1, 6, 10, 0};
		int result = Answer.findMax(testarray);
		assertEquals(result,2);
	}

	@Test
	public void testFindMaxEmpty() {
		int testarray [] = {};
		int result = Answer.findMax(testarray);
		assertEquals(result,-1);
	}

	@Test
	public void testFindMaxNullArray() {
		int testarray [] = null;
		int result = Answer.findMax(testarray);
		assertEquals(result,-1);
	}

	@Test
	public void testFindMaxNegative() {
		int testarray [] = { -11, -6, -10, -100};
		int result = Answer.findMax(testarray);
		assertEquals(result,1);
	}

	@Test
	public void testFindMaxPositiveAndNegative() {
		int testarray [] = { -11, -6, 10, -100, 50};
		int result = Answer.findMax(testarray);
		assertEquals(result,4);
	}
	
}
