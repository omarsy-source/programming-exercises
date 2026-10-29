package JUnit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import examples.Example00;

class ExampleThrowasserttest {

	@Test
	void testGetFirstElement() {
		int [] valueList = new int [2];
		valueList [0] = 5;
		valueList [1] = 8;
		assertEquals (5 , ExampleThrowassert.getFirstElement(valueList));
		int []secondValueList = null;
		NullPointerException error = assertThrows (NullPointerException.class, ()-> {ExampleThrowassert.getFirstElement(secondValueList);});
		assertEquals( "Leer!" , error.getMessage());
		}

}
