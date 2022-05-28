package com.simplilearn.Phase3_May_JUnit_28052022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import junit.framework.Assert;

@RunWith(JUnitPlatform.class)
public class F_RepeatedDemoTest {

	Calculator c;
	
	@BeforeEach
	void init() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(1000)
	void addNumber() {
		int actual = c.calculate(1, 2);
		Assertions.assertEquals(3, actual);
	}
}
