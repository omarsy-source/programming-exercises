package Exercise12;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.Test;

public class aufgabe02test {

	@Test
	void testDigitToWord() {
		int digitValue = 5;
		int secondDigit = 9;
		assertEquals("Fünf", Exercise02.digitToWord(digitValue));
		assertTrue("Fünf".equals(Exercise02.digitToWord(digitValue)));
		/* assertTrue() erwartet true; bei false schlägt der Test fehl. */
		assertFalse("eins".equals(Exercise02.digitToWord(digitValue)));
		/* assertFalse() erwartet false; bei true schlägt der Test fehl. */
		assertEquals("Neun", Exercise02.digitToWord(secondDigit));
		assertTrue("Neun".equals(Exercise02.digitToWord(secondDigit)));
		assertFalse("Fünf".equals(Exercise02.digitToWord(secondDigit)));
		assertEquals("404", Exercise02.digitToWord(10));

	}

	@Test
	void testNumberToWords() {
		assertEquals("EinsZweiDrei", Exercise02.numberToWords(123));
		assertTrue("ZweiDreiVier".equals(Exercise02.numberToWords(234)));
		assertFalse("VierFünfSechs".equals(Exercise02.numberToWords(345)));
		assertEquals("EinsZwei", Exercise02.numberToWords(12));
	}
}
