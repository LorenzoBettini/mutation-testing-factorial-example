package factorial.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	private Factorial factorial;

	@Before
	public void setup() {
		factorial = new Factorial();
	}

	@Test
	public void testBaseCase() {
		assertEquals(1, factorial.compute(0));
	}

	@Test
	public void testInductiveCase() {
		assertEquals(5 * factorial.compute(4), factorial.compute(5));
	}

	@Test
	public void testNegativeInput() {
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
			() -> factorial.compute(-1));
		assertEquals("Negative input: -1", thrown.getMessage());
	}
}
