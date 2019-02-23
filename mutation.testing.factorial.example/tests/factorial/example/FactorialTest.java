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
		// our specification assumes that factorial.compute(4)
		// yields the correct value, i.e., 24
		// thus we must assert this induction hypothesis
		assertEquals(24, factorial.compute(4));
		// ...otherwise a mutant returning 0 will survive!
		assertEquals(5 * factorial.compute(4), factorial.compute(5));
	}

	@Test
	public void testNegativeInput() {
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
			() -> factorial.compute(-1));
		assertEquals("Negative input: -1", thrown.getMessage());
	}
}
