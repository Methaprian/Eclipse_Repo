package com.trello.testingbytestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupExecution_01_TestNG {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before_Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before_Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before_Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before_Method");
	}@Test
	public void testCaseMethod() {
		System.out.println("Test_Case_Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After_Method");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After_Test");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After_Class");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After_Suite");
	}
}
