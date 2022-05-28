package com.simplilearn.Phase3_May_JUnit_28052022;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("LifeCycleTest")
public class A_LifeCycleAnnotations {
	@BeforeAll
	static void initAll() {
		System.out.println("Before ALL............");
	}
	
	@BeforeEach
	void init() {
		System.out.println("Before Each Testcase....");
	}
	
	@Test
	@DisplayName("This is Success Test 1")
	void successTest() {
		System.out.println("Actual Testcase execution..");
	}
	
	@Test
	@DisplayName("This is Success Test 2")
	void successTest1() {
		System.out.println("Actual Testcase2 execution..");
	}
	
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each Testcase....");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All ............");
	}
}
