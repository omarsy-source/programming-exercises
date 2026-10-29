package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import examples.Example00;

class Example02Test {
	@Test
	void testListSum() {
		assertEquals(45, Example02.listSum());
		assertTrue(45 == Example02.listSum());
		assertFalse(40 == Example02.listSum());

	}

	void testLargestNumber() {
		assertEquals(9, Example02.largestNumber());
		assertTrue(9 == Example02.largestNumber());
		assertFalse(8 == Example02.largestNumber());
	}

	void testSmallestNumber() {
		assertEquals(1, Example02.smallestNumber());
		assertTrue(1 == Example02.smallestNumber());
		assertFalse(2 == Example02.smallestNumber());
	}

	void testAverage() {
		assertEquals(5, 0, Example02.average());
		assertTrue(5.0 == Example02.average());
		assertFalse(4.0 == Example02.average());

	}

}
