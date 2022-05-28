package com.simplilearn.Phase3_May_JUnit_28052022;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class E_NestedTest {

	@BeforeEach
	void init() {
		System.out.println("Before Each From Outer");
	}
	
	@Nested
	class A {
		
		@BeforeEach
		void init() {
			System.out.println("Before Each From A");
		}
		
		@Test
		void test() {
			System.out.println("Test executed..");
		}
		
		@AfterEach
		void after() {
			System.out.println("After each from A");
		}
		
	}
	
	@AfterEach
	void after() {
		System.out.println("After each from OUter");
	}
}
