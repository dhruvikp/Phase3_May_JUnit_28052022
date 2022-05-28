package com.simplilearn.Phase3_May_JUnit_28052022;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class G_DependencyInjection {
	@Test
	@DisplayName("Test 1")
	void test(TestInfo testInfo, TestReporter testReporter) {
		System.out.println(testInfo.getDisplayName());
		testReporter.publishEntry(testInfo.getDisplayName());
	}

}
