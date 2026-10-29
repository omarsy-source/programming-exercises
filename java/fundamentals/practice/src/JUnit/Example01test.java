package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Example01test {
	private int[] valueList;

	@BeforeEach()
	public void start() {
		valueList = new int[2];
		valueList[0] = 5;
		valueList[1] = 8;
	}

	@Test
	// Das Ergebnis des Beispiels mit der erwarteten Bedingung vergleichen.
	public void testGetFirstElement() {

		assertEquals(5, Example01.getFirstElement(valueList));
		assertFalse(Example01.getFirstElement(valueList) == 8);

	}

	// Das Ergebnis des Beispiels mit der erwarteten Bedingung vergleichen.
	public void testGetLastElement() {
		
		assertEquals(8, Example01.getLastElement(valueList));
		assertFalse(Example01.getLastElement(valueList) == 5);
	}
}
