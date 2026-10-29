package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Example00test {

	@Test
	void testResult() {
		assertEquals(15, Example00.multiplication(5));
		assertEquals ( 10 , Example00.multiplication(1));
		assertTrue ( 8 == Example00.multiplication(1));
	}

}
