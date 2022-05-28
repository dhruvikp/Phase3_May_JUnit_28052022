package com.simplilearn.Phase3_May_JUnit_28052022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class C_CalculatorTest {

	Calculator c;
	
	@BeforeEach
	public void init() {
		c= new Calculator();
	}
	
	@Test
	public void test() {
		// Step 1: prepare Input
		int a = 1;
		int b = 2;
		
		// Step 2: Invoke Actual Method and collect actual value
		int actual = c.calculate(a, b);
		
		// Step 3: Prepare Expected value
		int expected = 3;
		
		// Step 4: Assert Actual with Expectation
		Assertions.assertEquals(expected, actual);
	}
}
