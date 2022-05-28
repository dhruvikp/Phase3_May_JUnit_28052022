package com.simplilearn.Phase3_May_JUnit_28052022;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class H_DynamicDemoTest {

	@TestFactory
	Collection<DynamicTest> dynamicTest() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Test1", () -> { System.out.println("Test1");} ),
				DynamicTest.dynamicTest("Test2", () -> {System.out.println("test2");})
		);
	}
}
