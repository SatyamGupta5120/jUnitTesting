package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addString("We will."," Whatever it takes.");
		assertEquals("We will. Whatever it takes.",result);
	}

}
