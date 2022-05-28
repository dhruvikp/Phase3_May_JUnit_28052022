package com.simplilearn.Phase3_May_JUnit_28052022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_Assertion {

	@Test
	public void test() {
		
		String str1 = null;
		String str2 = "Simplilearn";
		
		Assertions.assertEquals(str1, str1);
		Assertions.assertNotEquals(str1, str2);
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
		Assertions.assertEquals(7, 7);
		
		String[] a1 = {"A","B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
	}
}
