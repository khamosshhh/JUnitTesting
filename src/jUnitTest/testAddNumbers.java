package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int result  = junit.AddNumbers(100, 200);
		assertEquals (300, result);
	}

}
